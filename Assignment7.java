package com.training.core.basic_java_app;

public class Assignment7 {

	public void luckyNumber(int n) {
		int sum;
		sum = sumOfDigit(n);
		System.out.println("Lucky Number is - " + sum);
	}

	public int sumOfDigit(int n) {
		int x, y, add = 0;
		for (int i = 0; i < n; i++) {
			x = n / 10;
			y = n % 10;
			add = add + y;
			n = x;
			if (n < 10) {
				add = add + n;
				break;
			}
		}
		if (add > 10) {
			add = sumOfDigit(add);
		}
		return add;
	}

	public static void main(String[] args) {
		Assignment7 a = new Assignment7();
		a.luckyNumber(273541869);
	}
}
