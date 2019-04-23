package com.codehub.leetcode;

import java.util.Arrays;

public class LeetCode26 {

	public static void main(String[] args) {
		int[] nums = new int[]{1,1,2};
		System.out.println("length : " + new LeetCode26().removeDuplicates(nums));
		System.out.println("Array string : " + Arrays.toString(nums));
		nums = new int[]{0,0,1,1,1,2,2,3,3,4};
		System.out.println("length : " + new LeetCode26().removeDuplicates(nums));
		System.out.println("Array string : " + Arrays.toString(nums));
	}
	
	public int removeDuplicates(int[] nums) {
		// 空数组直接返回
		if(nums == null || nums.length == 0) {
			return 0;
		}
        // 结果数组长度
		int iDup = 1;
		// 用于标记去除重复元素
		int curValue = nums[0];
		for(int num : nums) {
			if(num == curValue) {
				continue;
			}
			curValue = num;
			nums[iDup] = num;
			iDup++;
		}
		return iDup;
    }
}
