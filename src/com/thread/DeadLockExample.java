package com.thread;

public class DeadLockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
           synchronized (lock1){
               System.out.println("thread 1 acquired lock one");
               try{
                   Thread.sleep(2000);
               }catch (InterruptedException ex){
                   ex.printStackTrace();
               }
               System.out.println("thread 1 waiting for lock 2");
               synchronized (lock2){
                   System.out.println("thread 1 acquired lock 2");
               }
           }
        });

        Thread thread2 = new Thread(()->{
            synchronized (lock2){
                System.out.println("thread 2 acquired lock two");
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                System.out.println("thread 2 waiting for lock 1");
                synchronized (lock1){
                    System.out.println("thread 2 acquired lock 1");
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
