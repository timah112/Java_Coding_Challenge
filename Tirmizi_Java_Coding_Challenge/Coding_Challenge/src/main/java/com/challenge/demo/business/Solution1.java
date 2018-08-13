package com.ibm.demo.business;

public class Solution1 {

	public Solution1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * Boolean methods to determine if the input for the parameters (Password) meets
	 * the requirements. If so, the method returns true. This method basically
	 * checks to see if the password length is more than 4.
	 * 
	 * @param password
	 * @return
	 */
	public static Boolean validatePsswrdCharLngth(String password) {
		int numOfAlphabets = 0;
		for (int counter = 0; counter < password.length(); counter++) {
			// Using java built-in methods to check if the password contains any alphabetic
			// characters:
			if (Character.isAlphabetic(password.charAt(counter))) {
				// counts the number of characters
				numOfAlphabets++;
			}
		}
		if (numOfAlphabets > 4) {
			return true;
		} else
			return false;
	}

	/**
	 * This method is very similar to the one above but I wanted to keep
	 * the functionality modular and so built this method to validate the number length 
	 * of passwords
	 * @param password
	 * @return
	 */
	public static Boolean validatePsswrdNumsLngth(String password) {
		int numOfNumbers = 0;

		for (int counter = 0; counter < password.length(); counter++) {
			if (Character.isDigit(password.charAt(counter))) {
				numOfNumbers++;
			}
		}
		if (numOfNumbers > 2) {
			return true;
		} else
			System.out.println("Please input a password with numbers more than 2");
		return false;
	}

}
