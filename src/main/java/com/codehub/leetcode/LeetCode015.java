package com.codehub.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode015 {

	public static void main(String[] args) {
		int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
		List<List<Integer>> list = new LeetCode015().threeSum(nums);
		System.out.println(list.toString());
		int[] nums1 = new int[]{-2, 1, 1, 1, -1, -4};
		list = new LeetCode015().threeSum(nums1);
		System.out.println(list.toString());
		int[] nums2 = new int[]{};
		list = new LeetCode015().threeSum(nums2);
		System.out.println(list.toString());
		int[] nums3 = new int[]{-1,0,1,2,-1,-4};
		list = new LeetCode015().threeSum(nums3);
		System.out.println(list.toString());
	}
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(nums == null || nums.length == 0) return list;//空数据，直接返回，避免NPE
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 2; i++) {
			if(nums[i] > 0) break;//当nums[i]>0，后续不存在解
			if(nums[nums.length-1] < 0) break;
			if(i > 0 && nums[i] == nums[i-1]) continue;//防止重复元素
			int k = i + 1;
			int j = nums.length -1;
			int target  = -nums[i];
			while(k < j) {
				if(nums[k] + nums[j] == target) {
					List<Integer> iList = Arrays.asList(nums[i], nums[k], nums[j]);
					list.add(iList);
					//防止重复元素
					while(k < j && nums[k] == nums[k + 1]) k++;
					while(k < j && nums[j] == nums[j - 1]) j--;
					k++;j--;
				} else if(nums[k] + nums[j] < target) {
					k++;
				} else {
					j--;
				}
			}
		}
		return list;
	}
	
	/*public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(nums == null || nums.length == 0) return list;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length - 2; i++) {
        	if(i > 0 && nums[i] == nums[i-1]) continue;
        	for(int j = i + 1; j < nums.length - 1; j++) {
        		if(j > i + 1 && nums[j] == nums[j - 1]) continue;
        		for(int m = j + 1; m < nums.length; m++) {
        			int target = 0 - nums[i] - nums[j];
        			if(nums[m] == target) {
        				List<Integer> iList = new ArrayList<Integer>();
        				iList.add(nums[i]);
        				iList.add(nums[j]);
        				iList.add(nums[m]);
        				list.add(iList);
        				break;
        			}
        			if(nums[m] > target) {
        				break;
        			}
        		}
        	}
        }
		return list;
    }*/
	
}



