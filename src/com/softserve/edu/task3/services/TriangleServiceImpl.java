package com.softserve.edu.task3.services;

import com.softserve.edu.task3.model.Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kostya on 24.05.2017.
 */
public class TriangleServiceImpl implements TriangleService {
    @Override
    public List<Triangle> initialize() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        List<Triangle> triangles = new ArrayList<>();
        do {
            System.out.println("Please, enter name and sides of triangle. Format: <Name>,<1-st side>,<2-nd side>," +
                    "<3-rd side>");
            String textTriangle = scanner.nextLine();
            String name;
            double aSide;
            double bSide;
            double cSide;
            String[] partsOfTriangle = textTriangle.split(",");
            name = partsOfTriangle[0];
            aSide = Double.parseDouble(partsOfTriangle[1]);
            bSide = Double.parseDouble(partsOfTriangle[2]);
            cSide = Double.parseDouble(partsOfTriangle[3]);
            triangles.add(new Triangle(name, aSide, bSide, cSide));
            System.out.println("Do you want to add new one?");
            answer = scanner.nextLine();
        } while(isContinue(answer));
        return triangles;
    }

    public void sortTriangles(List<Triangle> triangles) {
        Collections.sort(triangles, (triangle1, triangle2) -> {
            double doubleResult = triangle2.getSquare() - triangle1.getSquare();
            if (doubleResult > 0) return 1;
            else if (doubleResult == 0) return 0;
            else return -1;
        });
    }
    public void printTriangles(List<Triangle> triangles) {
        int i=1;
        for (Triangle triangle : triangles) {
            System.out.println(i + ". [Triangle " + triangle.getName() + "]: Square = " +
                    String.format("%.2f", triangle.getSquare()) + ". Sides: " + triangle.getaSide() + " cm, " +
                    triangle.getbSide() + " cm, " + triangle.getcSide() + " cm.");
            i++;
        }
    }
    public boolean isContinue(String answer) {
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }
}
