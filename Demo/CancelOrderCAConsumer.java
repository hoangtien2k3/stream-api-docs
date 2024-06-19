package Demo;

public class CancelOrderCAConsumer extends Consumer<Order> {

    @Autowired
    private OrderStaffservice orderStaffservice;
    @Autowired
    private CancelOrderService cancelOrderService;
    @Autowired
    private SendSmsService sendSmsService;
    @Autowired
    @Qualifier ("nuntimeSenvicev2")
    private Runtimeservice runtimeServicev2;
    @Autowired
    private OrdersRepo ordersRepo;

    private statio Objecthapper objecthapper = ObjecthapperFactory-getInstane();
    private String minofDay; // ngay gioi han don hang
    @Override
    public void init() throws Exception {
    }


    @override
    @Transactional(rollbackFor = Exception.class)
    public void process (Orders orders) throws Exception {
        try {
            if (DataUtil.isNullOrEmpty(min0fDay)) {
                return;
            }
            //lay thong tin ma don hang
            String bpId = orders.getBpIdO;
            Date minDate = DateUtil.string2DateByPattern(min0fDay,Const.Common.PATTERN_YYYYMMDDHHMMSS);
            if (Corders.getCreateDate().compareTo(minDate) < 0) {
                return;
            }
            try {
                ProcessInstance processInstance = runtimeServiceV2.createProcessInstanceQuery().processInstanceId(pro)
                if (processInstance!= null) {
                    cancelOrderService.cancelOrder(bpId, CancelOrderService. CANCEL_BY_SYS);
                } else {
                    ordersRepo. updateCancel (bpId);
                    if (!DataUtil.isNullOrEmpty(orders.getParentBpId()) {
                        ordersRepo. updateCancel(orders.getParentBpId();
                    }
                }
            } catch (Exception e) {
                return;
            }
            OrderDTO orderDTO = objectMapper.readvalue(orders.getData, OrderDTO.class);
            //lay thong tin khach hang
            CustomerDTO customerDTO = orderDTO. getCustomer;
            if (customerDTO == null) {
                return;
            }
            //lay thong tin so dien thoai khach hang
            String isdn = customerDTO.getTelMobile();
            String target = orders.getTarget();
            String targetSMS = DataUtil.isNullOrEmpty(target) ? Const.SMS_CONTENT.TARGET_OMNI: target;
            //nhan tin cho khach hang
            SmsSendingInfoDTO smsContentCus = sendSmsService.getSHSContent( smsCode: sms. noti. customer.cancel. ca.exp
            if (!DataUtil.isNullOrEmpty(isdn) && smsContentCus != null && !DataUtil.isNullOrEmpty(smsContentCus)) {
                sendSmsService.createAndSaveSms(isdn, smsContentCus, bpId);
            }
            //lay thong tin nhan vien
            Staff staff = orderStaffService. findstaffExecute( bpId);
            if (staff == null) {
                return;
            }
            // lay thong tin so dien thoai nhan vien
            String staffIsdn = staff.getTell();
            //nhan tin cho nhan vien
            SmsSendingInfoDTO smsContentAM = sendSmsService.getsMSContent (sms.noti.staff.cancel);
            if (!DataUtil.isNullOrEmpty(staffIsdn) && smsContentAM != null && !DataUtil.isNutlOrEnpty(smsContentAM)) {
                sendSmsService.createAndSaveSms(staffIsdn, smsContentAM, bpId);
            }

        }catch (Exception e) {
            logger.error("Loi huy don hang CA", e);
        }
    }
}

