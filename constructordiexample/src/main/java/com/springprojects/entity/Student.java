package com.springprojects.entity;

public class Student 
{
	private String stdid,stdname;
	private int roll,age;
	public Student(String stdid, String stdname, int roll, int age) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.roll = roll;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student Details:\n stdid :" + stdid + "\n Name : " + stdname + "\n Roll No. :" + roll + "\n Age : " + age + " year\n---------------------------------";
	}
	
}
