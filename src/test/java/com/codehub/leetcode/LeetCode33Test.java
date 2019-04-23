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
public class LeetCode33Test {
	private LeetCode33 leetCode;
	private int[] nums;
	private int target;
	private int index;
	
	public LeetCode33Test(int[] nums, int target, int index) {
		this.nums = nums;
		this.target = target;
		this.index = index;
	}
	
	@Before
	public void before() {
		leetCode = new LeetCode33();
	}
	
	@Parameters
	public static Collection<?> reverserArrays() {
		return Arrays.asList(new Object[][]{
			{new int[]{4, 5, 6, 7, 0, 1, 2}, 0, 4},
			{new int[]{4, 5, 6, 7, 0, 1, 2}, 3, -1},
			{new int[]{4, 5, 6, 7, 0, 1, 2}, 6, 2},
			{new int[]{8, 7, 6, 5, 4, 3, 2, 1, 0}, 6, 2}
		});
	}
	
	@Test
	public void leetCode33() {
		assertEquals(index, leetCode.search(nums, target));
	}
}
