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
			System.out.print("Enter the first name: \n (First character should be in upper case and should be at least 3 characters long) \n");
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
			System.out.print("Enter the last name: \n (First character should be in upper case and should be at least 3 characters long) \n");
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
	
	private static void getEmail()	
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		flag=0;
		while(flag==0)
		{
			System.out.print("Enter valid email ID: \n");
			String email= sc.nextLine();
			if(!UserRegistration.checkEmail(email))
				System.out.println("Invalid email ID!!! Try Again...");
			else
			{	
				System.out.println("You can proceed.");
				flag=1;
				break;
			}
		}
	}
	
	private static void getPhoneNumber() 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		flag=0;
		while(flag==0)
		{
			System.out.print("Enter valid phone number: \n (Country code followed by a space and then the 10 digit number) \n");
			String phoneNumber= sc.nextLine();
			if(!UserRegistration.checkPhoneNumber(phoneNumber))
				System.out.println("Invalid number!!! Try Again...");
			else
			{	
				System.out.println("You can proceed.");
				flag=1;
				break;
			}
		}
	}
	
	private static void getPassword() 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		flag=0;
		while(flag==0)
		{
			System.out.print("Enter a valid password: \n "
					+ "Criteria: \n "
					+ "1. Should be at least 8 characters long \n "
					+ "2. Should have at least 1 Upper Case letter \n "
					+ "3. Should have at least 1 number \n "
					+ "4. Should have exactly 1 special character \n");
			String password= sc.nextLine();
			if(!UserRegistration.checkPassword(password))
				System.out.println("Invalid number!!! Try Again...");
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
		getEmail();
		getPhoneNumber();
		getPassword();
	}
	
}