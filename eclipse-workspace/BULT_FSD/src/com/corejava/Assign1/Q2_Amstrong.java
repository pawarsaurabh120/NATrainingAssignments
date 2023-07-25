package com.corejava.Assign1;

public class Q2_Amstrong {

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			if (isAmstrong(i)) {
				System.out.println(i + " is Amstrong");
			} 
		}
	}

	private static boolean isAmstrong(int i) {
		int temp = i;
		int length = String.valueOf(i).length();
		double sum = 0;

		while (i > 0) {
			int r = i % 10;
			sum = sum + Math.pow(r, length);
			i = i / 10;
		}
		int result = (int) sum;
		if (result == temp) {
			return true;
		} else {
			return false;
		}
	}

}
