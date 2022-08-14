package arraystest;

import org.junit.Assert;
import org.junit.Test;

import arrays.SearchInsertPosition;

public class SearchInsertPositionTest {
	
	@Test
	public void testPosition() {
		
		int[]  nums = {1, 3, 4, 5};
		int target = 2;
		
		int res = SearchInsertPosition.searchInsert(nums, target);
		
		Assert.assertEquals(1, res);
	}
	@Test
	public void testPosition2() {
		
		int[]  nums = {1, 3, 5, 6};
		int target = 4;
		
		int res = SearchInsertPosition.searchInsert(nums, target);
		
		Assert.assertEquals(2, res);
	}
	
	@Test
	public void testPosition3() {
		
		int[]  nums = {1};
		int target = 4;
		
		int res = SearchInsertPosition.searchInsert(nums, target);
		
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testPosition4() {
		
		int[]  nums = {1, 2, 3};
		int target = 4;
		
		int res = SearchInsertPosition.searchInsert(nums, target);
		
		Assert.assertEquals(3, res);
	}
	
	@Test
	public void testPosition5() {
		
		int[]  nums = {1};
		int target = 0;
		
		int res = SearchInsertPosition.searchInsert(nums, target);
		
		Assert.assertEquals(0, res);
	}
	
	@Test
	public void testPosition6() {
		
		int[]  nums = {6, 7, 8, 9};
		int target = 0;
		
		int res = SearchInsertPosition.searchInsert(nums, target);
		
		Assert.assertEquals(0, res);
	}

}
