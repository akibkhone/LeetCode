package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

class MyHashMap
{
	// Load factor = 10000/size = 0.75
	List<int[]>[] lists; // using List<List<int[]>> lists is fine as well.
	int size = 13000;

	// O(size)
	/** Initialize your data structure here. */
	public MyHashMap()
	{
		lists = new ArrayList[size];
		for (int i = 0; i < lists.length; i++)
			lists[i] = new ArrayList<>(); // don't use linkedlist in my version which makes put() O(L^2)
	}

	public int getHashcode(int key)
	{
		return key % size;
	}

	// O(L)
	/** value will always be non-negative. */
	public void put(int key, int value)
	{
		int index = getHashcode(key);
		for (int i = 0; i < lists[index].size(); i++)
		{
			if (lists[index].get(i)[0] == key)
			{
				lists[index].get(i)[1] = value;
				return;
			}
		}
		lists[index].add(new int[]
		{ key, value });
	}

	// O(L)
	/**
	 * Returns the value to which the specified key is mapped, or -1 if this map
	 * contains no mapping for the key
	 */
	public int get(int key)
	{
		int index = getHashcode(key);
		for (int i = 0; i < lists[index].size(); i++)
		{
			if (lists[index].get(i)[0] == key)
				return lists[index].get(i)[1];
		}
		return -1;
	}

	// O(L)
	/**
	 * Removes the mapping of the specified value key if this map contains a mapping
	 * for the key
	 */
	public void remove(int key)
	{
		int index = getHashcode(key);
		for (int i = 0; i < lists[index].size(); i++)
		{
			if (lists[index].get(i)[0] == key)
				lists[index].remove(i);
		}
		return;
	}
	
	 class Solution{
			
			public static void main(String[] args)
			{
				 MyHashMap obj = new MyHashMap();   
				 obj.put(1,2);                
				 int param_2 = obj.get(1);        
				 obj.remove(1);                   
			}
	 }
}
