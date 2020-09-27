package com.javapractice;
import java.io.*;
import java.util.*;
public class ValidEmail {

	public static void main(String args[])
	{
		try
		{
			
			@SuppressWarnings("resource")
			Scanner in=new Scanner(System.in);
			System.out.println("Enter name of text file: ");
			String fileName=in.nextLine();
			File file= new File(fileName);
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(file);
			
			System.out.println("Valid Email IDs: \n ");
			while(sc.hasNextLine())
			{
				String email=sc.nextLine();
				if(UserRegistration.checkEmail(email))
					{
						System.out.println(email);
					}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
