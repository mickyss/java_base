package com.mk.jkz.base_05;

import java.util.Random;

/**
 *
 *
     模拟大乐透号码：

     一组大乐透号码由10个1-99之间的数字组成

     定义方法，打印大乐透号码信息
 * @author yyuanchao
 * @description
 * @since 2020/3/9 0009
 */
public class Base06 {
    public static void main(String[] args) {
        System.out.println("您的大乐透号码为：");
        //声明并创建数组
        int[] array = new int[10];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(99)+1;
        }
        printNum(array);
    }

    public static void printNum(int[] arr) {
        System.out.println("您的大乐透号码为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
