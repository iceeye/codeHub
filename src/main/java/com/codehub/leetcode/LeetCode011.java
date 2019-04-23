package com.codehub.leetcode;

import static java.lang.System.out;

/**
 * @author Administrator
 * @version 1.0
 * @since 2018/11/27
 */
public class LeetCode011 {

	public static void main(String[] args) {
		int[] height = new int[]{1,8,6,2,5,4,8,3,7};
		out.println(new LeetCode011().maxArea(height));
		height = new int[]{1,100,98,2,5,4,8,3,7};
		out.println(new LeetCode011().maxArea(height));
		height = new int[]{1,2};
		out.println(new LeetCode011().maxArea(height));
	}
	/** 
	  * �Դ�����м򵥵��Ż������������
	  */
	public int maxArea(int[] height){
		int maxArea = 0;
		int i = 0;
		int j = height.length - 1;
		while(i < j) {
			//�����������x����ֵ
			int xAxis = j - i;
			//�����������y����ֵ���������y�����С����������һ��λ��
			int lengthMin = (height[i] < height[j]) ? height[i++] : height[j--];
			maxArea = Math.max(lengthMin*xAxis, maxArea);
		}
		return maxArea;
	}
	
	/*public int maxArea(int[] height){
		int maxArea = 0;
		for(int i = 0; i < height.length - 1; i++) {
			for(int j = i +1; j < height.length; j ++) {
				int tempArea = Math.min(height[i], height[j])*(j-i);
				if(tempArea > maxArea) {
					maxArea = tempArea;
				}
			}
		}
		return maxArea;
	}*/
	
}
