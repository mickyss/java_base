package com.mk.jkz.base_List;

import java.util.ArrayList;
import java.util.Random;

/**
 * 产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台
 *
 * @author yyuanchao
 * @description
 * @since 2020/4/29 0029
 */
public class Demo01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(100);
            if (arr[i] >= 10) {
                arrayList.add(arr[i]);
            }
        }
        System.out.println(arrayList);
    }
}
