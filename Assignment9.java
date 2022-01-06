package com.training.core.basic_java_app;

import java.util.Scanner;

public class Assignment9 {

	public void minimumNumber(int a, int b, int c) {
		a = a < b ? a : b;
		a = a < c ? a : c;
		System.out.println("Minimum number is - " + a);
	}
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		a = Integer.parseInt(sc.next());
		b = Integer.parseInt(sc.next());
		c = Integer.parseInt(sc.next());
		sc.close();
		Assignment9 obj = new Assignment9();
		obj.minimumNumber(a, b, c);
	}

}
