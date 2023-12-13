package com.day2.ticketcalculation;

import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
class Ticket 
{
    private int ticketid;
    private int price;
    private static int availableTickets;

    //Check number of available ticket
    public static int getAvailableTickets() 
    {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets)
    {
        // check availableTickets are not negative
        if (availableTickets >= 0)
        {
            Ticket.availableTickets = availableTickets;
        } 
        else 
        {
            System.out.println("Invalid value for availableTickets ");
            //Set the available tickets as 0 if available ticket value is negative
            Ticket.availableTickets = 0;
        }
    }

    // Method to calculate ticket cost 
    public int calculateTicketCost(int nooftickets) 
    {
        if (nooftickets > 0 && nooftickets <= availableTickets)
        {
        	//Total amount after booking
            int totalAmount = nooftickets * price;
            
            // Update the available ticket
             availableTickets =availableTickets- nooftickets;
             
             // Return totalAmount to caller method if booking is done
            return totalAmount;
        } else 
        {
        	//Tickets not available or invalid input
            return -1;  
        }
    }
}

