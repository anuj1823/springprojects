package com.springprojects.entities;
public class Student 
{
	private String stdid,stdname;
	private int roll,age;
	private Address address;
	private DateOfBirth dob;
	public Student(String stdid, String stdname, int roll, int age, Address address, DateOfBirth dob) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.roll = roll;
		this.age = age;
		this.address = address;
		this.dob = dob;
	}
	public String getStdid() {
		return stdid;
	}
	public void setStdid(String stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public DateOfBirth getDob() {
		return dob;
	}
	public void setDob(DateOfBirth dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student Details : \n Student id : " + stdid + "\n Student Name : " + stdname + "\n Roll No. : " + roll + "\n Age :" + age + "year\n address="
				+ address + "\n Date of Birth : " + dob + "";
	}
	
}
