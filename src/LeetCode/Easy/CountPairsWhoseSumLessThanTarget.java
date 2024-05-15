package LeetCode.Easy;

import java.util.List;

public class CountPairsWhoseSumLessThanTarget
{

	public static void main(String[] args)
	{
		List<Integer> nums = List.of(-1, 1, 2, 3, 1);
		int target = 2;
		System.out.println(countPairs(nums, target));
	}

	public static int countPairs(List<Integer> nums, int target)
	{
		int count = 0;
		;
		for (int i = 0; i < nums.size(); i++)
		{
			for (int j = i + 1; j < nums.size(); j++)
			{
				if ((nums.get(i) + nums.get(j)) < target)
				{
					count++;
				}
			}
		}
		return count;
	}
}
