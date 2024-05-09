package com.thread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private int data = 1;

    public void write(int newData){
        readWriteLock.writeLock().lock();
        data=newData;
        System.out.println(Thread.currentThread().getName()+" wrote data"+ newData);
        readWriteLock.writeLock().unlock();
    }

    public int read(){
        readWriteLock.readLock().lock();
        System.out.println(Thread.currentThread().getName()+" read data "+data);
        readWriteLock.readLock().unlock();
        return data;
    }

    public static void main(String[] args) {
        ReadWriteLockExample readWriteLockExample = new ReadWriteLockExample();
        for (int i=0;i<3;i++){
            Thread readThread = new Thread(()->{
                for(int j=0;j<3;j++){
                    readWriteLockExample.read();
                }
            },"Reader"+i);
            readThread.start();
        }
        for (int i=0;i<3;i++){
            Thread writeThread = new Thread(()->{
                for(int j=0;j<3;j++){
                    readWriteLockExample.write(j);
                }
            },"Writer"+i);
            writeThread.start();
        }
    }
}
