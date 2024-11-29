package org.scenery2.model;

public class Child extends Person {
    private Adult father;

    public Child(String name, int age, Adult father) {
        super(name, age);
        this.father = father;
    }

    public Child(String name, int age) {
        super(name, age);
        this.father = null;
    }

    public Adult getFather() {
        return father;
    }
}
