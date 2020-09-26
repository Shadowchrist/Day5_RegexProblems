package com.javapractice;

import java.util.Scanner;

public class UserInput {
	
	public static int flag;
	private static void getFirstName()
	{	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		flag=0;
		while(flag==0)
		{
			System.out.print("Enter the first name: ");
			String fname= sc.nextLine();
			if(!UserRegistration.checkFirstName(fname))
				System.out.println("Invalid First Name!!! Try Again...");
			else
			{	
				System.out.println("You can proceed.");
				flag=1;
				break;
			}
		}
	}	
		
	private static void getLastName()	
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		flag=0;
		while(flag==0)
		{
			System.out.print("Enter the last name: ");
			String lname= sc.nextLine();
			if(!UserRegistration.checkLastName(lname))
				System.out.println("Invalid Last Name!!! Try Again...");
			else
			{	
				System.out.println("You can proceed.");
				flag=1;
				break;
			}
		}
	}	
	
	public static void main(String args[]) 
	{
		getFirstName();
		getLastName();
	}
		
	
}