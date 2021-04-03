package leetcode;

import util.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class AddTwoNumbersSolution {
	
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	ListNode ln = null;
    	
    	if(l1 == null && l2 == null)
    	{
    		return null;
    	}
    	else if(l1 != null && l2 == null)
    	{
    		if(l1.val > 9)
    		{
    			ln = new ListNode(l1.val + 0 - 10, addTwoNumbers(l1.next, new ListNode(1)));	
    		}
    		else
    		{
    			ln = new ListNode(l1.val + 0, addTwoNumbers(l1.next, null));
    		}
    			
    	}
    	else if(l1 == null && l2 != null)
    	{
    		if(l2.val > 9)
    		{
    			ln = new ListNode(0 + l2.val -10, addTwoNumbers(new ListNode(1), l2.next));
    		}
    		else
    		{
    			ln = new ListNode(0 + l2.val, addTwoNumbers(null, l2.next));	
    		}
    	}
    	else
    	{
    		if(l1.val + l2.val > 9)
    		{
    			if(l1.next != null)
    			{
    				l1.next.val++;
    				ln = new ListNode(l1.val + l2.val - 10, addTwoNumbers(l1.next, l2.next));
    			}
    			else if(l2.next != null)
    			{
    				l2.next.val++;
    				ln = new ListNode(l1.val + l2.val -10, addTwoNumbers(l1.next, l2.next));
    			}
    			else
    			{
    				ln = new ListNode(l1.val + l2.val -10, addTwoNumbers(null, new ListNode(1)));
    			}
    				
    		}
    		else
    		{
    			ln = new ListNode(l1.val + l2.val, addTwoNumbers(l1.next, l2.next));
    		}
    	}
    	
    	return ln;
    }

}
