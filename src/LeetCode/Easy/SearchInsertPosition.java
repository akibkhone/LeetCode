package LeetCode.Easy;

import java.util.stream.IntStream;

public class SearchInsertPosition
{

	public static void main(String[] args)
	{

		int[] nums =
		{ 1,3,5,6 };
		System.out.println(searchInsert(nums, 0));
	}

	public static int searchInsert(int[] nums, int target)
	{
		int start = 0;
		int end = nums.length - 1;
		boolean isPresent = false;
		int insertIndex = 0;
		for (int num : nums)
		{
			if (num == target)
			{
				isPresent = true;
			}
		}
		if (isPresent)
		{
			while (start <= end)
			{
				int mid = (start + end) / 2;
				if (target < nums[mid])
				{
					end = mid - 1;
				} else if (target > nums[mid])
				{
					start = mid + 1;
				} else
				{
					return mid;
				}
			}
		}
		else {
			
			for (int i=0; i<=nums.length-1; i++)
			{
				if (nums[i] < target)
				{
					insertIndex = i+1;
				}
			}
			
		}
		return insertIndex;
	}

}
