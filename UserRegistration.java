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

	public static boolean checkEmail(String email) 
	{
		String regex="^[a-zA-Z0-9]{1,}+(([\\.+-_][a-zA-Z0-9]{1,})?)+@(?:[a-zA-Z0-9]{1,})+\\.[a-z]{2,4}+((\\.[a-z]{2})?)$";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public static boolean checkPhoneNumber(String phoneNumber) {
		String regex="^[0-9]{2,3}\\s[0-9]{10}";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(phoneNumber);
		return m.matches();
	}
	
}