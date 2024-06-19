package Demo;

@Webservice
public interface OrderService {

    /*
    * tim kiem don hang CA theo state
    * */
    @WebMethod
    List<Order> findOrdersCAByStateAndBpState(@WebParam(name = "numberOfDay") Long numberOfDay,
                                              @WebParam(name = "orderType") OrderType orderType,
                                              @WebParam(name = "minDate") Date minDate,
                                              @WebParam(name = "lstBpState") List<String> lstBpState);

}
