package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class ShuffleTheArray
{

	public static void main(String[] args)
	{
		int[] nums = {2,5,1,3,4,7};
		for (int n : shuffle(nums, 3))
		{
			System.out.print(n + " ");
		}

	}

	public static int[] shuffle(int[] nums, int n)
	{
		int[] shuffled = new int[nums.length];
		List<Integer> num1 = new ArrayList<>();
		List<Integer> num2 = new ArrayList<>();
		for (int i = 0; i < nums.length; i++)
		{
			if (i < n)
			{
				num1.add(nums[i]);
				continue;
			}
			num2.add(nums[i]);
		}
		int index1 = 0, index2 = 0;
		for (int i = 0; i < shuffled.length; i++)
		{
			if(i%2==0)
				{
					shuffled[i] = num1.get(index1++);
					continue;
				}
				shuffled[i] = num2.get(index2++);
		}
		return shuffled;
	}

}
