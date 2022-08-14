package linkedlisttest;

import org.junit.Assert;
import org.junit.Test;

import linkedlist.IntersectionOfTwoLinkedList;
import linkedlist.ListNode;

public class IntersectionOfTwoLinkedListTest {
	
	@Test
	public void checkIntersectedNode() {
		
		/*
		 *     1 -> 2 -> 3 -> 4   
		 *                      ->  5 -> 6 -> 7
		 *          1 -> 3 -> 4 
		 */
		ListNode j = new ListNode(7, null);
		ListNode i = new ListNode(6, j);
		ListNode h = new ListNode(5, i);
		
		ListNode g = new ListNode(4, h);
		ListNode d = new ListNode(4, h);
		
		ListNode c = new ListNode(3, d);
		ListNode b = new ListNode(2, c);
		ListNode a = new ListNode(1, b);
		
		ListNode f = new ListNode(3, g);
		ListNode e = new ListNode(1, f);
		
		ListNode res = IntersectionOfTwoLinkedList.getIntersectionNode(a, e);
		
		Assert.assertEquals(h, res);		
		
	}
	
	@Test
	public void checkIntersectedNode2() {
		
		/*
		 *     1 -> 2 -> 3 -> 4   
		 *                       -> 6 -> 7
		 *     1 -> 3 -> 4 -> 5
		 */
		ListNode j = new ListNode(7, null);
		ListNode i = new ListNode(6, j);
		
		ListNode h = new ListNode(5, i);
		
		ListNode d = new ListNode(4, i);
		ListNode c = new ListNode(3, d);
		ListNode b = new ListNode(2, c);
		ListNode a = new ListNode(1, b);
		
		ListNode g = new ListNode(4, h);
		ListNode f = new ListNode(3, g);
		ListNode e = new ListNode(1, f);
		
		ListNode res = IntersectionOfTwoLinkedList.getIntersectionNode(a, e);
		
		Assert.assertEquals(i, res);		
		
	}

}
