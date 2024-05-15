package LeetCode.Easy;

public class LargestLocalValuesInMatrix
{

	public static void main(String[] args)
	{
		int[][] grid =
		{
				{ 9, 9, 8, 1 },
				{ 5, 6, 2, 6 },
				{ 8, 2, 6, 4 },
				{ 6, 2, 2, 2 } };

		int[][] matrix = largestLocal(grid);

		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] largestLocal(int[][] grid)
	{

		int[][] maxLocal = new int[grid.length - 2][grid.length - 2];
		for (int i = 0; i < maxLocal.length; i++)
		{
			for (int j = 0; j < maxLocal.length; j++)
			{
				int largest = Integer.MIN_VALUE;
				for (int row = i; row < i + 3; row++)
				{
					for (int column = j; column < j + 3; column++)
					{
						largest = Math.max(largest, grid[row][column]);
					}
				}
				maxLocal[i][j] = largest;
			}
		}
		return maxLocal;
	}
}
