package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveLinkedListElements
{

	public static void main(String[] args)
	{

		ListNode listNode = new ListNode(-3);
		listNode.next = new ListNode(-1);
		listNode.next.next = new ListNode(0);
		listNode.next.next.next = new ListNode(0);
		listNode.next.next.next.next = new ListNode(0);
		listNode.next.next.next.next = new ListNode(3);
		listNode.next.next.next.next = new ListNode(3);

		ListNode deleteDuplicates = deleteDuplicates(listNode);

		while (deleteDuplicates != null)
		{
			System.out.println(deleteDuplicates.val);
			deleteDuplicates = deleteDuplicates.next;
		}
	}

	public static ListNode deleteDuplicates(ListNode head)
	{
//		Set<Integer> integers = new TreeSet<>(); // TreeSet maintains the order whereas HashSet don't
//		while (head != null)
//		{
//			integers.add(head.val);
//			head = head.next;
//		}
//		ListNode dummy = new ListNode();
//		ListNode current = dummy;
//		for (int num : integers)
//		{
//			current.next = new ListNode(num);
//			current = current.next;
//		}
//		return dummy.next;
		
		ListNode dummy = head;
		while(dummy!=null && dummy.next != null)
		{
			if(dummy.val == dummy.next.val)
			{
				dummy.next = dummy.next.next;
			}
			else {
				dummy = dummy.next;
			}
		}
		return head;
	}
}
