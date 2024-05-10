package LeetCode.Easy;

public class SmallestEvenMultiple
{

	public static void main(String[] args)
	{
		System.out.println(smallestEvenMultiple(5));
	}
	
	 public static int smallestEvenMultiple(int n) {
     return n % 2 == 0 ? n : n * 2;
 }

}

