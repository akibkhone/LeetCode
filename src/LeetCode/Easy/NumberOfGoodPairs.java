package LeetCode.Easy;

public class NumberOfGoodPairs
{

	public static void main(String[] args)
	{

		int[] nums = {1,3,2,3,1,2,3};
		System.out.println(numIdenticalPairs(nums));
	}
	
	 public static int numIdenticalPairs(int[] nums) {
     int counts = 0;
     for (int i = 0; i < nums.length; i++) {
         for (int j = i + 1; j < nums.length; j++) {
             if (nums[i] == nums[j]) {
                 counts++;
             }
         }
     }
     return counts;
 }

}
