package com.codehub.leetcode;

import java.util.Arrays;

public class LeetCode27 {

	public static void main(String[] args) {
		int[] nums = new int[]{3,2,2,3};
		int val = 3;
		System.out.println("length : " + new LeetCode27().removeElement(nums, val));
		System.out.println("Array string : " + Arrays.toString(nums));
		nums = new int[]{0,1,2,2,3,0,4,2};
		val = 2;
		System.out.println("length : " + new LeetCode27().removeElement(nums, val));
		System.out.println("Array string : " + Arrays.toString(nums));
	}
	
	public int removeElement(int[] nums, int val) {
		// ������ֱ�ӷ���
		if(nums == null || nums.length == 0) {
			return 0;
		}
        // ������鳤��
		int i = 0;
		for(int num : nums) {
			if(num == val) {
				continue;
			}
			nums[i] = num;
			i++;
		}
		return i;
    }
}
