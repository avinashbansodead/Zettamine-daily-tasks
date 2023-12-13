package com.day3.string.word;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Words 
{
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Student's article");
	String str=sc.nextLine();
	
	String[] wordArray = str.split("[,. !?;:]+");
	
	Set <String>uniqueWords=new HashSet<String>();
	
	 Set<String> repeatedWords = new HashSet<String>();
	for (String word:wordArray)
	{
		
		if(!uniqueWords.add(word.toLowerCase()))
				{
			repeatedWords.add(word.toLowerCase());
				}
	}
	
	
	
	System.out.println("No of words: " + wordArray.length);
	System.out.println("No of unique words" +uniqueWords.size());
	System.out.print("Repeated words are :");
	for(String word:repeatedWords)
	{
		System.out.print(" "+word+" ");
	}
}
}
