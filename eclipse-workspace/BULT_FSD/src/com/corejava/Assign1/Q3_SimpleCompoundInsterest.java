package com.corejava.Assign1;

import java.util.Scanner;
//Find Simple and Compound Interest

public class Q3_SimpleCompoundInsterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal Amount: ");
		double Principal = sc.nextDouble();
		System.out.print("Enter Rate of Intrest: ");
		double Rate = sc.nextDouble();
		System.out.print("Enter Duration : ");
		double Duration = sc.nextDouble();

		double SI = (Principal * Duration * Rate) / 100;
		double CI = Principal * Math.pow(1.0 + Rate / 100.0, Duration) - Principal;

		System.out.println("Simple Interest=" + SI);
		System.out.println("Compound Interest=" + CI);
	}
}
