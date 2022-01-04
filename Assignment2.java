package com.training.core.basic_java_app;

public class Assignment2 {

	public static void main(String[] args) {
		kilometerToMiles(10);
	}

	public static void kilometerToMiles(int kilometer) {
		double miles;
		miles = kilometer * 0.621371;

		System.out.println("Miles is - " + miles);
	}
}
