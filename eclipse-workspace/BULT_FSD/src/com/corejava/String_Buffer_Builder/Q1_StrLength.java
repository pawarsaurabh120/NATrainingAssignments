package com.corejava.String_Buffer_Builder;

public class Q1_StrLength {

	public static void main(String[] args) {
		String str ="Capgemini";
		int len= str.length();
		System.out.println(len);
		
		int length=0;	
		char c[]= str.toCharArray();
		for(char s:c) {
			length++;
		}
		System.out.println(length);

	}

}
