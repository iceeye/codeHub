package com.codehub.leetcode;

import java.util.Arrays;

public class LeetCode16 {

	public static void main(String[] args) {
		int[] nums = new int[]{-1, 2, 1, -4};
		int rslt = new LeetCode16().threeSumClosest(nums, 1);
		System.out.println(rslt);
	}
	public int threeSumClosest(int[] nums, int target) {
		if(nums == null || nums.length == 0) {
			throw new NullPointerException("Input array is null.");
		}
		Arrays.sort(nums);
		// 表示当前三数之和到target的距离，即target减去三数之和的结果的绝对值
		int distance = Integer.MAX_VALUE;
		//表示最接近target的三数之和
		int sumClosest = 0;
		for(int i = 0; i < nums.length - 2; i++) {
			int l = i + 1,r = nums.length - 1; 
			while(l < r) {
				int curDistance = Math.abs(target - (nums[i] + nums[l] + nums[r]));
				int curSumClosest = nums[i] + nums[l] + nums[r];
				if(curSumClosest == target) {
					return target;
				}
				if(curDistance < distance) {
					distance = curDistance;
					sumClosest = curSumClosest;
				}
				
				if(target < (nums[i] + nums[l] + nums[r])) {
					r--;
				} else {
					l++;
				}
			}
		}
		
		return sumClosest;
	}
	
}



