package com.tasks.day_1;
import java.util.Scanner;

public class DisplayCharacter
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 4 Nubers:");
			
		for(int i=0;i<5;i++)
		{
			int num=sc.nextInt();
			char ch=(char)num;
			System.out.println(num+"-"+ ch);
		}
	}
}
