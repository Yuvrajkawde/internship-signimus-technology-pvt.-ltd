package com.multiThread;

class SharedResource {
    private int data;
    private boolean hasData = false; // flag to check if data is available

    // Producer puts data
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // wait until data is consumed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        System.out.println("Produced: " + value);
        hasData = true;
        notify(); // wake up one waiting consumer
    }

    // Consumer takes data
    public synchronized void consume() {
        while (!hasData) {
            try {
                wait(); // wait until data is produced
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); // wake up one waiting producer
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.produce(i);
                try { Thread.sleep(500); } catch (InterruptedException ignored) {}
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.consume();
                try { Thread.sleep(500); } catch (InterruptedException ignored) {}
            }
        });

        producer.start();
        consumer.start();
    }
}
