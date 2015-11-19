package train_travell.document;

import train_travell.passenger.Human;
import train_travell.cash.Money;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Ticket {

    private static List<Ticket> tickets = new ArrayList<>();

    private long id;
    private String fromTown;
    private String toTown;
    private Calendar startTime;
    private Calendar endTime;
    private Money Cost;
    private boolean reserved = false;
    private boolean paid = false;
    private Human passenger;


    public long reserve(Human passenger) {

        this.passenger = passenger;
        id = Math.abs((long) (Math.random() * 100000));
        reserved = true;
//        Ticket.tickets.add()
        return id;

    }

    public Ticket getTicketById(long number) {

        if (tickets.size() != 0) {
            for (Ticket ticket : tickets) {
                if (ticket.id == number) {
                    return ticket;
                }
            }
        } else {
            System.out.println("Ticket not found");
        }
        return null;
    }

    public boolean payTicket(int number) {
        if (tickets.size() != 0) {
            for (Ticket ticket : tickets) {
                if (ticket.id == number && ticket.reserved) {
                    ticket.paid = true;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean returnTicket(Human passenger, long number) {

        if (tickets.size() != 0) {
            for (Ticket ticket : tickets) {
                if (ticket.passenger == passenger && ticket.id == number) {
                    tickets.remove(ticket);
                    return true;
                }
            }
        }
        return false;
    }


}
