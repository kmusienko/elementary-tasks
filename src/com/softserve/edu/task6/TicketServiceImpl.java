package com.softserve.edu.task6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by adminaccount on 6/7/2017.
 */
public class TicketServiceImpl implements TicketService {
    /**
     * Initializes input tickets.
     *
     * @return list of tickets
     */
    public List<Ticket> initializeTickets() {
        String answer = "";
        List<Ticket> tickets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please, write ticket's number");
            try {
                String ticketNumber = scanner.nextLine();
                Ticket ticket = new Ticket(ticketNumber);
                tickets.add(ticket);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
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
    public boolean isContinue(String answer) {
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }



    /**
     * Gets amount of lucky tickets (Moscow).
     *
     * @param tickets - list of tickets
     * @return amount of lucky tickets
     */
    public int getAmountOfMoscowLuckyTickets(List<Ticket> tickets) {
        int totalAmount = 0;
        for (Ticket ticket : tickets) {
            String number = ticket.getNumber();
            String firstpart = number.substring(0, 3);
            int firstSum = 0;
            for (char symbol : firstpart.toCharArray()) {
                firstSum += Character.getNumericValue(symbol);
            }
            String secondPart = number.substring(3);
            int secondSum = 0;
            for (char symbol : secondPart.toCharArray()) {
                secondSum += Character.getNumericValue(symbol);
            }
            if (firstSum == secondSum) {
                totalAmount++;
            }
        }
        return totalAmount;
    }

    /**
     * Gets amount of lucky tickets (Piter).
     *
     * @param tickets - list of tickets
     * @return amount of lucky tickets
     */
    public int getAmountOfPiterLuckyTickets(List<Ticket> tickets) {
        int totalAmount = 0;
        for (Ticket ticket : tickets) {
            String number = ticket.getNumber();
            char[] numberArray = number.toCharArray();
            int evenSum = 0;
            int oddSum = 0;
            for (char symbol : numberArray) {
                if (((int) symbol) % 2 == 0) {
                    evenSum += Character.getNumericValue(symbol);
                } else {
                    oddSum += Character.getNumericValue(symbol);
                }
            }
            if (evenSum == oddSum) {
                totalAmount++;
            }
        }
        return totalAmount;
    }
}
