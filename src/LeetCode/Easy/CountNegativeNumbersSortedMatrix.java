package LeetCode.Easy;

public class CountNegativeNumbersSortedMatrix
{

	public static void main(String[] args)
	{

		int[][] matrix =
		{
				{ 1, 2, 3 },
				{ 4, -1, 6 },
				{ 7, 8, -1 } 
		};
		System.out.println(countNegatives(matrix));
	}

	public static int countNegatives(int[][] grid)
	{
		int count = 0;
		int rows = grid.length;
		int cols = grid[0].length;
		for (int r = 0; r < rows; r++)
		{
			for (int c = 0; c < cols; c++)
			{
				if (grid[r][c] < 0)
				{
					count++;
				}
			}
		}
		return count;
	}

}
