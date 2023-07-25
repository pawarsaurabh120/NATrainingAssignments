package com.corejava.String_Buffer_Builder;

public class Q2_InsertTxt {

	public static void main(String[] args) {
//StringBuffer
		StringBuffer str = new StringBuffer("It is used to_insert her");
		String str1 = new String(" INSERTED TEXT ");
		int a = str.indexOf("_");
		str.replace(a, a + 1, str1);
		System.out.println("StringBuffer: " + str.toString());

//StringBuilder
		StringBuilder s = new StringBuilder("It is used to_insert her");
		String s1 = new String(" INSERTED TEXT ");
		int b = str.indexOf("_");
		s.replace(a, a + 1, s1);
		System.out.println("StringBuilder: " + s.toString());
	}

}
