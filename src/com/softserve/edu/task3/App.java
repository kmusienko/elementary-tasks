package com.softserve.edu.task3;

import com.softserve.edu.task3.exception.NotValidTriangleException;
import com.softserve.edu.task3.model.Triangle;
import com.softserve.edu.task3.service.TriangleService;
import com.softserve.edu.task3.service.TriangleServiceImpl;

import java.util.*;

public class App {
    public static void main(String[] args) {
        run();
    }

    /**
     * runs the application
     */
    public static void run() {
        TriangleService triangleService = new TriangleServiceImpl();
        try {
            List<Triangle> triangles = triangleService.initialize();
            triangleService.sortTriangles(triangles);
            triangleService.printTriangles(triangles);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input! " + e.getMessage());
        } catch (NotValidTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
