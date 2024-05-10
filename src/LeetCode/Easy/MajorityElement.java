package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement
{

	public static void main(String[] args)
	{
		int[] nums =
		{ 1,2,3,0,0,0 };
		
		int result = majorityElement(nums);
		System.out.println(result);
	}

	public static int majorityElement(int[] nums)
	{
		Map<Integer, Integer> map = new HashMap<>();
		for(int num: nums)
		{
			if(!map.containsKey(num))
			{
				map.put(num, 1);
			}
			else {
				map.put(num, map.get(num)+1);
			}
		}
		
		int majorityCount=0;
		int majorityElement=0;
		for(Entry<Integer, Integer> entry: map.entrySet())
		{
			if(entry.getValue()>majorityCount)
			{
				majorityElement = entry.getKey();
				majorityCount = entry.getValue();
			}
		}
		return majorityElement;
	}

}
