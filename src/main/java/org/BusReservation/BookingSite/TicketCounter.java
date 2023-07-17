package org.BusReservation.BookingSite;

public class TicketCounter {

    private int availableSeats = 3;

    public synchronized void bookTicket(String pname,int numberOfSeats){
        if((availableSeats >= numberOfSeats) && numberOfSeats>0){
            System.out.println("Hey " + pname+" : "+ numberOfSeats+" Seats booked successfully!");
            availableSeats = availableSeats - numberOfSeats;
        }
        else {
            System.out.println("Hey "+pname+" Sorry, Seats not available!");
        }
    }

}
