package com.corejava.Assign1;

import java.util.*;

public class Q6_LoginAttempt {

	public static void main(String[] args) {
		String validUsername = "Saurabh";
		String validPassword = "Sau@12";
		int attempt = 0;

		while (attempt < 3) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Username: ");
			String name = sc.next();
			System.out.print("Enter Password: ");
			String pass = sc.next();

			if (validUsername.equals(name) && validPassword.equals(pass)) {
				System.out.println("Welcome " + name + "...!");
				break;
			} else {
				attempt++;
				System.out.println("Invalid Credential");
			}
		}
		if (attempt >= 3) {
			System.out.println("contact Admin.Too Many attempt.Failed to Login");
		}
	}

}
