package com.userRegistration;

import org.junit.Assert;

import java.util.regex.Pattern;

public class UserRegistration {
	/*
	 * User Registration System.
	 */

	public static final String NAME_REGEX = "^[A-Z]{1}[a-zA-Z]{2,}+$"; // using Regex
	public static final String EMAIL_REGEX = "^([a-z0-9]+.)+@([a-z0-9]+.)([a-z]+.)[a-z]{2,3}+$";
	public static final String MOBILE_REGEX = "^[0-9]{2}[ ]{1}[0-9]{10}+$";
	private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.+[!@#$%^&+=._-])[A-Za-z0-9].{8,}+$";

	/*
	 * Exceptions
	 */
	// Custom Exception for First Name.
	public boolean firstNameException(String message) throws UserRegistrationException {
		if (message == null || message.isEmpty())
			throw new UserRegistrationException("Please Enter First Name");
		if (Pattern.matches(NAME_REGEX, message))
			throw new UserRegistrationException("valid First Name");
		else
			throw new UserRegistrationException("Invalid First Name");
	}

	// Custom Exception for Last Name.
	public boolean lastNameException(String message) throws UserRegistrationException {
		if (message == null || message.isEmpty())
			throw new UserRegistrationException("Please Enter Last Name");
		if (Pattern.matches(NAME_REGEX, message))
			throw new UserRegistrationException("valid Last Name");
		else
			throw new UserRegistrationException("Invalid Last Name");
	}

	// Custom Exception for Email.
	public boolean emailException(String message) throws UserRegistrationException {
		if (message == null || message.isEmpty())
			throw new UserRegistrationException("Please Enter Email");
		if (Pattern.matches(EMAIL_REGEX, message))
			throw new UserRegistrationException("valid Email");
		else
			throw new UserRegistrationException("Invalid Email");
	}

	// Custom Exception for Mobile Number.
	public boolean mobileNumberException(String message) throws UserRegistrationException {
		if (message == null || message.isEmpty())
			throw new UserRegistrationException("Please Enter Mobile number");
		if (Pattern.matches(MOBILE_REGEX, message))
			throw new UserRegistrationException("valid Mobile Number");
		else
			throw new UserRegistrationException("Invalid Mobile Number");
	}

	// Custom Exception for Password.
	public boolean passwordException(String message) throws UserRegistrationException {
		if (message == null || message.isEmpty())
			throw new UserRegistrationException("Please Enter password");
		if (Pattern.matches(PASSWORD_REGEX, message))
			throw new UserRegistrationException("valid password");
		else
			throw new UserRegistrationException("Invalid password");
	}
}