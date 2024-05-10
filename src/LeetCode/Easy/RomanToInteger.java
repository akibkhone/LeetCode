package LeetCode.Easy;

public class RomanToInteger
{

	public static void main(String[] args)
	{
		System.out.println(romanToInt("IX"));
	}

	public static int romanToInt(String s)
	{
		int current = 0;
		int previous = 0;
		int result = 0;
		for (int i = s.length() - 1; i >= 0; i--)
		{
			switch (s.charAt(i))
			{
			case 'M' -> current = 1000;
			case 'D' -> current = 500;
			case 'C' -> current = 100;
			case 'L' -> current = 50;
			case 'X' -> current = 10;
			case 'V' -> current = 5;
			case 'I' -> current = 1;
			}
			if (current < previous)
			{
				result = result - current;
			} else
			{
				result = result + current;
			}
			previous = current;
		}
		return result;
	}
}
