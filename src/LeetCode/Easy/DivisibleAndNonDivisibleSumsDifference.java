package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class DivisibleAndNonDivisibleSumsDifference
{

	public static void main(String[] args)
	{

		System.out.println(differenceOfSums(10, 2));
	}

	 public static int differenceOfSums(int n, int m) {
     List<Integer> num1 = new ArrayList<>();
     List<Integer> num2 = new ArrayList<>();
     for (int i = 0; i <= n; i++) {
         if (i % m != 0) {
             num1.add(i);
             continue;
         }
         num2.add(i);
     }
     int num1Sum = num1.stream().mapToInt(Integer::intValue).sum();
     int num2Sum = num2.stream().mapToInt(Integer::intValue).sum();
     return num1Sum - num2Sum;
 }
}
