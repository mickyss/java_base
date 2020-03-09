package base_05;

import java.util.Arrays;

/**
 * 定义sym方法，判断数组中的元素值是否对称.
 *
 * @author yyuanchao
 * @description
 * @since 2020/3/9 0009
 */
public class Base07 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        printArray(arr);
        System.out.println( " 是否对称:" +sym(arr) );

        int[] arr2 = {1,2,3,4,5,2,1};
        printArray(arr2);
        System.out.println(" 是否对称:" +sym(arr2) );
    }
    public static void printArray(int[] arr){
        //可优化
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            if(i != arr.length-1){
                System.out.print(arr[i] + ",");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.print("}");
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
