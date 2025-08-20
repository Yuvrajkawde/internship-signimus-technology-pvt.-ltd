package com.multiThread;


class TicketCounter2 {

    private int availableTicket = 5;

   public synchronized void  bookTicket(String passengerName, int numberOfTicket){

       if(availableTicket>= numberOfTicket){
           System.out.println(numberOfTicket+" Tickets Booked for " + passengerName);
         availableTicket -= numberOfTicket;
       }else {
            System.out.println("Insufficient  Tickets  for " + passengerName+" trying to book " +numberOfTicket + " available "+ availableTicket);
       }

    }

    public synchronized void addTicket(int numberOfTicket){
       availableTicket += numberOfTicket;
        System.out.println(numberOfTicket +" Tickets added now available tickets are "+ availableTicket);
    }


}

class Passenger2  extends Thread{

    private String passengerName;
    private int numberOfTicket;
    private TicketCounter2 counter;

    public Passenger2(String passengerName, int numberOfTicket, TicketCounter2 counter) {
        this.passengerName = passengerName;
        this.numberOfTicket = numberOfTicket;
        this.counter = counter;
    }

    public void run(){
        counter.bookTicket(passengerName,  numberOfTicket);
    }

}

public class SynchronizedExample2 {
    public static void main(String... args) throws InterruptedException {
//        only one time ticket counter object created
        TicketCounter2 ticketCounter = new TicketCounter2();
        Passenger2 p1 = new Passenger2("yuvraj", 2, ticketCounter);
        Passenger2 p2 = new Passenger2("ravi", 2, ticketCounter);
        Passenger2 p3 = new Passenger2("rohit", 3, ticketCounter);

        p1.start();
        p2.start();
        p3.start();

        Thread.sleep(2000);
        ticketCounter.addTicket(4);
    }
}