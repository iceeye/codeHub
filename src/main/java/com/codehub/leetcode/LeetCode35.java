package com.codehub.leetcode;

public class LeetCode35 {

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;

        int mid = -1;
        while (left <= right) {
            // ��ֹ���
            mid = left + (right - left) / 2;
            // ���ֲ���
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                // ��������������Ҫ����target������λ��Ӧ����mid����һ��λ�ã�����ʹ��++mid
                left = ++mid;
            } else {
                // ƥ�䵽ֵ������ѭ��������mid
                break;
            }
        }

        return mid;
    }
}
