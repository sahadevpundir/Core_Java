package com.training.core.basic_java_app;

public class Assignment3 {
	public static void main(String[] args) {
		areaOfRectangle(3.4f, 5.1f);
		areaOfSquare(7.4f);
	}

	public static void areaOfRectangle(float length, float width) {
		double area;
		area = length * width;

		System.out.println("Area of Rectangle : " + area);
	}

	public static void areaOfSquare(float side) {
		double area;
		area = side * side;

		System.out.println("Area of Square : " + area);
	}
}
