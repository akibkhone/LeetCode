package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter
{

	public static void main(String[] args)
	{

		String[] words = {"leet","aaa", "code"};
		for(int n : findWordsContaining(words, 'e'))
		{
			System.out.print(n + " ");
		}
	}

	 public static List<Integer> findWordsContaining(String[] words, char x) {
		 List<Integer> indices = new ArrayList<>();
     for(int i = 0; i < words.length; i++)
     {
         if(words[i].contains(Character.toString(x)))
         {
        	 indices.add(i);
         }
     }
		return indices;
 }
}
