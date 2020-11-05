package com.mk.jkb.base05;

public class Date {
	private int day;
	private int month;
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setMonth(int month) {
		if(month > 12) {
			this.month = 12;
		}else {
			this.month = month;
		}
	
	}
	
	public int getMonth() {
		return month;
	}
}
