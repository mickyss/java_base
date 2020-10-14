package com.mk.jkz.base_06;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author yanyc
 * @Description //TODO $
 * @Date 2020/3/15  10:11
 **/
public class Test01 {

//   public static void sample(int a){
//        a+=20;
//        System.out.println("a:" + a);
//   }
//
//    public static void main(String[] args) {
//       int b = 10 ;
//       sample(b);
//       System.out.println("b:" + b);
//
//    }
//    public static void swap(String a){
//        a += " world";
//        System.out.println(a);
//    }
//
//    public static void main(String[] args){
//        String a = "hello ";
//        swap(a);
//        System.out.print(a);
//    }

    public static void swap(int[] a){
        int c = a[0];
        a[0] = a[1];
        a[1] = c;
//        System.out.println(a[0]);
//        System.out.println(a[1]);
    }

    public static void main(String[] args){
//        int[] a = new int[2];
//        a[0] = 10;
//        a[1] = 20;
//        swap(a);
//        System.out.println("------------------");
//        System.out.println(a[0]);
//        System.out.println(a[1]);

//        Student student = new Student();
//        student.setUserName("xxxxx");
//        String name = student.getUserName();
//        System.out.println(name);
//        System.out.println(student.getUserName());
//        student.setUserName("jjjjjj");
//        System.out.println(name);
//        System.out.println(student.getUserName());
        //删除一周前数据
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        Calendar c = Calendar.getInstance();
//
//        //过去七天
//        c.setTime(new Date());
//        c.add(Calendar.DATE, - 7);
//        Date d = c.getTime();
//        String day = format.format(d);
//        System.out.println("过去七天："+day);
//        String imm = "3";
//        String prom = "2";
//        if(!imm.equals("1") && !prom.equals("1")){
//            System.out.println("进来了");
//        }else{
//            System.out.println("没进去");
//        }
//        int i = 5234;
//        System.out.println(i/1000);

//        int[] arr = {1,2,3,4,5,5};
//        System.out.println(Arrays.toString(arr));

        int[] arr = {1,2,3,4,3,2,1};
        System.out.println(Arrays.toString(arr) +" 是否对称:" +sym(arr) );

        int[] arr2 = {1,2,3,4,3,2,6};
        System.out.println(Arrays.toString(arr2) +" 是否对称:" +sym(arr) );

    }

    public static boolean sym(int[] arr) {
        /*
        start : 数组头
        end :数组尾
         */
        for (int start = 0 , end = arr.length -1 ; start <= end; start++, end--) {
            // 如果两端一旦有元素不等,就返回false
            if (arr[start] != arr[end]) {
                return false;
            }
        }
        return true;
    }

}

