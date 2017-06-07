package com.softserve.edu.task6;

public class Ticket {

    private String number;

    public Ticket(String number) {
        if (isValidTicket(number)) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("Incorrect input!");
        }
    }

    public String getNumber() {
        return number;
    }

    /**
     * Checks if ticket is valid.
     *
     * @param ticketNumber - number of ticket.
     * @return boolean value (true/false).
     */
    public boolean isValidTicket(String ticketNumber) {
        try {
            Integer.parseInt(ticketNumber);
        } catch (NumberFormatException e) {
            return false;
        }
        if (ticketNumber.length() != 6 || ticketNumber.charAt(0) == '-') {
            return false;
        }
        return true;
    }


}
