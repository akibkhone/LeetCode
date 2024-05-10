package LeetCode.Easy;

public class MergeStringsAlternately
{

	public static void main(String[] args)
	{
		System.out.println(mergeAlternately("ab", "pqrs"));
	}

	public static String mergeAlternately(String word1, String word2)
	{
		StringBuilder merged = new StringBuilder();
		int minLength = Math.min(word1.length(), word2.length());
		String additionalString = word1.length() < word2.length() ? word2.substring(minLength) : word1.substring(minLength);
		for (int i = 0; i < minLength; i++)
		{
			merged.append(word1.charAt(i)).append(word2.charAt(i));
		}
		return merged.append(additionalString).toString();
	}
}
