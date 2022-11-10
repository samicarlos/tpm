package com;

import static java.lang.Thread.sleep;

public class tema {
    public static void main(String[] args) {
        int n = 4;
        Thread thread[] = new Thread[100];

        for (int i = 0; i < n; i++) {
            thread[i] = new Thread(new MyThread(), "Thread" + i);
        }

        for(int i=0; i<n; i++){
            thread[i].start();
        }

        for(int i=0;i<n;i++){
            try {
                thread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Counter.get());
    }
}
