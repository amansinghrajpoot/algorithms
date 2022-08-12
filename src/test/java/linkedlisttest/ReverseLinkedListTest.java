package linkedlisttest;

import org.junit.Assert;
import org.junit.Test;

import linkedlist.ListNode;
import linkedlist.ReverseLinkedList;

public class ReverseLinkedListTest {
	
	@Test
	public void isReversed() {
		
		ListNode l5 = new ListNode(5, null);
		ListNode l4 = new ListNode(4, l5);
		ListNode l3 = new ListNode(3, l4);
		ListNode l2 = new ListNode(2, l3);
		ListNode l1 = new ListNode(1, l2);
		
		ListNode res = ReverseLinkedList.solution(l1);
		
		int[] arr = new int[5];
		int i = 0;
		while(res != null) {
			arr[i] = res.val;
			res =  res.next;
			i ++;
		}
		int[] exp = {5, 4, 3, 2, 1};
		Assert.assertArrayEquals(exp, arr);
	}
	
	@Test
	public void isReversed2() {
		
		ListNode l1 = new ListNode(1, null);
		
		ListNode res = ReverseLinkedList.solution(l1);
		
		int[] arr = new int[1];
		int i = 0;
		while(res != null) {
			arr[i] = res.val;
			res =  res.next;
			i ++;
		}
		int[] exp = {1};
		Assert.assertArrayEquals(exp, arr);
	}

}
