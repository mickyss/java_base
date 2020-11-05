package com.mk.jkb.base05;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(200,"汽车");
		vehicle.move();
		vehicle.speedUp(200);
		vehicle.move();
		vehicle.speedWodn(350);
		vehicle.move();
		
	}
}
