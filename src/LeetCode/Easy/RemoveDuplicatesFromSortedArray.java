package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray
{

	public static void main(String[] args)
	{
		int[] nums =
		{ -3,-1,0,0,0,3,3};
		int result = removeDuplicates(nums);
		System.out.println(result);
	}

	public static int removeDuplicates(int[] nums)
	{
		Set<Integer> unique = new HashSet<>();
		for(int i: nums) {
			unique.add(i);
		}
		int newIndex=0;
		for(int num : unique)
		{
			nums[newIndex++] = num;
		}
		for(int i=newIndex; i<nums.length; i++)
		{
			nums[i] = 101;
		}	
		Arrays.sort(nums);
		return unique.size();
	}

}
