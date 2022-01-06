package com.training.core.basic_java_app;

public class Assignment8 {

	public void multiplyTable(int n) {
		System.out.println("------ Desired table -----");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("\n%d x %d = %d", n, i, n * i);
		}
	}

	public static void main(String[] args) {
		Assignment8 a = new Assignment8();
		a.multiplyTable(78);
	}

}
