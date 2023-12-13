
package com.day1;

import java.util.Scanner;

public class MovieTicket_Calculation
{
	public static void main(String[] args) 
	{
		//Declare Constant values
        final int KING_CLASS = 75;
        final int QUEEN_CLASS = 150;
        final int REFRESHMENT_COST = 50;
        final double BULK_BOOKING_DISCOUNT = 0.10;//10% means 10/100=0.10
        
        final double COUPON_DISCOUNT = 0.02;// 2% means 2/100=0.02%
        final int MIN_TICKETS = 5;
        final int MAX_TICKETS = 40;
        
        //Creating the object of scanner class for taking the values from users
        Scanner sc = new Scanner(System.in);

        // Input statements
        System.out.print("Enter the no of ticket: ");
        int numOfTickets = sc.nextInt();
        if(numOfTickets >=MIN_TICKETS && numOfTickets <=MAX_TICKETS)
        {
        	System.out.print("Do you want refreshment: ");
        	char refreshmentCheck = sc.next().charAt(0);
        	System.out.print("Do you have coupon code: ");
        	char couponCode = sc.next().charAt(0);
        	System.out.print("Enter the circle: ");
        	char circle = sc.next().charAt(0);
        
        	calculateTicketCost(numOfTickets, refreshmentCheck, couponCode, circle,
                                KING_CLASS, QUEEN_CLASS, REFRESHMENT_COST,
                               BULK_BOOKING_DISCOUNT, COUPON_DISCOUNT, MIN_TICKETS, MAX_TICKETS);
        }  
        else
        {
        	System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }

    }

    static void calculateTicketCost(int numOfTickets, char refreshmentCheck, char couponCode, char circle,
                                   int kingClass, int queenClass, int refreshmentCost,
                                   double discountBulkBooking, double discountCoupon,
                                   int minTickets, int maxTickets)
    {
    	//Declare tickeCost variable because its value changes depends upon ticketBooking option
        double ticketCost;
        
        //Multiply with  KingClass ticket price if selecting 'k' or 'K'
        if (circle == 'K'||circle=='k') 
        {
            ticketCost = numOfTickets * kingClass;
        } 
        
        //Multiply QueenClass ticket price if selecting 'q' or 'Q'
        else if (circle == 'Q' || circle=='q') 
        {
            ticketCost = numOfTickets * queenClass;
        } 
        //For displaying the output if input is other than 'k','K','q' and 'Q' 
        else 
        {
            System.out.println("Invalid Input");
            return;
        }

        // Add refreshment cost if selected
        if (refreshmentCheck == 'Y'||refreshmentCheck=='y') 
        {
            ticketCost += numOfTickets * refreshmentCost;
        }

        // Apply discounts when number of tickets are more than 20
        if (numOfTickets > 20) 
        {
            ticketCost -= ticketCost * discountBulkBooking;
        }
        
        // Apply discountCoupon if select 'y' or 'Y'
        if (couponCode == 'Y'||couponCode=='y')
        {
            ticketCost -= ticketCost * discountCoupon;
        }

        // Print the result with two decimal places
        System.out.printf("Ticket cost: %.2f%n", ticketCost);
     }
}
