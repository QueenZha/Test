package cn.bdqn.demo1;

import java.util.Arrays;

public class Test {

	/**
	 * 冒泡排序
	 * 01.外层循环N-1   （N：数组的长度）
	 * 02.内层循环N-1-i (i:比较的轮数，外层循环的变量)
	 * 03.两两相比 小靠前！必须进行等量转换！互换位置！
	 * 
	 */
	public static void main(String[] args) {
		int [] nums={11,77,44,88,99,33,22,66,55};
		// 外层循环控制轮数
		for (int i = 0; i < nums.length-1; i++) {
			// 内层循环控制比较次数
			for (int j = 0; j < nums.length-1-i; j++) {
				 // 两两相比 小靠前！ 如果后面的小，需要和前面的数据互换位置
				if(nums[j+1]<nums[j]){
					int temp=0;
					temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println("排序之后的数组:"+Arrays.toString(nums));
	}
}
