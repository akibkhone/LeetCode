package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class UniqueMorseCodeWords
{

	public static void main(String[] args)
	{
		String[] words =
		{ "gin", "zen", "gig", "msg" };
		System.out.println(uniqueMorseRepresentations(words));
	}

	public static int uniqueMorseRepresentations(String[] words)
	{
		String[] morses =
		{ ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
				"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		Map<String, Integer> morseCountMap = new HashMap<>();
		for (String w : words)
		{
			String morse = "";
			for (char c : w.toCharArray())
			{
				morse = morse + morses[c - 'a'];
				// character - 'a' calculates the index of a lowercase alphabet character
				// character in the English alphabet, where 'a' is 0, 'b' is 1, and so on.
			}
			morseCountMap.put(morse, morseCountMap.getOrDefault(morse, 0) + 1);
		}
		return morseCountMap.size();

	}

}
