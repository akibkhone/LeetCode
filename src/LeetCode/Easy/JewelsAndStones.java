package LeetCode.Easy;

public class JewelsAndStones
{

	public static void main(String[] args)
	{

		System.out.println(numJewelsInStones("aA", "aAAabbb"));
	}
	
	 public static int numJewelsInStones(String jewels, String stones) {
     int count = 0;
     for (char j : jewels.toCharArray()) {
         for (char s : stones.toCharArray()) {
             if (s == j) {
                 count++;
             }
         }
     }
     return count;
 }

}
