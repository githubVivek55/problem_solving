package com.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();

        reentrantLock.lock();
        reentrantLock.lock();

        System.out.println(reentrantLock.isLocked());
        System.out.println(reentrantLock.getHoldCount());

        reentrantLock.unlock();
        System.out.println(reentrantLock.getHoldCount());
    }
}
