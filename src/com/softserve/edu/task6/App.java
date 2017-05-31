package com.softserve.edu.task6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by adminaccount on 5/31/2017.
 */
public class App {
    public static void main(String[] args) {
        run();
    }

    /**
     * Runs the application.
     */
    public static void run() {
        List<Ticket> tickets = initializeTickets();
        TicketService ticketService = new TicketService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter path to file:");
        Path path = Paths.get(scanner.nextLine());
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()));
            String line = bufferedReader.readLine();
            int numberOfLuckyTickets;
            if (line.equals("Moscow")) {
                numberOfLuckyTickets = ticketService.getAmountOfMoscowLuckyTickets(tickets);
                System.out.println("Number of lucky tickets (Moscow) = " + numberOfLuckyTickets);
            } else if (line.equals("Piter")) {
                numberOfLuckyTickets = ticketService.getAmountOfPiterLuckyTickets(tickets);
                System.out.println("Number of lucky tickets (Piter) = " + numberOfLuckyTickets);
            } else {
                System.out.println("Incorrect file's text.");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Initializes input tickets.
     *
     * @return list of tickets
     */
    public static List<Ticket> initializeTickets() {
        String answer = "";
        List<Ticket> tickets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please, write ticket's number");
            try {
                int ticketNumber = scanner.nextInt();
                Ticket ticket = new Ticket(String.valueOf(ticketNumber));
                tickets.add(ticket);
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input!");
            } finally {
                scanner.nextLine();
            }
            System.out.println("Do you want to add one more ticket?");
            answer = scanner.nextLine();
        } while (isContinue(answer));

        return tickets;
    }

    /**
     * Checks if answer is positive or negative.
     *
     * @param answer - user's answer.
     * @return boolean value (true or false).
     */
    public static boolean isContinue(String answer) {
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }
}
