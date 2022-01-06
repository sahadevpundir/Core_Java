package com.training.core.basic_java_app;

public class Assignment1 {

	public static void division(int first, int second) {
		int quotient, remainder;
		quotient = first / second;
		remainder = first % second;

		System.out.println("Quotient is - " + quotient);
		System.out.println("Remainder is - " + remainder);
	}
	
	public static void main(String[] args) {
		division(14, 5);
	}
}
