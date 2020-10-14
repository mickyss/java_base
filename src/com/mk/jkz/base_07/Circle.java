package com.mk.jkz.base_07;
/**
 * 2.创建一个圆Circle类。
 * 为该类提供一个变量r表示半径，一个常量PI表示圆周率；
 * 同时为该类提供两个方法：方法一用于求圆的面积，方法二用于求圆的周长；
 * 为该类提供一个无参的构造方法，用于初始化r的值为4。
 * 在main方法中测试。
 */
//创建一个圆Circle类
public class Circle {

    //为该类提供一个变量r表示半径，一个常量PI表示圆周率
    public double r;
    public final double PI = 3.14;

    //为该类提供一个无参的构造方法，用于初始化r的值为4。
    public Circle() {
        System.out.println("无参数的构造函数：为R赋值为 4 ---");
        r = 4;
    }

    //方法一用于求圆的面积
    public void area() {
        System.out.println(r);
        System.out.println("圆的面积为：" + PI * r * r);
    }

    //方法二用于求圆的周长
    public void girth() {
        System.out.println(r);
        System.out.println("圆的周长为：" + 2 * PI * r);
    }

    // main方法
    public static void main(String[] args) {
        System.out.println("-----");
        Circle c = new Circle();
        System.out.println("-----");
        c.area();
        c.girth();
    }
}