package com.softserve.edu.task6;

import java.util.List;

public interface TicketService {
    /**
     * Initializes input tickets.
     *
     * @return list of tickets
     */
    List<Ticket> initializeTickets();

    /**
     * Checks if answer is positive or negative.
     *
     * @param answer - user's answer.
     * @return boolean value (true or false).
     */
    boolean isContinue(String answer);

    /**
     * Gets amount of lucky tickets (Moscow).
     *
     * @param tickets - list of tickets
     * @return amount of lucky tickets
     */
    int getAmountOfMoscowLuckyTickets(List<Ticket> tickets);

    /**
     * Gets amount of lucky tickets (Piter).
     *
     * @param tickets - list of tickets
     * @return amount of lucky tickets
     */
    public int getAmountOfPiterLuckyTickets(List<Ticket> tickets);
}
