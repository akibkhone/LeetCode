package LeetCode.Easy;

public class LengthOfLastWord
{

	public static void main(String[] args)
	{
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
	}

	public static int lengthOfLastWord(String s)
	{
		String[] stringArray= s.split("\\s+");
		return stringArray[stringArray.length-1].length();
	}
}
