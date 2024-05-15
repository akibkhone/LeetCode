package LeetCode.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertArrayInto2DArrayWithConditions
{

	public static void main(String[] args)
	{

		int[] nums = {1,3,4,1,2,3,1};
		
		List<List<Integer>> matrix = findMatrix(nums);

		for(List<Integer> l : matrix)
		{
			System.out.print(l.toString() + " , ");
		}
	}
	
//	  Input: nums = [1,3,4,1,2,3,1]
//			Output: [[1,3,4,2],[1,3],[1]]
	public static List<List<Integer>> findMatrix(int[] nums) {
		List<List<Integer>> matrix =  new ArrayList<>();
		
		
		
		return matrix;
    
  }

}
