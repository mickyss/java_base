package com.mk.jkb.base05;

public class Phone<T> {
	
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
		
	public static <T> T m1(T t) {
		return t;
	}
	
}
