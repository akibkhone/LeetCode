package LeetCode.Easy;

import java.util.Arrays;

public class PlusOne
{

	public static void main(String[] args)
	{
		int[] nums =
		{9};
		int[] plusOne = plusOne(nums);
		Arrays.stream(plusOne).forEach(num -> System.out.print(num + " "));
	}

	public static int[] plusOne(int[] digits)
	{
int n = digits.length;
    
    // Starting from the rightmost digit
    for (int i = n - 1; i >= 0; i--) {
        // If the digit is less than 9, adding one doesn't cause a carry
        if (digits[i] < 9) {
            digits[i]++;
            return digits; // No need to continue, return the modified array
        }
        // If the digit is 9, set it to 0 and continue with the next digit
        digits[i] = 0;
    }
    // If we're here, it means all digits were 9, so we need to add an extra digit
    int[] result = new int[n + 1];
    result[0] = 1; // Set the most significant digit to 1
    return result;
	}

}
