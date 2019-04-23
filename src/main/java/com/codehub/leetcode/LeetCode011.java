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
	  * 对代码进行简单的优化，更简洁清晰
	  */
	public int maxArea(int[] height){
		int maxArea = 0;
		int i = 0;
		int j = height.length - 1;
		while(i < j) {
			//计算求面积的x坐标值
			int xAxis = j - i;
			//计算求面积的y坐标值，计算完后y坐标较小的向中心移一个位置
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
