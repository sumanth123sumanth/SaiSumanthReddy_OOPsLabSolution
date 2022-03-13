package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallChars = "abcdefghijklmnopqrstuvwxyz";
	String numChars = "0123456789";
	String specialChars = "!@#$%^&*()<>?";
	String passwordCharecters = capitalChars + numChars + smallChars + specialChars;

	public String generatePassword() {
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(8);
		for (int i = 0; i < 8; i++) {
			sb.append(passwordCharecters.charAt(rnd.nextInt(passwordCharecters.length())));
		}
		return sb.toString();
	}

	public String generateEmailAddress(Employee emp, String department) {
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + department.toLowerCase()+ ".abc.com";
	}

	public void showCredentials(Employee emp, String email, String password) {
		System.out.println("Dear " + emp.getFirstName() + " " + emp.getLastName() + " your generated credentials are as follows");
		System.out.println("Email    -----> " + email);
		System.out.println("Password -----> " + password);
	}

}
