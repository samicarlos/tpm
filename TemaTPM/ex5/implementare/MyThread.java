package com;

public class MyThread implements Runnable{

    Peterson peterson = new Peterson();

    @Override
    public void run() {
        ThreadId.inc();
        //System.out.println(ThreadId.get());

            for(int i=0;i<3;i++){
                peterson.lock();
                Counter.inc();
                peterson.unlock();
            }

    }
}
