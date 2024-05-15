package LeetCode.Easy;

public class BuildArrayFromPermutation
{

	public static void main(String[] args)
	{
		int[] nums = {2,3,4,1,5,6};
	 for(int n : buildArray(nums))
	 {
		 System.out.print(n + " ");
	 }

	}

	public static int[] buildArray(int[] nums)
	{
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length-1; i++)
		{
			ans[i] = nums[nums[i]];
		}
		return ans;
	}

}
