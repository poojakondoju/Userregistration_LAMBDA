package com.userRegistration;

import java.util.Scanner;

public class UserRegistration {
	/*
	 * User Registration System.
	 */
	// Scanner class to accepting values at execution time.
	Scanner scanner = new Scanner(System.in);
	// Global variables.
	public static final String firstName = "^[A-Z]{1}[a-zA-Z]{2,}+$"; // using Regex

	/*
	 * Validating First Name.
	 */
	public void firstName() {
		System.out.println("Enter First Name");
		String name = scanner.next();
		// Comparing the name with firstName
		if (name.matches(firstName))
			System.out.println("Valid First Name");
		else
			System.out.println("In Valid First Name");
	}

	/*
	 * Main method starts.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration");
		// creating the object reference variable. To call the non-static methods.
		UserRegistration registration = new UserRegistration();
		// calling firstName method
		registration.firstName();
	}
}
