package com.mk.jkb.base05;

/**
 * 交通工具Vehicle
 * @author Administrator
 *
 */
public class Vehicle {
	
	double speed;
	String type;
	
	public void move() {
		System.out.println("交通工具:" + type + "正在以速度" + speed
				+ "移动");
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void speedUp(double speed) {
		this.speed += speed;
	}
	
	public void speedWodn(double speed){
		this.speed -= speed;
	}

	public Vehicle(double speed, String type) {
		super();
		this.speed = speed;
		this.type = type;
	}
	
	
}
