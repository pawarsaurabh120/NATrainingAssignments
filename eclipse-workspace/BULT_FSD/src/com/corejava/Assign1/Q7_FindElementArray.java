package com.corejava.Assign1;

public class Q7_FindElementArray {

	public static void main(String[] args) {
		int a[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		for (int i = 0; i < a.length; i++) {
			if (19 == a[i]) {
				System.out.println("19 is present in Array");
				System.exit(0);
			}
		}
		System.out.println("Not Present");
	}

}
