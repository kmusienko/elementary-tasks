package com.softserve.edu.task3.service;

import com.softserve.edu.task3.exception.NotValidTriangleException;
import com.softserve.edu.task3.model.Triangle;

import java.util.*;

/**
 * Created by Kostya on 24.05.2017.
 */
public class TriangleServiceImpl implements TriangleService {
    /**
     * initializes input.
     *
     * @return list of triangles which has been entered
     */
    @Override public List<Triangle> initialize() {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        List<Triangle> triangles = new ArrayList<>();
        do {
            System.out.println("Please, enter name and sides of triangle."
                    + " Format: <Name>,<1-st side>,<2-nd side>," + "<3-rd "
                    + "side>");
            String textTriangle = scanner.nextLine();
            String[] partsOfTriangle = textTriangle.split(",");
            String name = partsOfTriangle[0];
            double aSide = Double.parseDouble(partsOfTriangle[1]);
            double bSide = Double.parseDouble(partsOfTriangle[2]);
            double cSide = Double.parseDouble(partsOfTriangle[3]);
            try {
                triangles.add(new Triangle(name, aSide, bSide, cSide));
            } catch (NotValidTriangleException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Do you want to add new one?");
            answer = scanner.nextLine();
        } while (isContinue(answer));
        return triangles;
    }

    /**
     * sorts triangles by square.
     *
     * @param triangles - list of triangle need to sort
     */
    public void sortTriangles(List<Triangle> triangles) {
        Collections.sort(triangles, new Comparator<Triangle>() {
            @Override
            public int compare(Triangle triangle1, Triangle triangle2) {
                return Double
                        .compare(triangle2.getSquare(), triangle1.getSquare());
            }
        });
//        Collections.sort(triangles, new Comparator<Triangle>() {
//            @Override
//            public int compare(Triangle triangle1, Triangle triangle2) {
//                double doubleResult =
//                        triangle2.getSquare() - triangle1.getSquare();
//                final double EPS = 0.0001;
//                if (doubleResult > EPS) {
//                    return 1;
//                } else if (doubleResult < -EPS) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
    }

    /**
     * prints triangles.
     *
     * @param triangles - list of triangles which will be printed.
     */
    public void printTriangles(List<Triangle> triangles) {
        int i = 1;
        for (Triangle triangle : triangles) {
            System.out.println(
                    i + ". [Triangle " + triangle.getName() + "]: Square = "
                            + String.format("%.2f", triangle.getSquare())
                            + ". Sides: " + triangle.getaSide() + " cm, "
                            + triangle.getbSide() + " cm, "
                            + triangle.getcSide() + " cm.");
            i++;
        }
    }

    /**
     * Checks if answer is positive or negative.
     *
     * @param answer - user's answer
     * @return boolean value(true or false)
     */
    public boolean isContinue(String answer) {
        if (answer.equalsIgnoreCase("yes")
                || answer.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }
}
