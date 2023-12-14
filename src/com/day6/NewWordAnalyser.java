package com.day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NewWordAnalyser
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student's Article:");
        String article = scanner.nextLine();

        String[] wordArray = article.split("[\\s,;:.? !]+");
 
        Set<String> uniqueWords = new HashSet<String>();
        Set<String> repeatedWords = new HashSet<String>();
        
        for (String word:wordArray)
    	{	
    		if(!uniqueWords.add(word.toLowerCase()))
    				{
    			repeatedWords.add(word.toLowerCase());
    				}
    	}
        
        System.out.println("No of words: " + wordArray.length);
    	System.out.println("No of unique words: " +uniqueWords.size());
    	System.out.println();
    	System.out.println("The words are ");
    	
    	int wordCount=1;
    	for(String word:uniqueWords)
    	{
    		System.out.println(wordCount+++". "+word);
    	}
        scanner.close();
    }
}

