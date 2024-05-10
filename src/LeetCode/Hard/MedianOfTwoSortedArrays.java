package LeetCode.Hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class MedianOfTwoSortedArrays
{

	public static void main(String[] args)
	{
		int[] nums1 =
		{ 1, 2 };
		int[] nums2 =
		{ 3, 4 };
		double median = findMedianSortedArrays(nums1, nums2);
		System.out.println(median);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2)
	{
		int[] mergedArray = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().toArray();
		int midIndex = (0 + mergedArray.length-1) / 2;
		if (mergedArray.length % 2 == 0)
		{
			return (double)(mergedArray[midIndex] + mergedArray[midIndex+1])/2;
		} else
		{
			return mergedArray[midIndex];
		}
	}
}
