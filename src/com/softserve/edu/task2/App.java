package com.softserve.edu.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Kostya on 22.05.2017.
 */
public class App {
    public static void main(String[] args) {
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Envelop #1. Please, write size (a,b):");
                System.out.print("a = ");
                double a = scanner.nextDouble();
                System.out.print("b =  ");
                double b = scanner.nextDouble();
                System.out.println("Envelop #2. Please, write size (c,d):");
                System.out.print("c = ");
                double c = scanner.nextDouble();
                System.out.print("d = ");
                double d = scanner.nextDouble();
                if (c < a && d < b) {
                    System.out.println("You can put Envelop #2 in Envelop #1");
                } else if (a < c && b < d) {
                    System.out.println("You can put Envelop #1 in Envelop #2");
                } else {
                    System.out.println("You can't put one envelop to another.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input!");
            }
            scanner.nextLine();
            System.out.println("Would you like to continue?");
            answer = scanner.nextLine();
        } while (isContinue(answer));
    }

    public static boolean isContinue(String answer) {
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }
}
