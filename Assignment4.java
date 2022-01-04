package com.training.core.basic_java_app;

public class Assignment4 {

	public static void main(String[] args) {
		minimum(10, 20, 30);
	}

	public static void minimum(int a, int b, int c) {
		int min;
		if (a < b) {
			min = a < c ? a : c;
		} else {
			min = b < c ? b : c;
		}

		System.out.println("Minimum number is : " + min);
	}
}
