package com.leetCode.arrays.addLargeIntegers;

/**
 * Definition for singly-linked list.
 * */
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  
 
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int currentDigit = 0;
        int bufferDigit = 0;
        ListNode head = null;
        ListNode temp= null ;
        
        while(l1 != null || l2 != null)
        {
           int a =0, b=0;
            if(l1 != null){
            	a = l1.val;
            	l1 = l1.next;
            }
            else{
                a = 0;
            }
            if(l2 != null){
                b = l2.val;
                l2 = l2.next;
            }
            else {
                b = 0;
            }
                
            currentDigit = (bufferDigit + a+b)%10;
            bufferDigit =  (bufferDigit + a+b)/10;
            ListNode newNode = new ListNode(0);
            newNode.val = currentDigit;
            
            if(head== null)
            {
            	head = newNode;
            }
            else
            {
            	temp.next = newNode;
            }
            temp = newNode;
            
        }
        
        if(bufferDigit != 0)
        {
        	 ListNode newNode = new ListNode(bufferDigit);
        	 temp.next = newNode;
             
        }
      return head;  
    }   
}