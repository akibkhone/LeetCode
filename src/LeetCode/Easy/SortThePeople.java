package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople
{

	public static void main(String[] args)
	{
		String[] names =
		{ "Mary", "John", "Emma" };
		int[] heights =
		{ 180, 165, 170 };

		for (String name : sortPeople(names, heights))
		{
			System.out.println(name + " ");
		}
	}

	public static String[] sortPeople(String[] names, int[] heights)
	{
		ArrayList<String> unSortedNames = new ArrayList<>();
		String[] sortedNames = new String[names.length];
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < names.length; i++)
		{
			map.put(heights[i], names[i]);
		}
		Arrays.sort(heights);
		for (int height : heights)
		{
			unSortedNames.add(map.get(height));
		}
		Collections.reverse(unSortedNames);
		for(int i = 0; i < unSortedNames.size(); i++)
		{
			sortedNames[i] = unSortedNames.get(i);
		}
		return sortedNames;
	}
}
