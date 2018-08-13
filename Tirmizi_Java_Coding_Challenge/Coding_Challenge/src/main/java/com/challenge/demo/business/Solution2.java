package com.ibm.demo.business;

public class Solution2 {

	public Solution2() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Java Method to find the Generic root of any given number:
	 * @param num
	 * @return
	 */
	public static int findGenericRoot(int num) {
		int sum = 0;
		int remainder = 0;

		if (num == 0)
			return -1;

		// Creating a while loop to loop through each
		// digit as long as the number is greater than 10.
		if (num >= 10) {
			while (num >= 10) {
				// Iterate through each value one-by-one, so that that each number can be added
				// to each other and add up to the "sum".
				for (sum = 0; num > 0; num = num / 10) {
					remainder = num % 10;
					sum = sum + remainder;
				}
				if (sum >= 10) {
					num = sum;
				} else {
					System.out.println("THE GENERIC ROOT OF THE NUMBER IS: " + sum);
				}
			}
		} else {
			//If the number is less than 2 digits, this will be the output:
			System.out.println("Please re-enter a number greater than 2 digits.");
		}
		return sum;
	}

}
