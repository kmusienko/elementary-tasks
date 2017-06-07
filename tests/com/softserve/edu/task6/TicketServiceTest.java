package com.softserve.edu.task6;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adminaccount on 6/7/2017.
 */
public class TicketServiceTest {

    @Test
    public void isContinue_FullPositiveAnswer_TrueReturned() {
        //Arrange
        TicketService ticketService = new TicketServiceImpl();
        String text = "yes";
        boolean expectedAnswer = true;

        //Act
        boolean actualAnswer = ticketService.isContinue(text);

        //Assert
        Assert.assertEquals(actualAnswer, expectedAnswer);

    }

    @Test
    public void isContinue_ShortPositiveAnswer_TrueReturned() {
        //Arrange
        TicketService ticketService = new TicketServiceImpl();
        String text = "y";
        boolean expectedAnswer = true;

        //Act
        boolean actualAnswer = ticketService.isContinue(text);

        //Assert
        Assert.assertEquals(actualAnswer, expectedAnswer);

    }

    @Test
    public void isContinue_NegativeAnswer_FalseReturned() {
        //Arrange
        TicketService ticketService = new TicketServiceImpl();
        String text = "no";
        boolean expectedAnswer = false;

        //Act
        boolean actualAnswer = ticketService.isContinue(text);

        //Assert
        Assert.assertEquals(actualAnswer, expectedAnswer);

    }

    @Test
    public void getAmountOfMoscowLuckyTickets_Tickets_AmountOfLuckyReturned() {
        //Arrange
        Ticket ticket1 = new Ticket("123321");
        Ticket ticket2 = new Ticket("111143");
        Ticket ticket3 = new Ticket("456654");
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        int expectedAmount = 2;
        TicketService ticketService = new TicketServiceImpl();

        //Act
        int actualAmount = ticketService.getAmountOfMoscowLuckyTickets(tickets);

        //Assert
        Assert.assertEquals(actualAmount, expectedAmount);
    }

    @Test
    public void getAmountOfPiterLuckyTickets_Tickets_AmountOfLuckyReturned() {
        //Arrange
        Ticket ticket1 = new Ticket("111122");
        Ticket ticket2 = new Ticket("443311");
        Ticket ticket3 = new Ticket("123321");
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        int expectedAmount = 2;
        TicketService ticketService = new TicketServiceImpl();

        //Act
        int actualAmount = ticketService.getAmountOfPiterLuckyTickets(tickets);

        //Assert
        Assert.assertEquals(actualAmount, expectedAmount);
    }



}
