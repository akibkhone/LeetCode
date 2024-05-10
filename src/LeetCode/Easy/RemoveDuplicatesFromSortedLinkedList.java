package LeetCode.Easy;

public class RemoveDuplicatesFromSortedLinkedList
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

		ListNode removeElements = removeElements(listNode, -1);

		while (removeElements != null)
		{
			System.out.println(removeElements.val);
			removeElements = removeElements.next;
		}
	}

	public static ListNode removeElements(ListNode head, int val)
	{

		if (head == null)
		{
			return null;
		}

		ListNode dummy = new ListNode();
		ListNode current = dummy;
		while (head != null)
		{
			if (head.val != val)
			{
				current.next = new ListNode(head.val);
				current = current.next;
			}
			head = head.next;
		}
		return dummy.next;
	}
}
