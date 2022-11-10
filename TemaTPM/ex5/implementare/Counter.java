package com;

public class Counter {
    static int id=0;

    public static int get() {
        return id;
    }

    public static void inc(){
        id++;
    }
}
