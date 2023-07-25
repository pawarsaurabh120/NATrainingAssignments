package com.corejava.Assign1;

//Amstrong Number
import java.util.Scanner;

public class Q1_Amstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int temp = num;

		int length = String.valueOf(num).length();
		double sum = 0;

		while (num > 0) {
			int r = num % 10;
			sum = sum + Math.pow(r, length);
			num = num / 10;
		}
		int c = (int) sum; //type casting double to int

		if (temp == c) {
			System.out.println(temp + " is Amstrong Number");
		} else {
			System.out.println("Not Amstrong Number");
		}
	}
}
