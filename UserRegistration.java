package com.javapractice;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void checkFirstName(String firstName)
	{
		String regex="^[A-Z]{1}[a-zA-Z]{2,}";
		Pattern p = Pattern.compile(regex); 
		Matcher m1 = p.matcher(firstName);
		if(!m1.matches())
			System.out.println("Invalid First Name!!! Try Again...");
		else
			System.out.println("You can proceed.");
		
	}
	
	public static void main(String args[]) 
	{ 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name: ");
		String fname= sc.nextLine();
		checkFirstName(fname);
	}
}