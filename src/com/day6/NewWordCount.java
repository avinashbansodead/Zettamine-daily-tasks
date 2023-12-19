package com.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewWordCount 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Student's Article:");
        String article = sc.nextLine();

        String[] words = article.split("[\\s,;:.?!]+");
        HashMap<String , Integer> map = new HashMap<>();
        
        for (String string : words) 
        {
            map.put(string.toLowerCase(), map.getOrDefault(string.toLowerCase(), 0)+1);
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()) 
        {
            System.out.println( entry.getKey() + 
                             ": " + entry.getValue()); 
        } 
        
        sc.close();
    }
}
