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
public class LeetCode39Test {
	private LeetCode39 leetCode;
	private int[] nums;
	private int target;
	private List<List<Integer>> ret;
	
	public LeetCode39Test(int[] nums, int target, List<List<Integer>> ret) {
		this.nums = nums;
		this.target = target;
		this.ret = ret;
	}
	
	@Before
	public void before() {
		leetCode = new LeetCode39();
	}
	
	@Parameters
	public static Collection<?> reverserArrays() {
	    List<List<Integer>> list1 = new ArrayList<List<Integer>>();
	    list1.add(Arrays.asList(2, 2, 3));
	    list1.add(Arrays.asList(7));
	    
	    List<List<Integer>> list2 = new ArrayList<List<Integer>>();
        list2.add(Arrays.asList(2, 2, 2, 2));
        list2.add(Arrays.asList(2, 3, 3));
        list2.add(Arrays.asList(3, 5));
	    
		return Arrays.asList(new Object[][]{
			{new int[]{2,3,6,7}, 7, list1},
			{new int[]{2,3,5}, 8, list2}
		});
	}
	
	@Test
	public void leetCode33() {
		assertEquals(ret, leetCode.combinationSum(nums, target));
	}
}
