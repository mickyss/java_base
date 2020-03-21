package base_06;

import java.util.Scanner;

/**
 * @Author yanyc
 * @Description //TODO $
 * @Date 2020/3/16  23:00
 **/
public class Test08 {
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        String []arry=new String[7];//键盘读入七个数
        for(int i=0;i<arry.length;i++) {
            arry[i]=sc.next();
        }
        for(int j=0;j<arry.length;j++) {
            System.out.print(arry[j]+",");
        }//显示输入的七个数
        sym(arry);//调用方法
    }
    //定义判断对称的方法
    public static void sym(String []arry1) {
        boolean flag=false;
        for(int i=0;i<arry1.length/2;i++) {
            if(arry1[i]==arry1[arry1.length-1-i]) {
                flag=true;
            }else
                flag=false;
        }
        if(flag) {
            System.out.print("是否对称："+"true");

        }else {
            System.out.print("是否对称："+"false");
        }
    }
}
