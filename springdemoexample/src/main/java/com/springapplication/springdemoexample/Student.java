package com.springapplication.springdemoexample;

public class Student 
{
	private String stdid,stdname;

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

	@Override
	public String toString() {
		return "Student Name : " + stdname + "\n Student id : " + stdid + "\n";
	}
	
}
