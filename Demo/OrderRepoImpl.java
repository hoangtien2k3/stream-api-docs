package Demo;

public class OrderRepoImpl {
    @Override
    public List<Orders> findOrdersCAByStateAndBpState(Long numberOfDay, String orderType, Date minDate, List<String> lstBpState) {
        if (Dataltil.isNullorZero(number0fDay) || DataUtil.isNullOrEmpty(IstBpState)) {
            return null;
        }
        if (minDate == null) {
            return null;
        }
        StringBuilder builder = new StringBuilder(" SELECT * ")
                .append(" FROM BCCS_ORDER.ORDERS 0");
        if (!DataUtil.isNullOrEmpty(orderType)) {
            builder.append(" JOIN BCCS_ORDER.ORDER_TYPE ot ON o.ORDER_TYPE_ID = ot.ORDER_TYPE_ID");
        }
        builder.append(" WHERE o.STATE = 1 ");
        builder.append(" AND o.CREATE_DATE < (SYSDATE - #numberofDay) "); // hết 7 ngày
        builder.append(" AND o.CREATE_DATE > #minDate "); // lớn hơn ngày giới hạn
        builder.append(" AND o.BP_STATE ");
        builder.append(DbUtil.createInquery("lstBpState", lstBpState));
        if (!DataUtil.isNullOrEmptyCcs(orderType)) {
            builder.append(" AND ot.CODE =#otCode ");
        }

        Query query = em.createNativequery(builder.tostring, Orders.class);
        query.setParameter("numberOfDay", number0fDay);
        query.setParameters("minDate", minDate);
        if (!DataUtil.isNullOrEmpty(orderType)) {
        query.setParameters("otCode", orderType);
        DbUtil.setParamInquery(query,"LstBpState",lstBpState);
        return query.getResultList();
    }
}
