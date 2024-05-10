package LeetCode.Easy;

import java.util.Arrays;

public class MonotonicArray
{

	public static void main(String[] args)
	{
		int[] nums1 =
		{ 1, 2, 2, 3 };
		int[] nums2 =
		{ 6, 5, 4, 4 };
		int[] nums3 =
		{ 1 };
		int[] nums4 =
		{ 11, 11, 9, 4, 3, 3, 3, 1, -1, -1, 3, 3, 3, 5, 5, 5 };

		System.out.println(isMonotonic(nums1));
		System.out.println(isMonotonic(nums2));
		System.out.println(isMonotonic(nums3));
		System.out.println(isMonotonic(nums4));
	}

	public static boolean isMonotonic(int[] nums)
	{
		boolean isDecreasing = true;
		boolean isIncreasing = true;

		for (int current = 1; current <= nums.length - 1; current++)
		{
			if (nums[current] > nums[current - 1])
			{
				isDecreasing = false;
			} else if (nums[current] < nums[current - 1])
			{
				isIncreasing = false;
			}
		}
		if (!isIncreasing && !isDecreasing)
		{
			return false;
		}
		return true;
	}

}
