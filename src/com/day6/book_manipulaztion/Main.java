package com.day6.book_manipulaztion;

import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    int option = 0;
    Library lb = new Library();
    long ISBNno;
    String bookTitle;
    String bookAuthor; 
    Scanner sc = new Scanner(System.in);
    do 
    {
        System.out.println();
        System.out.println("1.Add Book");
        System.out.println("2.Dispaly all Book Details");
        System.out.println("3.Search Book by Author");
        System.out.println("4.Count Number of books-by book name");
        System.out.println("5.Exit");
        System.out.print("Enter your chocie: ");
        option = sc.nextInt();
        switch (option) 
        	{
            case 1:
                System.out.print("Enter the ISBN no:");
                ISBNno = sc.nextInt();
                System.out.print("Enter the book name:" );
                sc.nextLine();
                bookTitle = sc.nextLine();
                System.out.print("Enter the author name: ");
                bookAuthor = sc.nextLine();
                Book b = new Book();
                b.setISBNno(ISBNno);
                b.setBookTitle(bookTitle);
                b.setBookAuthor(bookAuthor);
                lb.addBook(b);
                break;
                
            case 2:
                Main.dispaly(lb.viewAllBooks());
                break;
                
            case 3:
                System.out.print("Enter the name of author: ");
                sc.nextLine();
                bookAuthor = sc.nextLine();
                Main.dispaly(lb.viewBooksByAuthor(bookAuthor));
                break;
                
            case 4:
                System.out.print("Enter book name: ");
                sc.nextLine();
                bookTitle = sc.nextLine();
                int count = lb.countNoOfBook(bookTitle);
                System.out.println("Number of book is : "+count);
                break;
                
            case 5:
                return;
            default:
                System.out.println("Enter valid option");
        	}
    	}
    
    while (option != 5);
    sc.close();
    }
    
    public static void dispaly(List<Book> list)
    {
        System.out.println("Book id\t\tBook Name\tAuthor Name");
        System.out.println("--------------------------------------------");
        for (Book book : list) 
          {
           System.out.println(" ".repeat(3)+book.getISBNno()+"\t\t"
        		   			   +" ".repeat(3)+book.getBookTitle()+"\t\t"
        		   			   +" ".repeat(3)+book.getBookAuthor());
          }
    }

}

