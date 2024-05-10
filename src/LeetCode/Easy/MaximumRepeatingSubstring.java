package LeetCode.Easy;

import java.util.ArrayList;

public class MaximumRepeatingSubstring
{

	public static void main(String[] args)
	{

		System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
	}

	public static int maxRepeating(String sequence, String word)
	{
		String find = word;
		int count = 0;
		while (sequence.contains(find))
		{
			count++;
			find += word;
		}
		return count;

	}
}
