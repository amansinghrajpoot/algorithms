package arraystest;

import org.junit.Assert;
import org.junit.Test;

import arrays.ArrayProductExceptSelf;

public class ArrayProductExceptItselfTest {

	@Test
	public void isCorrect() {
		
		int[] arr = {1, 2, 3, 4};
		int[] result = ArrayProductExceptSelf.productExceptSelf(arr);
		int[] expected = {24, 12, 8, 6};
		Assert.assertArrayEquals(expected, result);
		
	}
	@Test
	public void isCorrect2() {
		
		int[] arr = {4, 4, 1, 9};
		int[] result = ArrayProductExceptSelf.productExceptSelf(arr);
		int[] expected = {36, 36, 144, 16};
		Assert.assertArrayEquals(expected, result);
		
	}
}
