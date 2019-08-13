package com.zjw.domain;

public class Student extends People {
	private String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		System.out.println("Hello World!"+1+2);
		return "Student [grade=" + grade + " name= " + super.getName() +"]";
	}

	
}
