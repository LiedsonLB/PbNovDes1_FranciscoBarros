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

    public Person getSeat1() {
        return seat1;
    }

    public Person getSeat2() {
        return seat2;
    }

    public boolean addPassenger(Person passenger) {
        if (seat1 == null) {
            seat1 = passenger;
            return true;
        } else if (seat2 == null) {
            seat2 = passenger;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return seat1 != null && seat2 != null;
    }
}
