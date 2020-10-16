package com.mk.jkb.base03;

import java.util.Scanner;

/**
 *  目标：将以上代码封装成多个方法完成
	
	要求
	
	      1.打印操作命令提示封装成一个方法
	
	      2.累加求和的逻辑封装成一个方法
	 * @author Administrator
 *
 */
public class Test05 {

	public static void main(String[] args) {
		//定义键盘输入类的对象

		Scanner sc = new Scanner(System.in);

		//定义一个无限循环

		while(true) {

		//1.打印操作命令提示

		System.out.println("------------系统指令--------------");

		System.out.println("指令： A 表示开始求和计算");

		System.out.println("指令： Q 表示退出程序");


		//2.输入和接收指令

		String key = sc.next();//等待从键盘输入内容

		//3.对指令进行判断 如果输入的是A 开始计算 ，如果输入的是Q退出程序

		if("A".equals(key)) {

		System.out.println("请输入一个大于0的正整数");

		int input = sc.nextInt();

		//计算0到这个input之间所有整数的和 包含输入的正整数

		int sum = 0;//存储计算后的和

		for(int i=0;i<=input;i++) {

		    sum +=i;

		}

		System.out.println("0到" + input + "之间所有整数的和是：" + sum);

		}else if("Q".equals(key)) {//如果输入的不是A 再判断输入的是否是Q

		System.out.println("退出程序");

		//sc.close();

		break;//跳出当前while循环

		}else {

		System.out.println("您输入的指令无效，请重新输入指令");

		}

		}

		sc.close();

	}

}
