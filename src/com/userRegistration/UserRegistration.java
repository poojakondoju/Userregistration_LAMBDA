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
	public static final String MOBILE_REGEX = "^[0-9]{2}[ ]{1}[0-9]{10}+$";
	// private static final String PASSWORD_REGEX = "^(?=.*[A-Z])[A-Za-z0-9]{8,}+$";
	// //Rule1
	private static final String PASSWORD_REGEX = "^(?=.*[A-Z])[A-Za-z0-9]{8,}+$"; // Rule2
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
		// Comparing the email with EMAIL_REGEX
		if (email.matches(EMAIL_REGEX))
			System.out.println("Valid Email");
		else
			System.out.println("In Valid Email");
	}

	/*
	 * Validating Mobile number.
	 */
	public void mobileNumber() {
		System.out.println("Enter Mobile number");
		String number = scanner.next();
		// Comparing the number with MOBILE_REGEX
		if (number.matches(MOBILE_REGEX))
			System.out.println("Valid Mobile number");
		else
			System.out.println("In Valid Mobile Number");
	}

	/*
	 * Validating Password Rule1:It contain Minimum 8 characters.
	 */
	public void password() {
		System.out.println("Enter Password");
		String password = scanner.next();
		// Comparing the number with MOBILE_REGEX
		if (password.matches(PASSWORD_REGEX))
			System.out.println("Valid password");
		else
			System.out.println("In Valid password");
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
		registration.mobileNumber();
		registration.password();
	}
}