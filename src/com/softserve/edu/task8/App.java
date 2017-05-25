package com.softserve.edu.task8;

/**
 * Created by Kostya on 23.05.2017.
 */
public class App {
    public static void main(String[] args) {
        if (args.length !=2) {
            System.out.println("You need to enter 2 integer parameters. ");
        } else {
            try {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                printFiboNumbers(a, b);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input!");
            }
        }
    }
    public static void printFiboNumbers(int a, int b) {
        int f0 = 1;
        int f1 = 1;
        if (f0 >= a) {
            System.out.println(f0);
            System.out.println(f1);
        }
        int f2 = 0;
        while (f2 <= b) {
            f2 = f0 + f1;
            if (f2 >= a && f2 <= b) {
                System.out.println(f2);
            }
            f0 = f1;
            f1 = f2;
        }
    }
}
