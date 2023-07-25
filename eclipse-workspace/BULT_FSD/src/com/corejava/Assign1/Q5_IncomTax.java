package com.corejava.Assign1;

import java.util.Scanner;

public class Q5_IncomTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Annual Income: ");
		double income = sc.nextInt();
		double tax;

		if (income > 0 && income < 180000) {
			System.out.println("Nil");
		} 
		else if (income > 180000 && income < 300000) {
			tax = income / 10;
			System.out.println("10% tax dedcuted from Annual Income: " + tax);
		} 
		else if (income > 300000 && income < 500000) {
			tax = income / 20;
			System.out.println("20% tax dedcuted from Annual Income: " + tax);
		} 
		else if (income > 500000 && income < 1000000) {
			tax = income / 30;
			System.out.println("30% tax dedcuted from Annual Income: " + tax);
		}

	}

}
