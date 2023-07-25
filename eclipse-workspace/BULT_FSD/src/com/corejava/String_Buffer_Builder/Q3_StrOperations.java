package com.corejava.String_Buffer_Builder;

public class Q3_StrOperations {

	public static void main(String[] args) {
		String str = "Java String pool refers to collections of string which are stored in heap memory";

//      a)LowerCase
		System.out.println("a) " + str.toLowerCase());

//		b)UpperCase
		System.out.println("b) " + str.toUpperCase());

//		c)Replace 'a' with '$'
		System.out.println("c) " + str.replace('a', '$'));

//		d)contains word 'collection' ?
		System.out.println("d) " + str.contains("collection"));

//		e)check 'java string pool refers to collection of string which are stored in heap memory' matches original string
		String s = "java string pool refers to collection of string which are stored in heap memory";
		if (str.compareTo(s) > 0) {
			System.out.println("e) True");
		} else {
			System.out.println("e) False");
		}

//		f)check 'java string pool refers to collection of string which are stored in heap memory' matches original string
		if (str.compareToIgnoreCase(s) > 0) {
			System.out.println("f) True");
		} else {
			System.out.println("f) False");
		}

	}
}
