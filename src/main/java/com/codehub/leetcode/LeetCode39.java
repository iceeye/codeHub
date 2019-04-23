package com.codehub.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(list, new ArrayList<Integer>(), candidates, target, 0);
        
        return list;
    }
    
    public void backTrack(List<List<Integer>> list, 
            List<Integer> listInt, int[] nums, int target, int start) {
        if(target == 0) {
            // 添加找到的解，一定要深拷贝一个对象保存到list中
            // 因为求解过程中始终用的listInt对象
            list.add(new ArrayList<Integer>(listInt));
            return;
        }
        for(int i = start; i < nums.length; i++) {
            // 由于数组是有序的
            // target - nums[i] < 0 后续的循环递归不可能找到解
            if(target - nums[i] < 0) {
                break;
            }
            listInt.add(nums[i]);
            // 递归调用的最后一个参数应该是i，而不是start
            // 如果是start则重复运算并且会出现重复解
            backTrack(list, listInt, nums, target - nums[i], i);
            // 回退一个位置继续求解
            listInt.remove(listInt.size() - 1);
        }
    }
}
