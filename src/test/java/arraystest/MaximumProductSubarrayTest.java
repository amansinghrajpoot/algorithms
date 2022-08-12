package arraystest;

import org.junit.Assert;
import org.junit.Test;

import arrays.MaximumProductSubarray;

public class MaximumProductSubarrayTest {
	
	@Test
	public void testMaxProduct() {
		int nums[] = {-2};
		int res = MaximumProductSubarray.maxProduct(nums);
		Assert.assertEquals(-2, res);
	}
	
	@Test
	public void testMaxProduct2() {
		int nums[] = {-2, 1, 4, 5, -1};
		int res = MaximumProductSubarray.maxProduct(nums);
		Assert.assertEquals(40, res);
	}
	
	@Test
	public void testMaxProduct3() {
		int nums[] = {-2, 1, 0, 5, 1};
		int res = MaximumProductSubarray.maxProduct(nums);
		Assert.assertEquals(5, res);
	}
	
	@Test
	public void testMaxProduct4() {
		int nums[] = {-2, 0, -1};
		int res = MaximumProductSubarray.maxProduct(nums);
		Assert.assertEquals(0, res);
	}
	
	@Test
	public void testMaxProduct5() {
		int nums[] = {-1, -2, -3, -4, -5};
		int res = MaximumProductSubarray.maxProduct(nums);
		Assert.assertEquals(120, res);
	}
	
	@Test
	public void testMaxProduct6() {
		int nums[] = {0, 0, -3, -4, 5};
		int res = MaximumProductSubarray.maxProduct(nums);
		Assert.assertEquals(60, res);
	}

}
