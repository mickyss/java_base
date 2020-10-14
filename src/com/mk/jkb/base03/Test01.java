package com.mk.jkb.base03;

/**
 * 定义一个一维数组 存储学生的成绩

      int[] arryy = {100,200,399,400,52};

	打印输出
	
	      求最高分
	
	      求最低分
	
	      求平均分
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		int[] arry = {100,200,399,400,52};
		int max = arry[0];
		int min = arry[0];
		int sum = 0;
		for(int i=0;i<arry.length;i++){
			if(arry[i]>max) {
				max=arry[i];
			}
			if(arry[i]<min) {
				min=arry[i];
			}
			sum+=arry[i];
		}
		System.out.println("avg:"+(sum/arry.length));
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}

}
