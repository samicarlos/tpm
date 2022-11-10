package com;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable{
    private ShadyChoice test;
    private Lock myLock=new ReentrantLock();

    MyThread(ShadyChoice tr){
        test = tr;
    }
    @Override
    public void run() {
        myLock.lock();
        ThreadId.inc();
        myLock.unlock();
        System.out.println(ThreadId.get() + " " + test.choose()); //Thread.currentThread().getId()
    }
}
