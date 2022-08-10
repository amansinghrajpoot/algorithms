package arraystest;

import org.junit.Assert;
import org.junit.Test;

import arrays.DuplicateElement;

public class DuplicateElementTest {

	@Test
	public void checkDuplicate() {
		
		int[] nums = {1, 5, 6, 8, 1};
		
		boolean result = DuplicateElement.containsDuplicate(nums);
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void checkDuplicate2() {
		
		int[] nums = {1, 5, 6, 8, 7};
		
		boolean result = DuplicateElement.containsDuplicate(nums);
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void checkDuplicate3() {
		
		int[] nums = {1, 5, 5, 6, 8, 7};
		
		boolean result = DuplicateElement.containsDuplicate(nums);
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void checkDuplicate4() {
		
		int[] nums = {1, 5, 6, 8, 7, 9, 10, 11, 12, 13};
		
		boolean result = DuplicateElement.containsDuplicate(nums);
		Assert.assertEquals(false, result);
	}
}
