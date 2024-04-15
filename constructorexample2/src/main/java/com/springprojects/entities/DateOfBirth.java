package com.springprojects.entities;

public class DateOfBirth 
{
	private int date,month,year;

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public DateOfBirth(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date Of Birth(dd/mm/yyyy) : " + date + "/" + month + "/" + year + "";
	}
	
}
