package com;

class ShadyChoice {
    private boolean getWhite = false;
    private int last = 0;

    public String choose() {
        int me = ThreadId.get();
        last = me;
        if (getWhite)
            return "white";
        getWhite = true;

        if (last == me)
            return "red";
        else
            return "black";
    }
}