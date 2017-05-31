package com.softserve.edu.task6;

import java.util.List;

/**
 * Created by adminaccount on 5/31/2017.
 */
public class TicketService {

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
