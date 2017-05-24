package com.softserve.edu.task3.model;

/**
 * Created by Kostya on 23.05.2017.
 */
public class Triangle {

    private String name;
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(String name, double aSide, double bSide, double cSide) {
        this.name = name;
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public double getSquare() {
        double p = (aSide + bSide + cSide)/2;
        return Math.sqrt(p*(p-aSide)*(p-bSide)*(p-cSide));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getaSide() {
        return aSide;
    }

    public void setaSide(double aSide) {
        this.aSide = aSide;
    }

    public double getbSide() {
        return bSide;
    }

    public void setbSide(double bSide) {
        this.bSide = bSide;
    }

    public double getcSide() {
        return cSide;
    }

    public void setcSide(double cSide) {
        this.cSide = cSide;
    }

}
