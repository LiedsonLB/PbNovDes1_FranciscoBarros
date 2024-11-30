package org.scenery2.model;

import java.util.ArrayList;
import java.util.List;

public class FerrisWheel {
    private List<Gondola> gondolas;

    public FerrisWheel() {
        gondolas = new ArrayList<>();

        for (int i = 1; i <= 18; i++) {
            gondolas.add(new Gondola(i));
        }
    }

    public void board(int gondolaNum, Person... persons) {
        Gondola gondola = findGondola(gondolaNum);
        if (gondola == null) {
            System.out.println("Gondola not found.");
            return;
        }

        for (Person person : persons) {
            if (person instanceof Child) {
                Child child = (Child) person;

                if (child.getAge() < 12) {
                    boolean fatherPresent = false;
                    for (Person p : persons) {
                        if (p instanceof Adult && p.getName().equals(child.getFather().getName())) {
                            fatherPresent = true;
                            break;
                        }
                    }

                    if (!fatherPresent) {
                        return;
                    }
                }
            }
        }

        for (Person person : persons) {
            gondola.addPassenger(person);
        }
    }

    public void status() {
        System.out.println("Gondola status");
        System.out.println("-".repeat(35));
        for (Gondola gondola : gondolas) {
            if (gondola.getSeat1() != null && gondola.getSeat2() != null) {
                System.out.println(gondola.getNum() + " " + gondola.getSeat1().getName() + " and " + gondola.getSeat2().getName());
            } else if (gondola.getSeat1() != null) {
                System.out.println(gondola.getNum() + " Only " + gondola.getSeat1().getName());
            } else {
                System.out.println(gondola.getNum() + " (empty)");
            }
        }
        System.out.println("-".repeat(35));
    }

    public Gondola findGondola(int gondolaNum) {
        for (Gondola gondola : gondolas) {
            if (gondola.getNum() == gondolaNum) {
                return gondola;
            }
        }
        return null;
    }
}