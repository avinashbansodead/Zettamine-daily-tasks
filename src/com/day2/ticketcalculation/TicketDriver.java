package com.day2.ticketcalculation;

import java.util.Scanner;

public class TicketDriver
{

	 public static void main(String[] args)
	 {
	        Scanner sc = new Scanner(System.in);

	        // Get input from the user
	        System.out.print("Enter no of bookings: ");
	        int numBookings = sc.nextInt();

	        System.out.print("Enter the available tickets: ");
	        int availableTickets = sc.nextInt();
	        
	        Ticket.setAvailableTickets(availableTickets);
	        
	        

	        // Process each booking
	        for (int i = 1; i <= numBookings; i++) 
	        {
	            Ticket ticket = new Ticket();

	            System.out.print("Enter the ticketid: ");
	            ticket.setTicketid(sc.nextInt());

	            System.out.print("Enter the price: ");
	            ticket.setPrice(sc.nextInt());

	            System.out.print("Enter the no of tickets: ");
	            int numTickets = sc.nextInt();
	            
	            //Check the number of available ticket before booking
	            System.out.println("\nAvailable tickets: " + Ticket.getAvailableTickets());
	            
	            
	            int totalAmount = ticket.calculateTicketCost(numTickets);

	            if (totalAmount != -1) 
	            {
	                //Total amount after booking
	                System.out.println("Total amount: " + totalAmount);
	                
	                //Check the number of available ticket after booking
	                System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets() + "\n");
	            } else 
	            {
	            	//Display message if user entered value is more than available ticket or entered wrong input
	                System.out.println("Tickets not available or invalid input.\n Try again.");
	                i--; 
	            }
	        }
	        // Close the scanner class object 
	        sc.close();
	  }
}

