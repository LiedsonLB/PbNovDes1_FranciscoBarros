package org.scenery2.model;

public class Gondola {
    private int num;
    private Person seat1;
    private Person seat2;

    public Gondola(int num) {
        this.num = num;
        this.seat1 = null;
        this.seat2 = null;
    }

    public int getNum() {
        return num;
    }

    public boolean addPassenger(Person passenger) {
        return false;
    }
}
