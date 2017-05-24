package com.softserve.edu.task3.services;

import com.softserve.edu.task3.model.Triangle;

import java.util.List;

/**
 * Created by Kostya on 24.05.2017.
 */
public interface TriangleService {
    List<Triangle> initialize() throws NumberFormatException;
    void sortTriangles(List<Triangle> triangles);
    void printTriangles(List<Triangle> triangles);
    boolean isContinue(String answer);
}
