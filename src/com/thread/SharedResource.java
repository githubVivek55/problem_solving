package com.thread;

public class SharedResource {
    private int count =0;

    public synchronized void increment(){
        count++;
        System.out.println(Thread.currentThread().getName()+" increment count to: "+count);
    }
    public synchronized void decrement(){
        count--;
        System.out.println(Thread.currentThread().getName()+" decrement count to "+count);
    }

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        for (int i=0;i<3;i++){
            new Thread(()->{
                sharedResource.increment();
                sharedResource.decrement();
            }).start();
        }
    }
}
