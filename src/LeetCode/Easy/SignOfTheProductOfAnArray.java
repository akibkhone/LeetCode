package LeetCode.Easy;

import java.util.Arrays;

public class SignOfTheProductOfAnArray
{

	public static void main(String[] args)
	{
		int[] nums1 =
		{ 9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24 };
		int[] nums2 =
		{ 1, 5, 0, 2, -3 };
		int[] nums3 =
		{ -1, 1, -1, 1, -1 };

		System.out.println(arraySign(nums1));
		System.out.println(arraySign(nums2));
		System.out.println(arraySign(nums3));
	}

	public static int arraySign(int[] nums)
	{
		int negativeCount = 0;
		for (int num : nums)
		{
			if (num == 0)
			{
				return 0;
			} else if (num < 0)
			{
				negativeCount++;
			}
		}
		return (negativeCount % 2 == 0) ? 1 : -1;
	}

}
