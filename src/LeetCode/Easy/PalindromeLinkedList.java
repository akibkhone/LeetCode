package LeetCode.Easy;

public class PalindromeLinkedList
{

	public static void main(String[] args)
	{
		ListNode listNode1 = new ListNode(1);
		listNode1.next = new ListNode(2);
		listNode1.next.next = new ListNode(2);
		listNode1.next.next.next = new ListNode(1);

		System.out.println(isPalindrome(listNode1));

		ListNode listNode2 = new ListNode(1);
		listNode2.next = new ListNode(2);

		System.out.println(isPalindrome(listNode2));
	}

	public static boolean isPalindrome(ListNode head)
	{
		StringBuilder wordSb = new StringBuilder();
		while (head != null)
		{
			wordSb = wordSb.append(head.val);
			head = head.next;
		}
		String word = wordSb.toString();
		return word.equals(wordSb.reverse().toString());
	}
}
