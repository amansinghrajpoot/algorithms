package arraystest;

import org.junit.Assert;
import org.junit.Test;
import arrays.MaximumSubarray;

public class MaxmimumSubarrayTest {
	
	@Test
	public void checkOutput() {
		
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		int res = MaximumSubarray.solution(arr);
		Assert.assertEquals(6, res);	
	}
	@Test
	public void checkOutput2() {
		
		int [] arr = {1,3,-3,7,4,2,1,-1,4};
		
		int res = MaximumSubarray.solution(arr);
		Assert.assertEquals(18, res);	
	}
	
	@Test
	public void checkOutput3() {
		
		int [] arr = {0, 0, 1, 0, 0, -1};
		
		int res = MaximumSubarray.solution(arr);
		Assert.assertEquals(1, res);	
	}
	
	@Test
	public void checkOutput4() {
		
		int [] arr = {2, 5, 7, 10, -20, 20, 1, -1, 2, -11, 3, -2, -1, -2, 12, 34, 9};
		
		int res = MaximumSubarray.solution(arr);
		Assert.assertEquals(68, res);	
	}
}
