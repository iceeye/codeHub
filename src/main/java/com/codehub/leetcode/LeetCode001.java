package com.codehub.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode001 {

	public static void main(String[] args) {
		int[] iArray = new int[]{2,5,6,3,7,2,9};
		int target = 5;
		
		System.out.println(Arrays.toString(
				new LeetCode001().twoSumForce(iArray, target)));
		System.out.println(Arrays.toString(
				new LeetCode001().twoSum(iArray, target)));
	}
	//������
	//����ÿ��Ԫ��x���������Ƿ����ֵ����target - x��Ŀ��ֵ
	public int[] twoSumForce(int[] nums, int target) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[j] == target - nums[i]) {
					return new int[]{i, j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution!");
	}
	
	//һ���ϣ�����������ÿռ任ʱ��
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {//��ϣ�����ʱ�临�Ӷ�O(1)
				return new int[]{map.get(target - nums[i]), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution!");
	}

}
