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

        System.out.println("--------随机点名器--------");
        // 创建一个存储多个同学名字的容器（数组）
        String[] students = new String[3];
        //录入学生信息方法
        addStudentName(students);

        //.获取随机点名到的学生姓名，并打印
        String randomName = randomStudentName(students);
        System.out.println("被点到名的同学是 :" + randomName);

    }
    public static void addStudentName(String[] students) {
        //键盘输入多个同学名字存储到容器中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("存储第" + i + "个名称：");
            students[i] = sc.next();
        }
    }

    public static String randomStudentName(String[] students) {
        //根据数组长度，获取随机索引
        int index = new Random().nextInt(students.length);
        //通过随机索引从数组中获取名称
        String name = students[index];
        //返回随机点到的名称
        return name;
    }
}
