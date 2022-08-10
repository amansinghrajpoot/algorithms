package heaptest;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

import heap.MinHeap;



public class MinHeapTest {
		
	@Test
	public void isHeapCorrect() {
	    MinHeap mh = new MinHeap();
		mh.insert(11);
		mh.insert(5);
		mh.insert(4);
		mh.insert(12);
	
		LinkedList<Integer> res = mh.getHeap();
		Object[] expected = {4,11,5,12};
		Assert.assertArrayEquals(expected, res.toArray());
		
	}

}
