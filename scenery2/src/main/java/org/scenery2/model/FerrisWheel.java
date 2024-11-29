package org.scenery2.model;

import org.scenery2.exception.FatherIsNotPresent;

import java.util.List;

public class FerrisWheel {
    private List <Gondola> gondolas;

    public void board(int gondolaNum, Person... persons) {

    }

    public Gondola findGondola(int gondolaNum) {
        for (Gondola gondola : gondolas) {
            if (gondola.getNum() == gondolaNum) {
                return gondola;
            }
        }
        return null;
    }

    public void status() {

    }
}
