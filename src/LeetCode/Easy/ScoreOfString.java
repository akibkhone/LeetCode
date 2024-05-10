package LeetCode.Easy;

public class ScoreOfString
{

	public static void main(String[] args)
	{
		System.out.println(scoreOfString("hello"));
	}

	public static int scoreOfString(String s)
	{
		int sum = 0;
		int index = 0;
		while (index < s.length() - 1)
		{
			sum = sum + Math.abs((int) s.charAt(index) - (int) s.charAt(index + 1));
			index++;
		}
		return sum;
	}

}
