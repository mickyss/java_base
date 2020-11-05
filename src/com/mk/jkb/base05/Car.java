package com.mk.jkb.base05;



/**
 * 定义汽车类  汽车的名字 汽车的油量 加油方法
 * 编写一个测试类 申明一个汽车类（比如奥迪） 
 * 并调用加油方法 调用完加油方法 显示其剩余油量
 * @author Administrator
 *
 */
public class Car {
	
	public final String name = "car";
	public double oil;
	
	public void addOil(int oil) {
		this.oil += oil;
	}

	

	public double getOil() {
		return oil;
	}

	public void setOil(double oil) {
		this.oil = oil;
	}
	
	
}

