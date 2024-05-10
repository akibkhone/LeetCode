package LeetCode.Easy;

import java.util.ArrayList;

public class ConvertBinaryNumberInLinkedListToInteger
{

	public static void main(String[] args)
	{

		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(0);
		listNode.next.next= new ListNode(1);
		
		System.out.println(getDecimalValue(listNode));
	}

	public static int getDecimalValue(ListNode head)
	{
		ArrayList<Integer> binary = new ArrayList<Integer>();;
		int decimal = 0;
		int power = 0;
		while(head !=null)
		{
			binary.add(head.val);
			head = head.next;
		}
		for(int i=binary.size()-1; i>=0; i--)
		{
			int current = binary.get(i);
			decimal = decimal +  current * (int)Math.pow(2, power++);
		}
		return decimal;

	}
}
