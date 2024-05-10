package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses
{

	public static void main(String[] args)
	{
		String word = "()[]{}";

		boolean result = isValid(word);
		System.out.println(result);
	}

	public static boolean isValid(String s)
	{
		 Stack<Character> stack = new Stack<>();
     for (char c : s.toCharArray()) {
         if (c == '(' || c == '{' || c == '[') {
             stack.push(c);
         } else {
             if (stack.isEmpty()) {
                 return false; 
             }
             char top = stack.pop();
             if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                 return false;
             }
         }
     }
     return stack.isEmpty(); 
 }

}
