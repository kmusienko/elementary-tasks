package com.softserve.edu.task2;

public class Envelop {
    private double aSide;
    private double bSide;

    public Envelop(double aSide, double bSide) {
        if(isValidEnvelop(aSide, bSide)) {
            this.aSide = aSide;
            this.bSide = bSide;
        } else {
            throw new IllegalArgumentException("Incorrect input!");
        }
    }
    public double getaSide() {
        return aSide;
    }

    public double getbSide() {
        return bSide;
    }

    /**
     * Checks if envelop is valid.
     * @param aSide - one side of envelop
     * @param bSide - other side of envelop
     * @return boolean value (true or false)
     */
    public boolean isValidEnvelop(double aSide, double bSide) {
        if (aSide <= 0 || bSide <= 0) {
            return false;
        }
        return true;
    }

}
