package arraystest;

import org.junit.Test;

import arrays.RemoveDuplicatesSortedArray;

public class RemoveDuplicateSortedArrayTest {
	
	@Test
	public void isArrayCorrect() {
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
		int[] expectedNums = {0, 1, 2, 3, 4}; // The expected answer with correct length

		int k = RemoveDuplicatesSortedArray.removeDuplicates(nums); // Calls your implementation

		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		}
	}
	
	@Test
	public void isArrayCorrect2() {
		
		int[] nums = {-1,-1,0,0,1,1,1,2,3,3,4}; // Input array
		int[] expectedNums = {-1, 0, 1, 2, 3, 4}; // The expected answer with correct length

		int k = RemoveDuplicatesSortedArray.removeDuplicates(nums); // Calls your implementation

		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		}
	}
	
	@Test
	public void isArrayCorrect3() {
		
		int[] nums = {4}; // Input array
		int[] expectedNums = {4}; // The expected answer with correct length

		int k = RemoveDuplicatesSortedArray.removeDuplicates(nums); // Calls your implementation

		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		}
	}
	
	@Test
	public void isArrayCorrect4() {
		
		int[] nums = {4, 5}; // Input array
		int[] expectedNums = {4, 5}; // The expected answer with correct length

		int k = RemoveDuplicatesSortedArray.removeDuplicates(nums); // Calls your implementation

		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		}
	}

}
