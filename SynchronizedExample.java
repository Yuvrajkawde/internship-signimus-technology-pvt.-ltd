package com.multiThread;


class TicketCounter {
    private int availableTicket = 5;

    public synchronized void bookTicket(String passengerName, int numberOfTicket) {

        if (availableTicket >= numberOfTicket) {
            System.out.println(passengerName + ", your ticket has been booked " + numberOfTicket + " tickets");
            availableTicket -= numberOfTicket;
        }else{
            System.out.println(passengerName + ", your tickets are not booked. because insufficient tickets");
        }

        System.out.println("now available tickets are: " + availableTicket);
    }

    public synchronized void addTicket(int nuberOfTicket){
        availableTicket +=nuberOfTicket;
        System.out.println("Added "+ nuberOfTicket+" more tickets, now available tickets are: "+ availableTicket);
    }


}

class Passenger extends Thread {
    private String name;
    private int numberOfTicket;
    private TicketCounter counter;

    public Passenger(String name, int numberOfTicket,TicketCounter ticketCounter) {
        this.name = name;
        this.numberOfTicket = numberOfTicket;
        this.counter = ticketCounter;
    }


    //
    public void run() {
        counter.bookTicket(name, numberOfTicket);
    }


}

public class SynchronizedExample {
    public static void main(String... args) throws InterruptedException {
//        only one time ticket counter object created
        TicketCounter ticketCounter = new TicketCounter();

        Passenger p1 = new Passenger("yuvraj", 2, ticketCounter);
        Passenger p2 = new Passenger("ravi", 2, ticketCounter);
        Passenger p3 = new Passenger("rohit", 3, ticketCounter);


        p1.start();
        p2.start();
        p3.start();

        Thread.sleep(2000);
        ticketCounter.addTicket(4);


    }
}