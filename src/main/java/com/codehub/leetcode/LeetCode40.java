package com.codehub.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode40 {
    public List<List<Integer>> combinationSumII(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(list, new LinkedList<Integer>(), candidates, target, 0);

        return list;
    }

    public void backTrack(List<List<Integer>> list, LinkedList<Integer> listInt, int[] nums, int target, int start) {

        for (int i = start; i < nums.length; i++) {
            if (target < nums[i]) {
                break;
            }
            // Found solutions.
            if (target == nums[i]) {
                listInt.push(nums[i]);
                list.add(new ArrayList<Integer>(listInt));
                listInt.pop();
                return;
            }

            listInt.push(nums[i]);
            backTrack(list, listInt, nums, target - nums[i], i + 1);
            listInt.pop();
               
            // Avoid repetitive solutions.
            while ((i < (nums.length - 1)) && (nums[i] == nums[i + 1])) {
                i++;
            }
        }

    }
}
