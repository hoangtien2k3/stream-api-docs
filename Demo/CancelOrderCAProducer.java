package Demo;

public class CancelOrderCAProducer extends QuartzProducer<Orders> {
    private OrderService orderService;
    private OrdSysConfigRepo ordSysConfigRepo;
    private String minOfDay;
    private ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    @Override
    public void process() throws Exception {
        if (DataUtil.isNullOrEmpty(minOfDay)) {
            return;
        }
        Date minDate = DateUtil.string2DateByPattern(minOfDay, Const.Common.PATTERN_YYYYMMDDHHMMSS);
        List<String> lstBpState = ordSysConfigRepo.getListValueBySplitter(Const.OrdSysCfg.LIST_BP_STATE_CANCEL_CA_CONFIG, ...);
        if (DataUtil.isNullOrEmpty(lstBpState)) {
            return;
        }
        List<Orders> lstOrders = orderService.findOrdersCAByStateAndBpState(7L, OrderType.ORD_TYPE_CONFIG, minDate, lstBpState);
        if (DataUtil.isNullOrEmpty(lstOrders)) {
            return;
        }
        for (Orders orders : lstOrders) {
            while (!enqueue(orders)) {
                Thread.sleep(1000);
            }
        }
    }

}