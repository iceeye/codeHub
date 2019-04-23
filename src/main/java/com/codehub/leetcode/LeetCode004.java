package com.codehub.leetcode;

public class LeetCode004 {

	public static void main(String[] args) {
		int[] nums1 = new int[]{1,3};
		int[] nums2 = new int[]{2};
		
		double medianDouble = findMedianSortedArrays(nums1, nums2);
		System.out.println(medianDouble);
		
		int[] nums3 = new int[]{1,3};
		int[] nums4 = new int[]{2,4};
		
		medianDouble = findMedianSortedArrays(nums3, nums4);
		System.out.println(medianDouble);
		
		int[] nums5 = new int[]{1};
		int[] nums6 = new int[]{2};
		
		medianDouble = findMedianSortedArrays(nums5, nums6);
		System.out.println(medianDouble);
	}
	
	private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] numsTotal = new int[nums1.length + nums2.length];
		int i = 0,j = 0;
		
		while(i < nums1.length || j < nums2.length) {
			if(i < nums1.length && j < nums2.length) {
				if(nums1[i] > nums2[j]) {
					numsTotal[i + j] = nums2[j];
					j++;
				} else {
					numsTotal[i + j] = nums1[i];
					i++;
				}
			} else if(i == nums1.length) {
				numsTotal[i + j] = nums2[j];
				j++;
			} else if(j == nums2.length) {
				numsTotal[i + j] = nums1[i];
				i++;
			}
		}
		double medianDouble = (numsTotal.length % 2 == 0) ? 
				((numsTotal[numsTotal.length/2 - 1]
						+ numsTotal[numsTotal.length/2])/2.0)
				: numsTotal[numsTotal.length/2];
		
		return medianDouble;
	}
}
