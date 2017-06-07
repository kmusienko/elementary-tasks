package com.softserve.edu.task3.service;

import com.softserve.edu.task3.exception.NotValidTriangleException;
import com.softserve.edu.task3.model.Triangle;

import java.util.List;

public interface TriangleService {
    /**
     * initializes input.
     *
     * @return list of triangles which has been entered
     */
    List<Triangle> initialize() throws NotValidTriangleException;

    /**
     * sorts triangles by square.
     *
     * @param triangles - list of triangle need to sort
     */
    void sortTriangles(List<Triangle> triangles);

    /**
     * prints triangles.
     *
     * @param triangles - list of triangles which will be printed.
     */
    void printTriangles(List<Triangle> triangles);

    /**
     * Checks if answer is positive or negative.
     *
     * @param answer - user's answer
     * @return boolean value(true or false)
     */
    boolean isContinue(String answer);
}
