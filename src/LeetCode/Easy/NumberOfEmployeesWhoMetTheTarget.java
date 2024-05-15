package LeetCode.Easy;

import java.util.stream.IntStream;

public class NumberOfEmployeesWhoMetTheTarget
{

	public static void main(String[] args)
	{
		int[] employees =
		{ 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(numberOfEmployeesWhoMetTarget(employees, 5));

	}

	public static int numberOfEmployeesWhoMetTarget(int[] hours, int target)
	{
		int count = 0;
		for (int hour : hours)
		{
			if (hour >= target)
			{
				count++;
			}
		}
		return count;
	}

}
