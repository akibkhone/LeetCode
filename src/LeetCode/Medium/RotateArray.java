package LeetCode.Medium;

import java.util.Arrays;

public class RotateArray
{

	public static void main(String[] args)
	{
		int nums[] =
		{ 1, 2, 3, 4, 5 };
		rotate(nums, 3);
	}

	public static void rotate(int[] nums, int k)
	{
		// Get the length of the array
		int n = nums.length;

		// Create a new array to store the rotated elements
		int[] rotatedNums = new int[n];

		// Ensure k is within the range of the array length
		k = k % n; // k = 2 % 4 = 2

		// Rotate the array
		for (int i = 0; i < n; i++)
		{
			// Calculate the index of the current element after rotation

			// Calculate the new index after rotation using the formula:
			// (current_index + k) % n
			// This ensures the index wraps around when it exceeds the array length

			int newIndex = (i + k) % n;

			// Assign the current element from nums to the corresponding index in
			// rotatedNums
			rotatedNums[newIndex] = nums[i];
		}

		// Copy the rotated elements back to the original array
		System.arraycopy(rotatedNums, 0, nums, 0, n);
		Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
	}

}
