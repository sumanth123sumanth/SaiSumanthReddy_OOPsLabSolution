package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class Driver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int dep;
		 String firstName;
		 String lastName;
		 String generatedEmail;
		 String generatedPassowrd;
		 Employee employee;
		final String[] departments = {"Technical","Admin","Human Resource","Legal"};
		System.out.println("Please enter the department from the following");
		for(int i=0;i<departments.length;i++)
		{
			System.out.println((i+1)+". "+departments[i]);
		}
		dep = sc.nextInt();
		System.out.print("Please enter your first name:");
		firstName = sc.next();
		System.out.print("Please enter your last name:");
	    lastName = sc.next();
	    employee = new Employee(firstName, lastName);
	    CredentialService cs = new CredentialService();
		switch(dep)
		{
		case 1:
			generatedEmail = cs.generateEmailAddress(employee, "tech");
			generatedPassowrd = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassowrd);
			break;
		case 2:
			generatedEmail = cs.generateEmailAddress(employee, "admin");
			generatedPassowrd = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassowrd);
			break;
		case 3:
			generatedEmail = cs.generateEmailAddress(employee, "hr");
			generatedPassowrd = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassowrd);
			break;
		case 4:
			generatedEmail = cs.generateEmailAddress(employee, "legal");
			generatedPassowrd = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassowrd);
			break;
		default:
			System.out.println("Invalid option selected");
		}

	}

}
