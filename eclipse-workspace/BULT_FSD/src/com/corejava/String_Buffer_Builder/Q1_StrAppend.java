package com.corejava.String_Buffer_Builder;

public class Q1_StrAppend {

	public static void main(String[] args) {
//StringBuffer
		StringBuffer str = new StringBuffer("String Buffer ");
		StringBuffer str1 = new StringBuffer("is peer class ");
		StringBuffer str2 = new StringBuffer("of java.");
		str.append(str1);
		str.append(str2);
		System.out.println("StringBuffer: " + str);

//StringBuilder
		StringBuilder s = new StringBuilder("String Buffer ");
		StringBuilder s1 = new StringBuilder("is peer class ");
		StringBuilder s2 = new StringBuilder("of java.");
		s.append(s1);
		s.append(s2);
		System.out.println("StringBuilder: " + s);
	}
}
