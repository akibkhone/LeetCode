package LeetCode.Medium;

public class ReverseInteger
{

	public static void main(String[] args)
	{
		int reversed = reverse(-132);
		System.out.println(reversed);
	}

	public static int reverse(int x)
	{

		if (x > Long.MIN_VALUE || x < Long.MIN_VALUE)
		{
			String str = String.valueOf(x);
			boolean isNegative = str.startsWith("-") ? true : false;
			str = isNegative ? str.substring(1) : str;
			StringBuilder builder = new StringBuilder(str);
			String reversedStr = builder.reverse().toString();
			long reversedLong = Long.parseLong(reversedStr);
			if (reversedLong < Integer.MIN_VALUE || reversedLong > Integer.MAX_VALUE)
			{
				return 0;
			}
			int reversedInt = (int) reversedLong;
			return isNegative ? -reversedInt : reversedInt;
		}
		return 0;

	}
}
