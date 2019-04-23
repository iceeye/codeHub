package com.codehub.leetcode;

public class LeetCode33 {
	/**
	 * 二分查找，递归
	 * 理清思路，列举所有可能的情况，
	 * 每一次二分可能有一半是有序集合一半是反转集合，也有可能两边都是有序集合
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search(int[] nums, int target) {
		// 空数组，直接返回-1
		if(nums == null || nums.length == 0) {
			return -1;
		}
        return search(nums, 0, nums.length - 1, target);
    }
	
	private int search(int[] nums, int start, int end ,int target) {
		if(nums[start] == target) {
			return start;
		}
		if(nums[end] == target) {
			return end;
		}
		// 未找到结果
		if(end - start <= 1) {
			return -1;
		}
		int mid = (start + end + 1) / 2;
		if(nums[mid] == target) {
			return mid;
		}
		// 结果在左半部分有序集中
		if(nums[start] < nums[mid] && target > nums[start] && target < nums[mid]) {
			return search(nums, start, mid, target);
		}
		
		// 结果在右半部分有序集中
		if(nums[mid] < nums[end] && target > nums[mid] && target < nums[end]) {
			return search(nums, mid, end, target);
		}
		
		// 结果在左半部分反转集中
		if(nums[start] > nums[mid]) {
			return search(nums, start, mid, target);
		}
		
		// 结果在有半部分反转集中
		return search(nums, mid, end, target);
	}
}
