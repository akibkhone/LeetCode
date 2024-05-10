package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseLinkedList
{

	public static void main(String[] args)
	{
		ListNode listNode1 = new ListNode(1);
		listNode1.next = new ListNode(2);
		listNode1.next.next = new ListNode(3);
		listNode1.next.next.next = new ListNode(4);
		listNode1.next.next.next.next = new ListNode(5);

		ListNode result1 = reverseList(listNode1);
		while (result1 != null)
		{
			System.out.println(result1.val);
			result1 = result1.next;
		}

		ListNode listNode2 = new ListNode();

		ListNode result2 = reverseList(listNode2);
		while (result2 != null)
		{
			System.out.println(result2.val);
			result2 = result2.next;
		}
	}

	public static ListNode reverseList(ListNode head)
	{
		List<Integer> integers = new ArrayList<>();
		if (head == null)
		{
			return null;
		} else
		{
			while (head != null)
			{
				integers.add(head.val);
				head = head.next;
			}
			Collections.reverse(integers);

			ListNode dummy = new ListNode(); 
			ListNode current = dummy;

			for (int num : integers)
			{
				current.next = new ListNode(num);
				current = current.next;
			}

			ListNode result = dummy.next;
			return result;
		}
	}
}
