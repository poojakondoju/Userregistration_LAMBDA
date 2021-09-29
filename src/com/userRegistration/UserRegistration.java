package com.userRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
	/*
	 * User Registration System.
	 */

	public static final String NAME_REGEX = "^[A-Z]{1}[a-zA-Z]{2,}+$"; // using Regex
	public static final String EMAIL_REGEX = "^([a-z0-9]+.)+@([a-z0-9]+.)([a-z]+.)[a-z]{2,3}+$";
	public static final String MOBILE_REGEX = "^[0-9]{2}[ ]{1}[0-9]{10}+$";
	private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.+[!@#$%^&+=._-])[A-Za-z0-9].{8,}+$";

	// junit test cases
	public boolean validateFirstName(String firstName) {
		return Pattern.matches(NAME_REGEX, firstName);
	}

	public boolean validateLastName(String SecondName) {
		return Pattern.matches(NAME_REGEX, SecondName);
	}

	public boolean validateEmail(String email) {
		return Pattern.matches(EMAIL_REGEX, email);
	}

	public boolean validateMobile(String mobile) {
		return Pattern.matches(MOBILE_REGEX, mobile);
	}

	public boolean validatePassword(String password) {
		return Pattern.matches(PASSWORD_REGEX, password);
	}
}