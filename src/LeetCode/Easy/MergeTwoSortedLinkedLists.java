package LeetCode.Easy;


public class MergeTwoSortedLinkedLists
{

	public static void main(String[] args)
	{

		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);

		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);

		ListNode mergedList = mergeTwoLists(list1, list2);

		while (mergedList != null)
		{
			System.out.print(mergedList.val + " ");
			mergedList = mergedList.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
	{
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		if (list1.val < list2.val)
		{
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		} else
		{
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}
	}

}
