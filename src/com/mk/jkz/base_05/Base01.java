package com.mk.jkz.base_05;

/**
 *
 * 定义一个一维数组 存储学生的成绩
 *
 *       int[] arry = {100,200,399,400,52};
 *
 * 打印输出
 *
 *       求最高分
 *
 *       求最低分
 * @author yyuanchao
 * @description
 * @since 2020/3/9 0009
 */
public class Base01 {
    public static void main(String[] args) {
        int[] arry = {100,200,399,400,52};
        int max_value = 0;
        int min_value = arry[0];
        for(int i=0;i<arry.length;i++){
            if(arry[i] > max_value){
                max_value = arry[i];
            }
            if(arry[i] < min_value){
                min_value = arry[i];
            }
        }
        System.out.println("最高分:" + max_value);
        System.out.println("最低分:" + min_value);
    }
}
