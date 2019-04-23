package com.codehub.leetcode;

import java.util.Arrays;

public class LeetCode31 {

	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3};
		System.out.print("Array string : " + Arrays.toString(nums));
		new LeetCode31().nextPermutation(nums);
		System.out.println(",nextPermutation: " + Arrays.toString(nums));
		nums = new int[]{3, 2, 1};
		System.out.print("Array string : " + Arrays.toString(nums));
		new LeetCode31().nextPermutation(nums);
		System.out.println(",nextPermutation: " + Arrays.toString(nums));
		nums = new int[]{1, 1, 5};
		System.out.print("Array string : " + Arrays.toString(nums));
		new LeetCode31().nextPermutation(nums);
		System.out.println(",nextPermutation: " + Arrays.toString(nums));
		nums = new int[]{5, 3, 4, 2, 1};
		System.out.print("Array string : " + Arrays.toString(nums));
		new LeetCode31().nextPermutation(nums);
		System.out.println(",nextPermutation: " + Arrays.toString(nums));
		nums = new int[]{1, 3, 2};
		System.out.print("Array string : " + Arrays.toString(nums));
		new LeetCode31().nextPermutation(nums);
		System.out.println(",nextPermutation: " + Arrays.toString(nums));
		nums = new int[]{4, 2, 0, 2, 3, 2, 0};
		System.out.print("Array string : " + Arrays.toString(nums));
		new LeetCode31().nextPermutation(nums);
		System.out.println(",nextPermutation: " + Arrays.toString(nums));
		nums = new int[]{2, 2, 3, 4, 2, 3, 1, 1, 2};
		System.out.print("Array string : " + Arrays.toString(nums));
		new LeetCode31().nextPermutation(nums);
		System.out.println(",nextPermutation: " + Arrays.toString(nums));
		nums = new int[]{1, 1};
		System.out.print("Array string : " + Arrays.toString(nums));
		new LeetCode31().nextPermutation(nums);
		System.out.println(",nextPermutation: " + Arrays.toString(nums));
	}
	
	public void nextPermutation(int[] nums) {
		// 空数组和只有一个元素的数组，直接返回
		if(nums == null || nums.length < 2) {
			return;
		}
		int i = nums.length - 2;
		// 从后往前找，数据增大则跳过，如果发现数据变小，则说明找到了更大的排列
		while(i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}
		// If such arrangement is not possible, it must rearrange it as the lowest possible order
		// 没有找到解，元素全部反转
		if(i == -1) {
			reverse(nums, 0);
			return;
		}
		int j = i + 1;
		// 因为i后面的元素是有序的，利用反转对i后面的元素进行排序
		reverse(nums, j);
		// 找到数据交换的位置
		while(nums[j] <= nums[i]) {
			j++;
		}
		swap(nums, i, j);
    }
	
	private void reverse(int[] nums , int start) {
		int i = start;
		int j = nums.length - 1;
		while(i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
	}
	private void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
}
