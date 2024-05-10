package LeetCode.Medium;

import java.math.BigInteger;

public class AddTwoNumbers
{

	public static void main(String[] args)
	{
		ListNode listNode1 = new ListNode(2);
		listNode1.next = new ListNode(4);
		listNode1.next.next = new ListNode(3);

		ListNode listNode2 = new ListNode(5);
		listNode2.next = new ListNode(6);
		listNode2.next.next = new ListNode(4);

		ListNode result = addTwoNumbers(listNode1, listNode2);
		while (result != null)
		{
			System.out.println(result.val);
			result = result.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		if (l1 == null || l2 == null)
		{
			return null;
		}
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		while (l1 != null)
		{
			sb1.append(l1.val);
			l1 = l1.next;
		}
		while (l2 != null)
		{
			sb2.append(l2.val);
			l2 = l2.next;
		}

		String s1 = sb1.reverse().toString();
		String s2 = sb2.reverse().toString();

		BigInteger bigInteger1 = new BigInteger(s1);
		BigInteger bigInteger2 = new BigInteger(s2);

		BigInteger sumInt = bigInteger1.add(bigInteger2);
		
		String sum = String.valueOf(sumInt);
		StringBuilder sumSb = new StringBuilder(sum);

		ListNode dummy = new ListNode();
		ListNode current = dummy;
		for (char c : sumSb.reverse().toString().toCharArray())
		{
			current.next = new ListNode(Character.getNumericValue(c));
			current = current.next;
		}
		return dummy.next;
	}

}
