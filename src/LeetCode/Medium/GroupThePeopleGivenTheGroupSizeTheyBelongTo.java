package LeetCode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo
{

	public static void main(String[] args)
	{
		int[] sizes =
		{ 3, 3, 3, 3, 3, 1, 3 };
		for (List<Integer> l : groupThePeople(sizes))
		{
			System.out.println(l);
		}

	}

	public static List<List<Integer>> groupThePeople(int[] groupSizes)
	{
		List<List<Integer>> groupedlist = new ArrayList<>();
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < groupSizes.length; i++)
		{
			if (!map.containsKey(groupSizes[i]))
			{
				map.put(groupSizes[i], new ArrayList<>(3));
			}
			map.get(groupSizes[i]).add(i);
		}

		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet())
		{
		 List<Integer> group = entry.getValue();
		 for(int i=0; i<group.size(); i+=entry.getKey())
		 {
			 int endIndex = Math.min(i+entry.getKey(), group.size());
			 groupedlist.add(group.subList(i, endIndex));
		 }
		}
		return groupedlist;
	}

}
