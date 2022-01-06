package com.training.core.basic_java_app;

import java.util.Scanner;

public class Assignment8 {

	public void multiplyTable(int n) {
		System.out.println("------ Desired table -----");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("\n%d x %d = %d", n, i, n * i);
		}
	}

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number for Table : ");
		number = Integer.parseInt(sc.next());
		sc.close();
		Assignment8 a = new Assignment8();
		a.multiplyTable(number);
	}
}
