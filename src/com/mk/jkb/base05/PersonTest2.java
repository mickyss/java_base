package com.mk.jkb.base05;

public class PersonTest2 {

	public static void main(String[] args) {
		Person2 person2 = new Person2() {
			@Override
			public void add() {
				// TODO Auto-generated method stub
				System.out.println("add");
			}
		};
		
		person2.add();
		
		
		Person3 person3 = new Person3();
		person3.add();
	}

}
