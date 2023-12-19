package com.day6.book_manipulaztion;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
@Getter
class Library
{
private List<Book>bookList = new ArrayList<Book>();

	public void addBook(Book bobj)
	{
	    bookList.add(bobj);
	    System.out.println("Book successfully added");
	}
	
	public List<Book> viewAllBooks()
	{
	    return this.bookList;
	}
	
	public ArrayList<Book> viewBooksByAuthor(String author)
	{
	    ArrayList<Book> list = new ArrayList<Book>();
	    for (Book book : bookList) {
	        if(book.getBookAuthor().equals(author))list.add(book);
	    }
	    return list;
	}
	
	public int countNoOfBook(String bname)
	{
	    int count=0;
	    for (Book book : bookList) {
	        if (book.getBookTitle().equals((bname))) 
	        {
	            count++;
	        }
	    }
	    return count;
	}    
}