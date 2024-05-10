package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement
{

	public static void main(String[] args)
	{
		int[] nums =
		{ 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;

		int result = removeElement(nums, val);
		System.out.println(result);
	}

	public static int removeElement(int[] nums, int val)
	{
		int count = 0;
		if (nums.length > 0)
		{
			for (int i = 0; i < nums.length; i++)
			{
				if (nums[i] == val)
				{
					count++;
					nums[i] = 99;
				}
			}
		}
		Arrays.sort(nums);
		return nums.length - count;
	}

}
