package cn.bdqn.demo1;

import java.util.Arrays;

public class Test {

	/**
	 * ð������
	 * 01.���ѭ��N-1   ��N������ĳ��ȣ�
	 * 02.�ڲ�ѭ��N-1-i (i:�Ƚϵ����������ѭ���ı���)
	 * 03.������� С��ǰ��������е���ת��������λ�ã�
	 * 
	 */
	public static void main(String[] args) {
		int [] nums={11,77,44,88,99,33,22,66,55};
		// ���ѭ����������
		for (int i = 0; i < nums.length-1; i++) {
			// �ڲ�ѭ�����ƱȽϴ���
			for (int j = 0; j < nums.length-1-i; j++) {
				 // ������� С��ǰ�� ��������С����Ҫ��ǰ������ݻ���λ��
				if(nums[j+1]<nums[j]){
					int temp=0;
					temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println("����֮�������:"+Arrays.toString(nums));
	}
}
