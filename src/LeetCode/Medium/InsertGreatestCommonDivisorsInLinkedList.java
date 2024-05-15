package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class InsertGreatestCommonDivisorsInLinkedList
{

	public static void main(String[] args)
	{
		ListNode head = new ListNode(18);
		head.next = new ListNode(6);
		head.next.next = new ListNode(10);
		head.next.next.next = new ListNode(3);

		ListNode result = insertGreatestCommonDivisors(head);
		while (result != null)
		{
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

	public static ListNode insertGreatestCommonDivisors(ListNode head)
	{
		List<Integer> list = new ArrayList<>();
		List<Integer> newList = new ArrayList<>();
		while (head != null)
		{
			list.add(head.val);
			head = head.next;
		}
		for (int i = 0, j = 1; j < list.size(); i++, j++)
		{
			newList.add(list.get(i));
			int gcd = 1;
			for (int k = 1; k <= Math.max(list.get(i), list.get(j)); k++)
			{
				if ((list.get(i) % k == 0) && (list.get(j) % k == 0))
				{
					gcd = k;
				}
			}
			newList.add(gcd);
		}
		newList.add(list.get(list.size() - 1));
		ListNode dummy = new ListNode();
		ListNode result = dummy;
		for (int n : newList)
		{
			result.next = new ListNode(n);
			result = result.next;
		}
		return dummy.next;
	}
}
