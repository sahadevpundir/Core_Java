package com.training.core.basic_java_app;

public class Assignment5 {
	public int StudentID;
	public String StudentName;
	public int StudentAge;
	public int Marks1;
	public int Marks2;
	public int Marks3;

	public Assignment5(int studentID, String studentName, int studentAge, int marks1, int marks2, int marks3) {
		super();
		StudentID = studentID;
		StudentName = studentName;
		StudentAge = studentAge;
		Marks1 = marks1;
		Marks2 = marks2;
		Marks3 = marks3;
	}
	public void result() {
		int total = Marks1 + Marks2 + Marks3;
		double percentage = total / 3;
		System.out.print(StudentID + "\t" + StudentName + "\t" + StudentAge + "\nTotal : " + total + "\tPercentage : "
				+ percentage);
		if (percentage >= 50) {
			System.out.println("\tPASS");
		} else {
			System.out.println("\tFAIL");
		}
	}
	public static void main(String[] args) {
		Assignment5 a, b;

		a = new Assignment5(100, "Ram", 22, 76, 84, 89);
		b = new Assignment5(200, "Shyam", 23, 48, 31, 58);

		a.result();
		b.result();
	}

}
