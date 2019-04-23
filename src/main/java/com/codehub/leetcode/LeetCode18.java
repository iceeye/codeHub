package com.codehub.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode18 {

	public static void main(String[] args) {
		int[] nums1 = new int[]{1, 0, -1, 0, -2, 2};
		System.out.println(new LeetCode18().fourSum(nums1, 0).toString());
		
		int[] nums2 = new int[]{};
		System.out.println(new LeetCode18().fourSum(nums2, 0).toString());
		
	}
	
	private List<List<Integer>> fourSum(int[] nums, int target) {
		// �������������null���߳��Ȳ���4λ���򷵻�һ����List
        if(nums == null || nums.length < 4) {
        	return new ArrayList<>();
        }
        List<List<Integer>> tarList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++) {
        	int threeSumTar = target - nums[i];
        	// ȥ���ظ���
        	if(i > 0 && nums[i] == nums[i -1]) {
        		continue;
        	}
        	for(int j = i + 1; j < nums.length - 2; j++) {
        		// ȥ���ظ���
        		if(j > i + 1 && nums[j] == nums[j -1]) {
            		continue;
            	}
        		int twoSumTar = threeSumTar - nums[j];
        		int left = j + 1;
        		int right = nums.length - 1;
        		while(left < right) {
        			int twoSum = nums[right] + nums[left];
        			if(twoSumTar == twoSum) {
        				// ��ӽ�
        				tarList.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
        				// ȥ���ظ���
        				while(left < right && nums[right - 1] == nums[right]) {
        					right--;
        				}
        				while(left < right && nums[left] == nums[left + 1]) {
        					left++;
        				}
        				// �ҵ���󣬽���ָ������һλ����ָ������һλ���������
        				left++;right--;
        			} else if(twoSum > twoSumTar) {
        				right--;
        			} else {
        				left++;
        			}
        		}
        	}
        }
		return tarList;
    }
}
