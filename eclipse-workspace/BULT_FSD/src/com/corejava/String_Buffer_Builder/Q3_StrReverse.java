package com.corejava.String_Buffer_Builder;

public class Q3_StrReverse {

	public static void main(String[] args) {
//StringBuffer
		StringBuffer str1 = new StringBuffer("This string will be reversed");
		System.out.println("StringBuffer: " + str1.reverse());

//StringBuilder
		StringBuilder str2 = new StringBuilder("This string will be reversed");
		System.out.println("StringBuilder: " + str2.reverse());
	}
}
