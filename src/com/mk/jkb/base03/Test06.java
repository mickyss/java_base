package com.mk.jkb.base03;

import java.util.Scanner;

/**
 * 请将”我” “爱” “java”存入数组，然后正着和反着输出



注：字符串转字符数组可使用 char [] strArr1 = string1.toCharArray(); //注意返回值是char数组
 * @author Administrator
 *
 */
public class Test06 {

	public static void main(String[] args) {
		String str = "我爱Java";
		char[] strChar = str.toCharArray();
		for(int i=0; i<strChar.length; i++){
			System.out.print(strChar[i]);
		}
		System.out.println();
		for(int i = strChar.length - 1; i>=0; i--){
			System.out.print(strChar[i]);
		}

	}

}
