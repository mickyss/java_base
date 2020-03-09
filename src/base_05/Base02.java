package base_05;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字：
 *
 *   1.产生一个100以内随机整数 (只做一次)   number
 *
 *   2.从键盘输入一个数字 input
 *
 *   3.如果 input > number 打印您输入的数字大了 请再猜
 *
 *   4.如果 input < number 打印您输入的数字小了 请再猜
 *
 *   5.如果 input == number 恭喜您猜对了 产生的随机数是：number
 *
 * @author yyuanchao
 * @description
 * @since 2020/3/9 0009
 */
public class Base02 {
    public static void main(String[] args) {
        //系统产生一个1-100之间的随机数
        Random r = new Random();
        //获取随机数
        //生成0-100的随机数
        int number = r.nextInt(100) + 1;
        //多次猜数据
        while(true) {
            //键盘录入我们要猜的数据
            Scanner sc = new Scanner(System.in);
            //接收数据
            System.out.println("请输入你要猜的数据(1-100)：");
            int input = sc.nextInt();

            //比较这两个数据,用if语句实现
            if (input>number){
                System.out.println("您猜的数字"+input+"大了");
            }
            else if (input<number){
                System.out.println("您猜的数字"+input+"小了");
            }else{
                System.out.println("恭喜您猜中了！");
                break;
            }

        }
    }
}
