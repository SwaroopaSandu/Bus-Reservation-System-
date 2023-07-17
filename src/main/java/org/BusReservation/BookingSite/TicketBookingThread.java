package org.BusReservation.BookingSite;

public class TicketBookingThread extends Thread {

    private TicketCounter ticketCounter;
    private String passengerName;

    private int noOfSeatsToBook;

    public TicketBookingThread(TicketCounter ticketCounter, String passengerName,int noOfSeatsBook){
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.noOfSeatsToBook = noOfSeatsBook;
    }

    public void run(){
        ticketCounter.bookTicket(passengerName,noOfSeatsToBook);
    }

}
