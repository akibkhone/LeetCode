package LeetCode.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnLine
{

	public static void main(String[] args)
	{
		int[][] matrix1 =
		{
				{ 1, 1 },
				{ 2, 2 },
				{ 3, 3 } };

		int[][] matrix2 =
		{
				{ 1, 1 },
				{ 3, 2 },
				{ 5, 3 },
				{ 4, 1 },
				{ 2, 3 },
				{ 1, 4 } };
		System.out.println(maxPoints(matrix1));
		System.out.println(maxPoints(matrix2));
	}

	public static int maxPoints(int[][] points)
	{
		int n = points.length;
		if (n <= 2)
			return n; // 2 or less points can always form a line.
		int maxPoints = 2;

		for (int[] a : points)
		{
			// Map<Double, Integer> for storing (slope, no of times 2 points generate this
			// slope.)
			Map<Double, Integer> map = new HashMap<>();
			for (int[] b : points)
			{
				if (a == b)
					continue; // dont measure slope for same points in plane.
				// if a is (x1, y1) and b is(x2, y2) then slope is (y2 - y1)/(x2 -x1)
				// a (a0, a1) & b is (b0, b1)
				double slope = 0;
				if (b[0] - a[0] == 0)
					slope = Double.POSITIVE_INFINITY;
				else
					slope = (b[1] - a[1]) / (double) (b[0] - a[0]);
				// map.getOrDefault(slope, 0)+1 is adding 1 more point count for that slope if
				// we already had that slope.
				// by default , 1 will be count of a new slope.
				map.put(slope, map.getOrDefault(slope, 1) + 1);
				maxPoints = Math.max(maxPoints, map.get(slope));
			}
		}
		// ans itself represnets max no of points forms a line
		return maxPoints;
	}

}
