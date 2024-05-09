package com.thread;

public class WriteWriteRace {
    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(()->{
            for(int i=0;i<10000;i++){
                count=1;
            }
        });

        Thread thread2 = new Thread(()->{
            for (int i=0;i<10000;i++){
                count=2;
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Counter value "+count);
    }
}
