package LeetCode.Easy;

public class ConcatenationOfArray
{

	public static void main(String[] args)
	{

		int[] nums =
		{ 1, 2, 1 };
		int[] result = getConcatenation(nums);
		for (int n : result)
		{
			System.out.println(n + " ");
		}
	}

	public static int[] getConcatenation(int[] nums)
	{
		int size = nums.length;
		int[] concatNums = new int[nums.length*2];
		System.arraycopy(nums, 0, concatNums, 0, nums.length);
		nums = concatNums;
		int index = 0;
		for (int i = size ; i < concatNums.length; i++)
		{
			nums[i] = nums[index++];
		}
		return concatNums;
	}

}
