package com.codehub.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class LeetCode34Test {
	private LeetCode34 leetCode;
	private int[] nums;
	private int target;
	private int[] ret;
	
	public LeetCode34Test(int[] nums, int target, int[] ret) {
		this.nums = nums;
		this.target = target;
		this.ret = ret;
	}
	
	@Before
	public void before() {
		leetCode = new LeetCode34();
	}
	
	@Parameters
	public static Collection<?> reverserArrays() {
		return Arrays.asList(new Object[][]{
			{new int[]{5, 7, 7, 8, 8, 10}, 8, new int[]{3, 4}},
			{new int[]{5, 7, 7, 8, 8, 10}, 6, new int[]{-1, -1}},
			{new int[]{1, 1, 1, 1, 1, 1}, 1, new int[]{0, 5}},
			{new int[]{}, 1, new int[]{-1, -1}}
		});
	}
	
	@Test
	public void leetCode33() {
		assertArrayEquals(ret, leetCode.searchRange(nums, target));
	}
}
