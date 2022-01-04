package com.training.core.basic_java_app;

public class Assignment6 {
	public int first;
	public int second;
	public int third;

	public Assignment6(int i, int j, int k) {
		super();
		this.first = i;
		this.second = j;
		this.third = k;
	}

	public void result() {
		int average = (first + second + third) / 3;
		display(average);
	}

	public void display(int ave) {
		if (ave > 90) {
			System.out.println("Grade A+");
		} else if (ave < 90 && ave >= 80) {
			System.out.println("Grade A");
		} else if (ave < 80 && ave >= 70) {
			System.out.println("Grade A-");
		} else if (ave < 70 && ave >= 60) {
			System.out.println("Grade B+");
		} else if (ave < 60 && ave >= 50) {
			System.out.println("Grade B");
		} else {
			System.out.println("FAIL");
		}
	}

	public static void main(String[] args) {
		Assignment6 obj1, obj2, obj3;
		obj1 = new Assignment6(92, 94, 88);
		obj2 = new Assignment6(46, 53, 67);
		obj3 = new Assignment6(31, 24, 48);

		obj1.result();
		obj2.result();
		obj3.result();
	}
}