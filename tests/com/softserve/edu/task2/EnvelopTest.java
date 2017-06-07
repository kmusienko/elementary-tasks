package com.softserve.edu.task2;

import org.junit.Test;

/**
 * Created by adminaccount on 6/7/2017.
 */
public class EnvelopTest {
    @Test (expected = IllegalArgumentException.class)
    public void CreateObject_SidesLessThanZero_ExceptionThrown() {
        //Arrange
        double aSide = -4;
        double bSide = -2;

        //Act
        Envelop envelop = new Envelop(aSide, bSide);
    }
    @Test (expected = IllegalArgumentException.class)
    public void CreateObject_SidesEqualsZero_ExceptionThrown() {
        //Arrange
        double aSide = 0;
        double bSide = 0;

        //Act
        Envelop envelop = new Envelop(aSide, bSide);
    }
}
