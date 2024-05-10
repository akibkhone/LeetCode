package LeetCode.Easy;

public class FirstOccurrenceInString
{

	public static void main(String[] args)
	{
		
		System.out.println(strStr("sadbutsad", "sad"));
		System.out.println(strStr("leetcode", "leeto"));
		System.out.println(strStr("mississippi", "issip"));
	}

	
	 public static  int strStr(String haystack, String needle) {
     if(haystack.contains(needle))
     {
    	 return haystack.indexOf(needle);
     }
		 return -1;
   }
}
