package com.leetCode.arrays.addLargeIntegers;
import com.leetCode.arrays.addLargeIntegers.ListNode;

public class AddLargeIntegers {

	public static void main(String[] args) {

		// Input Data for Linked List l1, l2 : will be done through Scanner Later
		ListNode l1 = new ListNode(9);
		l1.next= new ListNode(9);
		ListNode l2 = new ListNode(9);
		l2.next= new ListNode(9);
		
		ListNode sumNode = l1.addTwoNumbers(l1, l2);
		while(sumNode != null)
		{
		System.out.print(sumNode.val + "->");
		sumNode = sumNode.next;
		}
	}

}
