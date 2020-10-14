package com.mk.jkb.base03;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字：

  1.产生一个100以内的随机整数 (只做一次)   number

  2.从键盘输入一个数字 input

  3.如果 input > number 打印您输入的数字大了 请再猜

  4.如果 input < number 打印您输入的数字小了 请再猜

  5.如果 input == number 恭喜您猜对了 产生的随机数是：number
 * @author Administrator
 *
 */
public class Test02 {

	public static void main(String[] args) {
		Random random = new Random();
        Scanner reader = new Scanner(System.in);
        int getNumber = 0;//存储从键盘获得的数
        int times;//记录猜测的次数
        int select = 1;//判断选择开始/结束,1进行游戏，0结束
        int guessSelect = 1;//猜测10次后,1继续猜测，0结束
        start:     
        do{
        times = 0;//更新猜测次数为0
        int createRandom = random.nextInt(100)+1;//nextInt生成上限为100的整数，不包括100
        do{
                times++; 
                try{
                     System.out.print("请猜测一个数（1-100）：");
                     getNumber =reader.nextInt();
                }catch(Exception e){
                      System.out.println("输入不为数字！系统即将退出！本轮游戏结束！");
                      break start;                  
                }
                 if(getNumber > 100){
                     System.out.println("第"+times+"次输入数字超过要求范围!");
                  }
                 else if(getNumber < createRandom){
                      System.out.println("第"+times+"次猜测     猜小了！");
                  }
                  else if(getNumber > createRandom){
                       System.out.println("第"+times+"次猜测     猜大了！");        
                   } 
                    if(times/10 > 0 && times%10 == 0){
                        System.out.print("请选择‘继续猜测’（1）或者‘公布答案’（0）：");
                        getNumber = reader.nextInt();             
                        guessSelect = getNumber;
                        if(guessSelect==0){
                           break;
                        }
                    } 
             }while(getNumber != createRandom);
                   if(times/10 > 0 && times%10 == 0){
                        System.out.println("已猜测"+times+"次，未猜中，游戏失败！\n本局的正确数字为："+createRandom);
                   }
                   else{
                        System.out.println("恭喜你！第"+times+"次猜对了！");
                   }
                   
             System.out.print("请选择‘重新开始’（1）或者‘结束’（0）：");
             getNumber = reader.nextInt();             
             select = getNumber; 
        }while(select==1);      

	}

}
