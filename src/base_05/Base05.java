package base_05;

import java.util.Scanner;

/**
 * //定义键盘输入类的对象
 * <p>
 * Scanner sc = new Scanner(System.in);
 * <p>
 * //定义一个无限循环
 * <p>
 * while(true) {
 * <p>
 * //1.打印操作命令提示
 * <p>
 * System.out.println("------------系统指令--------------");
 * <p>
 * System.out.println("指令： A 表示开始求和计算");
 * <p>
 * System.out.println("指令： Q 表示退出程序");
 * <p>
 * <p>
 * //2.输入和接收指令
 * <p>
 * String key = sc.next();//等待从键盘输入内容
 * <p>
 * //3.对指令进行判断 如果输入的是A 开始计算 ，如果输入的是Q退出程序
 * <p>
 * if("A".equals(key)) {
 * <p>
 * System.out.println("请输入一个大于0的正整数");
 * <p>
 * int input = sc.nextInt();
 * <p>
 * //计算0到这个input之间所有整数的和 包含输入的正整数
 * <p>
 * int sum = 0;//存储计算后的和
 * <p>
 * for(int i=0;i<=input;i++) {
 * <p>
 * sum +=i;
 * <p>
 * }
 * <p>
 * System.out.println("0到" + input + "之间所有整数的和是：" + sum);
 * <p>
 * }else if("Q".equals(key)) {//如果输入的不是A 再判断输入的是否是Q
 * <p>
 * System.out.println("退出程序");
 * <p>
 * //sc.close();
 * <p>
 * break;//跳出当前while循环
 * <p>
 * }else {
 * <p>
 * System.out.println("您输入的指令无效，请重新输入指令");
 * <p>
 * }
 * <p>
 * }
 * <p>
 * sc.close();
 * <p>
 * <p>
 * <p>
 * 目标：将以上代码封装成多个方法完成
 * <p>
 * 要求
 * <p>
 * 1.打印操作命令提示封装成一个方法
 * <p>
 * 2.累加求和的逻辑封装成一个方法
 *
 * @author yyuanchao
 * @description
 * @since 2020/3/9 0009
 */
public class Base05 {

    public static void main(String[] args) {
        //定义键盘输入类的对象
        Scanner sc = new Scanner(System.in);
        //定义一个无限循环
        while (true) {
            //1.打印操作命令提示
            systemTip();
            //2.输入和接收指令
            //等待从键盘输入内容
            String key = sc.next();
            //3.对指令进行判断 如果输入的是A 开始计算 ，如果输入的是Q退出程序
            if ("A".equals(key)) {
                int input = sc.nextInt();
                //计算0到这个input之间所有整数的和 包含输入的正整数
                //存储计算后的和
                int sum = plus(input);
                System.out.println("0到" + input + "之间所有整数的和是：" + sum);
                //如果输入的不是A 再判断输入的是否是Q
            } else if ("Q".equals(key)) {
                System.out.println("退出程序");
                sc.close();
                break;//跳出当前while循环
            } else {
                System.out.println("您输入的指令无效，请重新输入指令");
            }
        }
        sc.close();
    }
    public static void systemTip(){
        System.out.println("------------系统指令--------------");
        System.out.println("指令： A 表示开始求和计算");
        System.out.println("指令： Q 表示退出程序");
    }
    public static int plus(int input){
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += i;
        }
        return sum;
    }
}
