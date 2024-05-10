package LeetCode.Easy;

public class AddTwoNumbersLinkedLists
{

	public static void main(String[] args)
	{
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);

		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);

		ListNode addedNumbers = addTwoNumbers(list1, list2);

		while (addedNumbers != null)
		{
			System.out.print(addedNumbers.val + " ");
			addedNumbers = addedNumbers.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode list1, ListNode list2)
	{
		ListNode dummy = new ListNode(0); // creating an dummy list
		ListNode curr = dummy; // intialising an pointer
		int carry = 0; // intialising our carry with 0 intiall
		// while loop will run, until list1 OR list2 not reaches null OR if they both
		// reaches
		// null. But our carry has some value in it.
		// We will add that as well into our list
		while (list1 != null || list2 != null || carry == 1)
		{
			int sum = 0; // intialising our sum
			if (list1 != null)
			{ // adding list1 to our sum & moving list1
				sum += list1.val;
				list1 = list1.next;
			}
			if (list2 != null)
			{ // adding list2 to our sum & moving list2
				sum += list2.val;
				list2 = list2.next;
			}
			sum += carry; // if we have carry then add it into our sum
			carry = sum / 10; // if we get carry, then divide it by 10 to get the carry
			ListNode node = new ListNode(sum % 10); // the value we'll get by moduloing it, will become as new node so. add it
																							// to our list
			curr.next = node; // curr will point to that new node if we get
			curr = curr.next; // update the current every time
		}
		return dummy.next; // return dummy.next bcz, we don't want the value we have consider in it
												// intially!!
	}
}
