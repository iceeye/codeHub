package com.codehub.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LeetCode40Test {
    private LeetCode40 leetCode;
    private int[] nums;
    private int target;
    private List<List<Integer>> ret;

    public LeetCode40Test(int[] nums, int target, List<List<Integer>> ret) {
        this.nums = nums;
        this.target = target;
        this.ret = ret;
    }

    @Before
    public void before() {
        leetCode = new LeetCode40();
    }

    @Parameters
    public static Collection<?> reverserArrays() {
        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        list1.add(Arrays.asList(1, 7));
        list1.add(Arrays.asList(1, 2, 5));
        list1.add(Arrays.asList(2, 6));
        list1.add(Arrays.asList(1, 1, 6));

        List<List<Integer>> list2 = new ArrayList<List<Integer>>();
        list2.add(Arrays.asList(1, 2, 2));
        list2.add(Arrays.asList(5));

        return Arrays.asList(new Object[][] { 
                { new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8, list1 },
                { new int[] { 2, 5, 2, 1, 2 }, 5, list2 } 
                });
    }

    @Test
    public void leetCode40() {
        assertEquals(ret, leetCode.combinationSumII(nums, target));
    }
}
