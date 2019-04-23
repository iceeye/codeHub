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
            // 防止溢出
            mid = left + (right - left) / 2;
            // 二分查找
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                // 此种情况，如果需要插入target，插入位置应该是mid的下一个位置，所以使用++mid
                left = ++mid;
            } else {
                // 匹配到值，跳出循环，返回mid
                break;
            }
        }

        return mid;
    }
}
