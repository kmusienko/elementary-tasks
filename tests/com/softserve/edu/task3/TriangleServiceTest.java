package com.softserve.edu.task3;

import com.softserve.edu.task3.model.Triangle;
import com.softserve.edu.task3.service.TriangleService;
import com.softserve.edu.task3.service.TriangleServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adminaccount on 6/7/2017.
 */
public class TriangleServiceTest {
    @Test
    public void sortTriangles_ListOfTriangles_sortedTrianglesReturned() {
        // Arrange
        TriangleService triangleService = new TriangleServiceImpl();
        List<Triangle> actualTriangles = new ArrayList<>();
        actualTriangles.add(new Triangle("first", 2, 2, 2));
        actualTriangles.add(new Triangle("second", 4, 4, 4));
        actualTriangles.add(new Triangle("third", 2.4, 2.4, 2.4));
        actualTriangles.add(new Triangle("fourth", 6, 6, 6));

        List<Triangle> expectedTriangles = new ArrayList<>();
        expectedTriangles.add(new Triangle("fourth", 6, 6, 6));
        expectedTriangles.add(new Triangle("second", 4, 4, 4));
        expectedTriangles.add(new Triangle("third", 2.4, 2.4, 2.4));
        expectedTriangles.add(new Triangle("first", 2, 2, 2));
        //Act
        triangleService.sortTriangles(actualTriangles);

        //Assert
        Assert.assertEquals(actualTriangles, expectedTriangles);
    }

    @Test
    public void isContinue_FullPositiveAnswer_TrueReturned() {
        //Arrange
        TriangleService triangleService = new TriangleServiceImpl();
        String text = "yes";
        boolean expectedAnswer = true;

        //Act
        boolean actualAnswer = triangleService.isContinue(text);

        //Assert
        Assert.assertEquals(actualAnswer, expectedAnswer);

    }

    @Test
    public void isContinue_ShortPositiveAnswer_TrueReturned() {
        //Arrange
        TriangleService triangleService = new TriangleServiceImpl();
        String text = "y";
        boolean expectedAnswer = true;

        //Act
        boolean actualAnswer = triangleService.isContinue(text);

        //Assert
        Assert.assertEquals(actualAnswer, expectedAnswer);

    }
    @Test
    public void isContinue_NegativeAnswer_FalseReturned() {
        //Arrange
        TriangleService triangleService = new TriangleServiceImpl();
        String text = "no";
        boolean expectedAnswer = false;

        //Act
        boolean actualAnswer = triangleService.isContinue(text);

        //Assert
        Assert.assertEquals(actualAnswer, expectedAnswer);

    }

}
