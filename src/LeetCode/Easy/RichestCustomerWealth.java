package LeetCode.Easy;

import java.util.Map;

public class RichestCustomerWealth
{

	public static void main(String[] args)
	{
		int[][] matrix1 =
		{
				{ 1, 2, 3 },
				{ 3, 2, 1 } };

		int[][] matrix2 =
		{
				{ 1, 5 },
				{ 7, 3 },
				{ 3, 5 }, };

		int[][] matrix3 =
		{
				{ 2, 8, 7 },
				{ 7, 1, 3 },
				{ 1, 9, 5 }, };
		
		System.out.println(maximumWealth(matrix1));
		System.out.println(maximumWealth(matrix2));
		System.out.println(maximumWealth(matrix3));
	}

	public static int maximumWealth(int[][] accounts)
	{
		int maxWealth = 0;
		int rows = accounts.length;
		int columns = accounts[0].length;
		for(int row = 0; row < rows; row++)
		{
			int sum = 0;
			for(int column = 0; column < columns; column++)
			{
				sum += accounts[row][column];
			}
			if(sum>maxWealth)
			{
				maxWealth=sum;
			}
		}
		return maxWealth;

	}

}
