package org.BusReservation.BookingSite;

 class Main {
    public static void main(String[] args) {


          TicketCounter ticketCounter = new TicketCounter();
          TicketBookingThread t1 = new TicketBookingThread(ticketCounter,"RAM",2);
          TicketBookingThread t2 = new TicketBookingThread(ticketCounter,"SAI",2);


          t1.start();
          t2.start();

    }
}





