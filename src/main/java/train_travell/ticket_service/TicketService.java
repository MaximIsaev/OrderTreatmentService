package train_travell.ticket_service;


import train_travell.document.Ticket;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class TicketService {

    @WebMethod(operationName = "sayHello")
    public void reserve() {
//        Ticket ticket = new Ticket();

    }

//    Ticket ticket = new Ticket();
}
