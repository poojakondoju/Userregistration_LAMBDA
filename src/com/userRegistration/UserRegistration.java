package com.userRegistration;

import java.util.Scanner;

public class UserRegistration {
	/*
	 * User Registration System.
	 */
	// Scanner class to accepting values at execution time.
	Scanner scanner = new Scanner(System.in);
	// Global variables.
	public static final String NAME_REGEX = "^[A-Z]{1}[a-zA-Z]{2,}+$"; // using Regex
	public static final String EMAIL_REGEX = "^([a-z0-9]+.)+@([a-z0-9]+.)([a-z]+.)[a-z]{2,3}+$";

	/*
	 * Validating First Name.
	 */
	public void firstName() {
		System.out.println("Enter First Name");
		String name = scanner.next();
		// Comparing the name with userName
		if (name.matches(NAME_REGEX))
			System.out.println("Valid First Name");
		else
			System.out.println("In Valid First Name");
	}

	/*
	 * Validating Last Name.
	 */
	public void LastName() {
		System.out.println("Enter Last Name");
		String name = scanner.next();
		// Comparing the name with userName
		if (name.matches(NAME_REGEX))
			System.out.println("Valid Last Name");
		else
			System.out.println("In Valid Last Name");
	}

	/*
	 * Validating Email.
	 */
	public void email() {
		System.out.println("Enter email");
		String email = scanner.next();
		// Comparing the name with email
		if (email.matches(EMAIL_REGEX))
			System.out.println("Valid Email");
		else
			System.out.println("In Valid Email");
	}

	/*
	 * Main method starts.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration");
		// creating the object reference variable. To call the non-static methods.
		UserRegistration registration = new UserRegistration();
		// calling methods
		registration.firstName();
		registration.LastName();
		registration.email();
	}
}