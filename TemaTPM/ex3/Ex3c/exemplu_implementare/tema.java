package com;

import static java.lang.Thread.sleep;

public class tema {
    public static void main(String[] args) {
        ShadyChoice test = new ShadyChoice();
        int n = 10;
        Thread thread[] = new Thread[10];

        for (int i = 0; i < n; i++) {
            thread[i] = new Thread(new MyThread(test), "Thread" + i);
        }

        for(int i=0; i<n; i++){
            thread[i].start();
        }
    }
}
