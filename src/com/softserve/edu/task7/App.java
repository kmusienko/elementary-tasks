package com.softserve.edu.task7;


/**
 * Created by Kostya on 23.05.2017.
 */
public class App {
    public static void main(String[] args) {
        if (args.length==0) {
            System.out.println("You need to enter 1 parameter (n).");
        } else {
            try {
                int n = Integer.parseInt(args[0]);
                printIntegers(n);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input!");
            }
        }
    }

    /**
     * Prints integers in case (i*i < n)
     * @param n - user's input number.
     */
    public static void printIntegers(int n) {
        for(int i=1;i*i<n;i++) {
            System.out.println(i);
        }
    }
}
