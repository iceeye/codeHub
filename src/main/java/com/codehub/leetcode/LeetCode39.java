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
            // ����ҵ��Ľ⣬һ��Ҫ���һ�����󱣴浽list��
            // ��Ϊ��������ʼ���õ�listInt����
            list.add(new ArrayList<Integer>(listInt));
            return;
        }
        for(int i = start; i < nums.length; i++) {
            // ���������������
            // target - nums[i] < 0 ������ѭ���ݹ鲻�����ҵ���
            if(target - nums[i] < 0) {
                break;
            }
            listInt.add(nums[i]);
            // �ݹ���õ����һ������Ӧ����i��������start
            // �����start���ظ����㲢�һ�����ظ���
            backTrack(list, listInt, nums, target - nums[i], i);
            // ����һ��λ�ü������
            listInt.remove(listInt.size() - 1);
        }
    }
}
