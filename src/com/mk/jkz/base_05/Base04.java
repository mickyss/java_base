package com.mk.jkz.base_05;

import java.util.Random;
import java.util.Scanner;

/**
 * 目标：随机点名
 * <p>
 * 1. 定义一个字符串数组
 * <p>
 * 2. 从键盘录入多个学生的姓名存储到数组中
 * <p>
 * 3. 产生一个[0,数组长度)的随机数
 * <p>
 * 4. 通过产生的随机数 找到数组对应的下标元素的值
 * <p>
 * 5. 打印出来产生的随机数对应的学生姓名
 * <p>
 * <p>
 * <p>
 * 要求：
 * <p>
 * 1.从键盘录入学生信息封装到一个方法中
 * <p>
 * 2.产生随机数的功能封装到一个方法中 返回一个随机数
 *
 * @author yyuanchao
 * @description
 * @since 2020/3/9 0009
 */
public class Base04 {

    public static void main(String[] args) {

        // 创建一个存储多个同学名字的容器（数组）
        String[] students = new String[3];
        //调用录入学生的方法
        addStudents(students);
        //随机点名
        int index = getRandom();
        System.out.println("学生" + students[index]);
        
    }
    
    public static int getRandom() {
        Random r = new Random();
        int index = r.nextInt(3);
        System.out.println("随机数" + index);
        return index;
    }
    
	//从键盘录入学生信息
	public static void addStudents(String[] students) {
		Scanner sc = new Scanner(System.in);
        System.out.println("请录入3个学生姓名");
        for(int i=0;i<students.length;i++) {
        	students[i] = sc.next();	
        	if((i+1) != students.length) {
        		System.out.println("请继续录入");	
        	}
        }
	        
	}
    
   
}
