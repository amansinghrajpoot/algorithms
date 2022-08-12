package arraystest;

import org.junit.Test;

import arrays.RemoveElement;

public class RemoveElementTest {
	
	@Test
	public void isElementRemoved() {
		
		int[] nums = {0,1,2,2,3,0,4,2}; // Input array
		int val = 2;
		int[] expectedNums = {0,1,4,0,3}; // The expected answer with correct length

		int k = RemoveElement.removeElement(nums, val); // Calls your implementation

		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		} 
	}
	
	@Test
	public void isElementRemoved2() {
		
		int[] nums = {3, 2, 2, 3}; // Input array
		int val = 3;
		int[] expectedNums = {2, 2}; // The expected answer with correct length

		int k = RemoveElement.removeElement(nums, val); // Calls your implementation

		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		} 
	}

}
