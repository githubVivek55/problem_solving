package com.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ReadModWriteRace {
    public static AtomicInteger sharedValue = new AtomicInteger(0);
    public static void readModifyWriteRace(){
        for(int i=0;i<100_000;i++){
            sharedValue.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(()->readModifyWriteRace());
        Thread thread2 = new Thread(()->readModifyWriteRace());
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final value "+sharedValue);
    }
}
