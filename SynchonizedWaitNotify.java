package com.multiThread;



class TicketCounter3 {
    private int availableTicket = 5;

    public synchronized void bookTicket(String passengerName, int numberOfTicket) throws InterruptedException {


        while (availableTicket < numberOfTicket) {
            System.out.println("Not enough tickets available for " + passengerName + " so kindly wait");
            wait(); // lock & wait
        }


        System.out.println(passengerName + ", your ticket has been booked " + numberOfTicket + " tickets");
        availableTicket -= numberOfTicket;


        System.out.println("now available tickets are: " + availableTicket);
    }

    public synchronized void addTicket(int nuberOfTicket) {
        availableTicket += nuberOfTicket;
        System.out.println("Added " + nuberOfTicket + " more tickets, now available tickets are: " + availableTicket);
        notifyAll(); //notify all the threads that tickets are available.
    }

}

class Passenger3 extends Thread {
    private String name;
    private int numberOfTicket;
    private TicketCounter3 counter;

    public Passenger3(String name, int numberOfTicket, TicketCounter3 ticketCounter) {
        this.name = name;
        this.numberOfTicket = numberOfTicket;
        this.counter = ticketCounter;
    }


    //
    public void run() {
        try {
            counter.bookTicket(name, numberOfTicket);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}

public class SynchonizedWaitNotify {
    public static void main(String... args) throws InterruptedException {
        //        only one time ticket counter object created
        TicketCounter3 ticketCounter3 = new TicketCounter3();

        Passenger3 p1 = new Passenger3("yuvraj", 2, ticketCounter3);
        Passenger3 p2 = new Passenger3("ravi", 2, ticketCounter3);
        Passenger3 p3 = new Passenger3("rohit", 3, ticketCounter3);


        p1.start();
        p2.start();
        p3.start();

        Thread.sleep(10000);

        ticketCounter3.addTicket(4);


    }
}
