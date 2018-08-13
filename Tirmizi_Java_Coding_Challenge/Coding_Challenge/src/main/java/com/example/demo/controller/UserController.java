package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.business.Solution1;
import com.ibm.demo.business.Solution2;
/**
 * 
 * @author atirmizi
 *Using Spring Boot API to work with REST Web Services
 */
@RestController
public class UserController {

	int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

	@RequestMapping("/hello")
	public String test() {
		return "Welcome to IBM Assesment";
	}
	
	/**
	 * This method outputs whether the input of the PW is Valid or Invalid
	 * It passes in the Password as the argument and calls the methods to
	 * check if the requirements are met.
	 * @param bankPassword
	 * @return
	 */
	@RequestMapping("/bankRequirements")
	public String confirmBankRequirements(String bankPassword) {
		bankPassword = "Atifibm1234";


		if (bankPassword == null || bankPassword.isEmpty())
			return null;

		Boolean passwordCharLength = Solution1.validatePsswrdCharLngth(bankPassword);
		Boolean passwordNumLength = Solution1.validatePsswrdNumsLngth(bankPassword);

		if (passwordCharLength && passwordNumLength == true) {
			return "VALID";
		} else
			return "INVALID";
	}

	/**
	 * this Method calls the Find GenericRoot Method and returns the number:
	 */
	@RequestMapping("/FindGenericRoots")
	public void findGenericRoot() {
		Solution2.findGenericRoot(4563);
	}

}
