package LeetCode.Easy;

public class PalindromeNumber
{

	public static void main(String[] args)
	{
		boolean result = isPalindrome(11);
		System.out.println(result);
	}

	public static boolean isPalindrome(int x)
	{
		String value = String.valueOf(x);
		StringBuilder sb = new StringBuilder(value);
		return sb.reverse().toString().equals(value);
	}

}
