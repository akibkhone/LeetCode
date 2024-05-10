package LeetCode.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountPairsOfSimilarStrings
{

	public static void main(String[] args)
	{
		String[] words1 =
		{ "aba", "aabb", "abcd", "bac", "aabc" };
		String[] words2 =
		{ "aabb", "ab", "ba" };
		String[] words3 =
		{ "nba", "cba", "dba" };
		System.out.println(similarPairs(words1)); // 2
		System.out.println(similarPairs(words2)); // 3
		System.out.println(similarPairs(words3)); // 0
		
	}

	public static int similarPairs(String[] words)
	{
		int count = 0;
		for (int i = 0; i < words.length; i++)
		{
			boolean flag = false;
			for (int j = i + 1; j < words.length; j++)
			{
				
				Set<Character> chars1 = new HashSet<>();
				for (char c : words[i].toCharArray())
				{
					chars1.add(c);
				}
				Set<Character> chars2 = new HashSet<>();
				for (char c : words[j].toCharArray())
				{
					chars2.add(c);
				}
				for (char c : chars1)
				{
					if (chars2.contains(c))
					flag = true;
				}
			}
			if(flag)
			{
				count++;
			}
		}

		return count;
	}
}
