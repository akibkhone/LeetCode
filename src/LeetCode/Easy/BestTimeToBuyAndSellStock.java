package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BestTimeToBuyAndSellStock
{

	public static void main(String[] args)
	{
		int[] nums =
		{ 7, 1, 5, 3, 6, 4 };

		int result = maxProfit(nums);
		System.out.println(result);
	}

	public static int maxProfit(int[] prices)
	{
//		int maxProfit = 0;
//
//		for (int i = 0; i < prices.length; i++)
//		{
//			for (int j = i + 1; j < prices.length; j++)
//			{
//				if (maxProfit < (prices[j] - prices[i]))
//				{
//					maxProfit = prices[j] - prices[i];
//				}
//			}
//		}
		
		int maxProfit = 0;
		int minPrice = prices[0];
		for(int i = 0; i < prices.length; i++)
		{
			if(prices[i]<minPrice)
			{
				minPrice=prices[i];
			}
			else {
				maxProfit=Math.max(maxProfit, prices[i]-minPrice);
			}
		}
		return maxProfit;
	}

}
