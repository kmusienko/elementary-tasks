package com.softserve.edu.task3.model;

import com.softserve.edu.task3.exception.NotValidTriangleException;

import java.util.Objects;

public class Triangle {

    private String name;
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(String name, double aSide, double bSide, double cSide) {
        if (isValidTriangle(aSide, bSide, cSide)) {
            this.name = name;
            this.aSide = aSide;
            this.bSide = bSide;
            this.cSide = cSide;
        } else {
            throw new NotValidTriangleException();
        }
    }

    /**
     * Checks if triangle is valid.
     *
     * @param aSide - first triangle's side.
     * @param bSide - second triangle's side.
     * @param cSide - third triangle's side.
     * @return - boolean value(true or false)
     */

    public boolean isValidTriangle(double aSide, double bSide,
                                          double cSide) {
        if (aSide <= 0 || bSide <= 0 || cSide <= 0) {
            return false;
        } else if (((aSide + bSide) <= cSide) || ((aSide + cSide) <= bSide)
                || ((bSide + cSide) <= aSide)) {
            return false;
        }
        return true;
    }

    /**
     * Gets square of triangle by Heron's formula.
     *
     * @return square of triangle.
     */

    public double getSquare() {
        double p = (aSide + bSide + cSide) / 2;
        return Math.sqrt(p * (p - aSide) * (p - bSide) * (p - cSide));
    }

    public String getName() {
        return name;
    }

    public double getaSide() {
        return aSide;
    }

    public double getbSide() {
        return bSide;
    }

    public double getcSide() {
        return cSide;
    }

    /**
     * Equals triangles
     * @param otherObject - other triangle
     * @return boolean value(true/false)
     */
    @Override public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        Triangle other = (Triangle) otherObject;
        return Objects.equals(name, other.name) &&
                Objects.equals(aSide, other.aSide) &&
                Objects.equals(bSide, other.bSide) &&
                Objects.equals(cSide, other.cSide);
    }

    /**
     * Gets hashcode
     * @return hashcode value
     */
    @Override public int hashCode() {
        return Objects.hash(name, aSide, bSide, cSide);
    }

}
