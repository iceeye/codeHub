package com.codehub.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LeetCode35Test {
	private LeetCode35 leetCode;
	private int[] nums;
	private int target;
	private int ret;
	
	public LeetCode35Test(int[] nums, int target, int ret) {
		this.nums = nums;
		this.target = target;
		this.ret = ret;
	}
	
	@Before
	public void before() {
		leetCode = new LeetCode35();
	}
	
	@Parameters
	public static Collection<?> reverserArrays() {
		return Arrays.asList(new Object[][]{
			{new int[]{1,3,5,6}, 5, 2},
			{new int[]{1,3,5,6}, 2, 1},
			{new int[]{1,3,5,6}, 7, 4},
			{new int[]{1}, 1, 0}
		});
	}
	
	@Test
	public void leetCode33() {
		assertEquals(ret, leetCode.searchInsert(nums, target));
	}
}
