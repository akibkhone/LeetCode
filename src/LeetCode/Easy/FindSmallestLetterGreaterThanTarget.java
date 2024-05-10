package LeetCode.Easy;

public class FindSmallestLetterGreaterThanTarget
{

	public static void main(String[] args)
	{
		char[] letters =
		{ 'e', 'e', 'n','n' };
		System.out.println(nextGreatestLetter(letters, 'e'));

	}

	public static char nextGreatestLetter(char[] letters, char target)
	{
		char next = letters[0];
		if(target>=letters[letters.length-1])
		{
			return next;
		}
		else {
			for (int i = 0; i < letters.length; i++)
			{
				if (target == letters[i])
				{
					next = letters[i + 1];
					continue;
				} else if (target < letters[i])
				{
					next = letters[i];
					break;
				} else if (target > letters[i])
				{
					next = letters[i];
					continue;
				} 
			}
		}
		return next;
	}
}
