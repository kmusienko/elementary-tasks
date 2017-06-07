package com.softserve.edu.task6;

import org.junit.Assert;
import org.junit.Test;

public class TicketTest {
    @Test
    public void CreateObject_ValidNumber_TrueRetuned() {
        //Arrange
        String ticketNumber = "123123";
        String expectedNumber = ticketNumber;
        //Act
        Ticket ticket = new Ticket(ticketNumber);
        String actualNumber = ticket.getNumber();

        //Assert
        Assert.assertEquals(actualNumber, expectedNumber);
    }

    @Test (expected = IllegalArgumentException.class)
    public void CreateObject_NumbersMoreThanSix_FalseRetuned() {
        //Arrange
        String ticketNumber = "12345678";

        //Act
        Ticket ticket = new Ticket(ticketNumber);

    }

    @Test (expected = IllegalArgumentException.class)
    public void CreateObject_NegativeNumber_FalseRetuned() {
        //Arrange
        String ticketNumber = "-123543";

        //Act
        Ticket ticket = new Ticket(ticketNumber);

    }
}
