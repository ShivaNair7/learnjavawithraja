package com.exercise1;

public class Exercise6 {


public static void main(String[] args) {
	Student s = new Student("Shiva", "Nair");
	System.out.println("School Name : " + Student.schoolName);
	s.showInfo();
	
}
}

class Student{
	
	String firstName;
	String lastName;
	int rollno;
	String location;
	
	
	static String schoolName = "S.I.A School";

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Student Name: " + firstName + " " + lastName);
	}

	public void showInfo() {
		rollno = 7;
		location="Mumbai";
		
		System.out.println("Rollno : " + rollno);
		System.out.println("Location : " + location);
		
	}
	
	
	
	
	
}