package LeetCode.Easy;

import java.util.Arrays;

public class ValidPalindrome
{

	public static void main(String[] args)
	{
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

	public static boolean isPalindrome(String s)
	{
		s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		StringBuilder sb = new StringBuilder(s);
		return s.equals(sb.reverse().toString())?true:false;
	}
}
