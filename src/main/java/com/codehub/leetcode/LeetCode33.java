package com.codehub.leetcode;

public class LeetCode33 {
	/**
	 * ���ֲ��ң��ݹ�
	 * ����˼·���о����п��ܵ������
	 * ÿһ�ζ��ֿ�����һ�������򼯺�һ���Ƿ�ת���ϣ�Ҳ�п������߶������򼯺�
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search(int[] nums, int target) {
		// �����飬ֱ�ӷ���-1
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
		// δ�ҵ����
		if(end - start <= 1) {
			return -1;
		}
		int mid = (start + end + 1) / 2;
		if(nums[mid] == target) {
			return mid;
		}
		// �������벿��������
		if(nums[start] < nums[mid] && target > nums[start] && target < nums[mid]) {
			return search(nums, start, mid, target);
		}
		
		// ������Ұ벿��������
		if(nums[mid] < nums[end] && target > nums[mid] && target < nums[end]) {
			return search(nums, mid, end, target);
		}
		
		// �������벿�ַ�ת����
		if(nums[start] > nums[mid]) {
			return search(nums, start, mid, target);
		}
		
		// ������а벿�ַ�ת����
		return search(nums, mid, end, target);
	}
}
