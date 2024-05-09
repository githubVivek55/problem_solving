package com.thread;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    static Queue<Integer> buffer = new LinkedList<>();
    static int maxSize = 5;


    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (buffer) {
                    while (buffer.size() == maxSize) {
                        try {
                            System.out.println("Buffer is full, waiting");
                            buffer.wait();
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                    buffer.add(i);
                    System.out.println("Produced " + i);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                    buffer.notifyAll();
                }
            }
        }, "Producer");

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 10; i--) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            System.out.println("buffer is empty");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    Integer remove = buffer.remove();
                    System.out.println("consumed" + remove);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                    buffer.notifyAll();
                }
            }
        }, "Consumer");

        producer.start();
        consumer.start();

    }
}
