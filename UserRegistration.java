package com.javapractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static boolean checkFirstName(String firstName)
	{
		String regex="^[A-Z]{1}[a-zA-Z]{2,}";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(firstName);
		return m.matches();
	}
	
	public static boolean checkLastName(String lastName)
	{
		String regex="^[A-Z]{1}[a-zA-Z]{2,}";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(lastName);
		return m.matches();
	}
	
}