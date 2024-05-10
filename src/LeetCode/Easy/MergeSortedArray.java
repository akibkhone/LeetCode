package LeetCode.Easy;

import java.util.Arrays;

public class MergeSortedArray
{

	public static void main(String[] args)
	{
		int[] nums1 =
		{ 1,2,3,0,0,0 };
		int m = 3;
		int[] nums2 =
		{ 2,5,6};
		int n = 3;
		int[] result = merge(nums1, m, nums2, n);
		 for (int i = 0; i < result.length; i++) {
       System.out.print(result[i] + ", " );
   }
	}

	public static int[] merge(int[] nums1, int m, int[] nums2, int n)
	{
		int[] merged = new int[m + n];
		int mCount = 0;
		int nCount = 0;

		if (m > 0)
		{
			for (int num1 : nums1)
			{
				if (mCount <= m)
				{
					merged[mCount] = num1;
					mCount++;
				}
			}
		}

		if (n > 0)
		{
			for (int num2 : nums2)
			{
				if (nCount <= n)
				{
					merged[m + nCount] = num2;
					nCount++;
				}

			}
		}

		 Arrays.sort(merged);
     for(int i=0; i<merged.length; i++)
			{
				nums1[i] = merged[i];
			}
	  return nums1;

	}

}
