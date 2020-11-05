package com.mk.jkb.base05;

public class SymTest {
	
	
	//定义sym 方法 判断数组中元素是否对称
	public static void main(String[] args) {
		int[] a = {1,2,2,1,2,2,1};
		System.out.println(sym(a));
	}
	
	public static boolean sym(int[] a) {
		
		//i=0  a[0]  a[3] 
		//i=1  a[1]  a[2]
		int t =2,u=3;
		for(int i =0,j = a.length -1;i<a.length; i++,j--) {
			if(a[i] != a[j]) {
				return false;
			}
		}
		return true;
	}
	

}
