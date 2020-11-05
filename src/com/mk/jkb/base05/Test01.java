package com.mk.jkb.base05;

public class Test01 {
	public static void main(String[] args) 	{
		
		Fu f = new Zi();
		
		System.out.println(f.num);
		f.show();
//		Zi z = (Zi)f;
//		System.out.println(z.num);
		
//		f.show();
		
	}
}
class Fu {
	int num = 4;
	void show()	{
		System.out.println("Fu show num" + this.num);
	}
}
class Zi extends Fu {
	int num = 5;
	void show()	{
		System.out.println("Zi show num" + num);
	}
}
