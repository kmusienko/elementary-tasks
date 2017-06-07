package com.softserve.edu.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
      run();
    }

    /**
     * runs the application.
     */
    public static void run() {
        String answer;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Envelop #1. Please, write size (a,b):");
                System.out.print("a = ");
                double a = scanner.nextDouble();
                System.out.print("b =  ");
                double b = scanner.nextDouble();
                Envelop envelop1 = new Envelop(a, b);
                System.out.println("Envelop #2. Please, write size (a,b):");
                System.out.print("a = ");
                double c = scanner.nextDouble();
                System.out.print("b = ");
                double d = scanner.nextDouble();
                Envelop envelop2 = new Envelop(c, d);
                printEnvelopsInfo(envelop1, envelop2);
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input!");
            }
            scanner.nextLine();
            System.out.println("Would you like to continue?");
            answer = scanner.nextLine();
        } while (isContinue(answer));
    }

    /**
     * Prints envelop's info.
     * @param envelop1 - first envelop
     * @param envelop2 - second envelop
     */
    public static void printEnvelopsInfo(Envelop envelop1, Envelop envelop2) {
        if (envelop2.getaSide() < envelop1.getaSide()
                && envelop2.getbSide() < envelop2.getbSide()) {
            System.out.println("You can put Envelop #2 in Envelop #1");
        } else if (envelop1.getaSide() < envelop2.getaSide() &&
                envelop1.getbSide() < envelop2.getbSide()) {
            System.out.println("You can put Envelop #1 in Envelop #2");
        } else {
            System.out.println("You can't put one envelop to another.");
        }
    }

    /**
     * Checks if answer is positive or negative.
     * @param answer - user's answer.
     * @return boolean value (true or false).
     */
    public static boolean isContinue(String answer) {
        if (answer.equalsIgnoreCase("yes")
                || answer.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }
}
