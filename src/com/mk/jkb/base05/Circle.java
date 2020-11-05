package com.mk.jkb.base05;

public class Circle {
	double r;
	static final double PI = 3.1415926;
	
	static final double TYPE_FOOD = 1;
	static final double TYPE_TOOL = 2;
	
	public double getMainji() {
		return PI * r * r;
	}
	
	public double getZhouChange() {
		return 2 * PI * r;
	}
	
	public Circle() {
		r = 4;
	}
}
