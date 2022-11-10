package com;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadId {
    static int id=0;

    public static int get() {
        return id;
    }

    public static void inc(){
        id++;
    }
}
