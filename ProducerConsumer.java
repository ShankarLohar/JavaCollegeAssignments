// 20BAI10040 Shankar Lohar CSE3002

import java.util.ArrayList;

class PC {
    // Using Arraylist as the problem states
    ArrayList<Integer> list = new ArrayList<>();
    // As given problem states maximum of 3 jobs
    int capacity = 3;

    // Function called by producer thread
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                // producer thread waits while list
                // is full
                while (list.size() == capacity)
                    wait();

                System.out.println("Producer produced-"
                        + value);

                // to insert the jobs in the list
                list.add(value++);

                // notifies the consumer thread that
                // now it can start consuming
                notify();

                // makes the working of program easier
                // to understand
                Thread.sleep(1000);
            }
        }
    }

    // Function called by consumer thread
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                // consumer thread waits while list
                // is empty
                while (list.size() == 0)
                    wait();

                // to retrieve the first job in the list
                int val = list.remove(0);

                System.out.println("Consumer consumed-"
                        + val);

                // Wake up producer thread
                notify();

                // and sleep
                Thread.sleep(1000);
            }
        }
    }
}



public class ProducerConsumer {
    public static void main(String[] args)
            throws InterruptedException {
        // Object of a class that has both produce()
        // and consume() methods
        final PC pc = new PC();

        // Create producer thread
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create consumer thread
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        producerThread.start();
        consumerThread.start();

        // t1 finishes before t2
        producerThread.join();
        consumerThread.join();
    }
}
