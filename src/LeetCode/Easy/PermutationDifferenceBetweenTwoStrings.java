package LeetCode.Easy;

public class PermutationDifferenceBetweenTwoStrings
{

	public static void main(String[] args)
	{
		System.out.println(findPermutationDifference("rwohu", "rwuoh"));

	}

	public static int findPermutationDifference(String s, String t) {
    int result = 0;
    for(int i=0; i<s.length(); i++)
    {
        result = result + 
        		Math.abs(s.indexOf(s.charAt(i)) - t.indexOf(s.charAt(i)));
    }
    return result;
}
}
