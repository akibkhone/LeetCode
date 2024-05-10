package LeetCode.Medium;

import java.util.ArrayList;


public class RansomNote
{

	public static void main(String[] args)
	{
		String ransomNote = "aab";
		String magazine = "baa";
		System.out.println(canConstruct(ransomNote, magazine));

	}

	public static boolean canConstruct(String ransomNote, String magazine)
	{
		ArrayList<Character> magazineChars = new ArrayList<>();
		for (int i = 0; i < magazine.length(); i++)
		{
			magazineChars.add(magazine.charAt(i));
		}

		for (Character c : ransomNote.toCharArray())
		{
			if (!magazineChars.remove(c))
			{
				return false;
			}
		}
		return true;
	}
}
