package com.codehub.leetcode;

public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] { -1, -1 };
        }
        int index = search(nums, target, 0, nums.length - 1);
        if (index == -1) {
            return new int[] { -1, -1 };
        }
        int before = index;
        int after = index;

        // ͬ��ʹ�ö��ֲ����ҵ��ǰ��target��λ��
        // ��Ӧ��ʹ�õݼ���������������������target���ɵ����ʱ�临�ӶȽ����ΪO(n)
        while (before > 0 && nums[before - 1] == target) {
            before -= 1;
            before = search(nums, target, 0, before);
        }

        while (after < nums.length - 1 && nums[after + 1] == target) {
            after += 1;
            after = search(nums, target, after, nums.length - 1);
        }

        return new int[] { before, after };
    }

    public int search(int[] nums, int target, int start, int end) {
        if (end < start) {
            return -1;
        }
        // ��ֹ���
        int mid = start + (end - start) / 2;

        if (nums[mid] > target) {
            return search(nums, target, start, mid - 1);
        } else if (nums[mid] < target) {
            return search(nums, target, mid + 1, end);
        } else {
            return mid;
        }
    }
}
