package com.mk.jkb.base03;

/**
 *
 * 对数组的数据从大到小排序
 *
 *   int[] array = {100,200,30,300,40,200,500,50,38};
 *
 *   要求 排序后的就结果还在array中存储
 *
 * 打印排序结果
 * @author yyuanchao
 * @description
 * @since 2020/10/16 0016
 */
public class Test03 {
	
	public static void main(String[] args) {
		int[] arr = {100,200,30,300,40,200,500,50,38};
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		sortPop(arr);
		
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+"\t");
		}
	}


	//sortPop:冒泡排序;
	//冒泡排序（Bubble Sort）
	//冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。 

	//1.1 算法描述
	//比较相邻的元素。如果第一个比第二个大，就交换它们两个；
	//对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
	//针对所有的元素重复以上的步骤，除了最后一个；
	//重复步骤1~3，直到排序完成。
	public static void sortPop(int[] arr){
		if(arr !=null&&arr.length !=0){
			for(int i=0;i<arr.length-1;i++){
				for(int j=0;j<arr.length-1-i;j++){
					if(arr[j+1]>arr[j]){
							int tmp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=tmp;
						}
					}
				}
			}
		return;
	}
}
