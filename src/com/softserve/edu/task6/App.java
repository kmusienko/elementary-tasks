package com.softserve.edu.task6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class App {
    /**
     * Main method.
     * @param args - arguments.
     */
    public static void main(String[] args) {
        run();
    }

    /**
     * Runs the application.
     */
    private static void run() {

        TicketService ticketService = new TicketServiceImpl();
        List<Ticket> tickets = ticketService.initializeTickets();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter path to file:");
        Path path = Paths.get(scanner.nextLine());
        try {
            BufferedReader bufferedReader
                    = new BufferedReader(new FileReader(path.toFile()));
            String line = bufferedReader.readLine();
            int numberOfLuckyTickets;
            if (line.equals("Moscow")) {
                numberOfLuckyTickets =
                        ticketService.getAmountOfMoscowLuckyTickets(tickets);
                System.out.println("Number of lucky tickets (Moscow) = "
                        + numberOfLuckyTickets);
            } else if (line.equals("Piter")) {
                numberOfLuckyTickets =
                        ticketService.getAmountOfPiterLuckyTickets(tickets);
                System.out.println("Number of lucky tickets (Piter) = "
                        + numberOfLuckyTickets);
            } else {
                System.out.println("Incorrect file's text.");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
