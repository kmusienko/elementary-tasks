package com.softserve.edu.task3;

import com.softserve.edu.task3.exception.NotValidTriangleException;
import com.softserve.edu.task3.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by adminaccount on 6/7/2017.
 */
public class TriangleTest {
    @Test (expected = NotValidTriangleException.class)
    public void CreateObject_NegativeSides_ExceptionThrown() {
        // Arrange
        double aSide = -2;
        double bSide = -2;
        double cSide = -2;

        // Act
        new Triangle("first", aSide, bSide, cSide);

        // Assert
    }
    @Test (expected = NotValidTriangleException.class)
    public void CreateObject_NotValidSides_ExceptionThrown() {
        // Arrange
        double aSide = 2;
        double bSide = 2;
        double cSide = 4;

        // Act
        new Triangle("first", aSide, bSide, cSide);

        // Assert
    }

    @Test
    public void getSquare_ValidSides_SquareReturned() {
        // Arrange
        Triangle triangle = new Triangle("first", 3,4,5);
        double expectedSquare = 6.0;

        //Act
        double actualSquare = triangle.getSquare();

        //Assert

        Assert.assertEquals(expectedSquare, actualSquare, 0.00001);
    }
}
