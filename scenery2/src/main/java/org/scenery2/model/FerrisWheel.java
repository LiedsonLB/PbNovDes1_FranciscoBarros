package org.scenery2.model;

import org.scenery2.exception.FatherIsNotPresent;

import java.util.List;

public class FerrisWheel {
    private List <Gondola> gondolas;

    public void board(int gondolaNum, Person... persons) {
        Gondola gondola = findGondola(gondolaNum);
        if (gondola == null) {
            System.out.println("Gondola not found.");
            return;
        }

        for (Person person : persons) {
            if (person instanceof Child) {
                Child child = (Child) person;
                // Se a criança tem menos de 12 anos, deve estar acompanhada pelo pai
                if (child.getAge() < 12 && child.getFather() == null) {
                    System.out.println(child.getName() + " cannot board without a father.");
                    continue; // Pula a criança que não pode embarcar
                }
            }

            if (gondola.addPassenger(person)) {
                System.out.println(person.getName() + " boarded gondola " + gondola.getNum());
            } else {
                System.out.println("Gondola " + gondola.getNum() + " is full.");
            }
        }
    }
    public void status() {
        for (Gondola gondola : gondolas) {
            System.out.println("Gondola " + gondola.getNum() + " - Seat1: " + gondola.getSeat1() + ", Seat2: " + gondola.getSeat2());
        }
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
