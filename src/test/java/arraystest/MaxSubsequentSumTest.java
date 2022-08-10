package arraystest;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

import arrays.MaxSubsequentSum;

public class MaxSubsequentSumTest {
	
	@Test
	public void isCorrectOutput() {
           
		LinkedList<Integer> list = new LinkedList<>();	
		list.add(1); list.add(4); list.add(2);
		int x = MaxSubsequentSum.solution(list.size(), 6, list);
		Assert.assertEquals(3, x);
	}
	
	@Test
	public void emptyList() {
           
		LinkedList<Integer> list = new LinkedList<>();	
		int x = MaxSubsequentSum.solution(list.size(), 6, list);
		Assert.assertEquals(0, x);
	}
	

}
