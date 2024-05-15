package LeetCode.Medium;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers
{

	public static void main(String[] args)
	{
		System.out.println(minPartitions("82734"));
	}

	public static int minPartitions(String n)
	{
		int max = 0;
		for (int i = 0; i < n.length(); i++)
		{
			if (Character.getNumericValue(n.charAt(i)) == 9)
				return 9;
			max = Math.max(max, (Character.getNumericValue(n.charAt(i))));
		}
		return max;
	}
}
