package com.softserve.edu.task1;

public class App {
    public static void main(String[] args) {
        validateAndPrint(args);
    }

    /**
     * prints chessboard
     * @param height - height of chessboard
     * @param width - width of chessboard
     */
    public static void printChessBoard(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

    /**
     * validates and prints chessboard
     * @param args - height and width values which has been entered by user.
     */
    public static void validateAndPrint(String[] args) {
        if (args.length != 2) {
            System.out.println("You have to write 2 parameters: 1 - height," +
                                       "2 - width of chess board.");
        } else {
            try {
                int height = Integer.parseInt(args[0]);
                int width = Integer.parseInt(args[1]);
                printChessBoard(height, width);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect parameters!");
            }
        }
    }
}
