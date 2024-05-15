package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberCandies
{

	public static void main(String[] args)
	{

		int[] candies =
		{ 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		List<Boolean> result = kidsWithCandies(candies, extraCandies);
		for(boolean r : result)
		{
			System.out.print(r+ " ");
		}
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
	{
		int greatest = 0;
		List<Boolean> result = new ArrayList<>(candies.length);
		for (int i = 0; i < candies.length; i++)
		{
			if (candies[i] > greatest)
			{
				greatest = candies[i];
			}
		}
		for (int i = 0; i < candies.length; i++)
		{
			if (candies[i] + extraCandies >= greatest)
			{
				result.add(true);
			} else
			{
				result.add(false);
			}
		}
		return result;
	}

}
