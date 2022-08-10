package stringtest;

import org.junit.Assert;
import org.junit.Test;

import strings.PrefixArray;

public class PrefixArrayTest {
	
	@Test
	public void isCorrect() {
		
		String s = "acacabacacabacacac";
		int[] e = {0, 0, 1, 2, 3, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 4 };
		int[] a = PrefixArray.build(s);
		
		Assert.assertArrayEquals(e, a);
	}
	
	@Test
	public void isCorrect2() {
		
		String s = "abcabd";
		int[] e = {0, 0, 0, 1, 2, 0};
		int[] a = PrefixArray.build(s);
		
		Assert.assertArrayEquals(e, a);
	}
	
	@Test
	public void isCorrect3() {
		
		String s = "aaaaaa";
		int[] e = {0, 1, 2, 3, 4, 5};
		int[] a = PrefixArray.build(s);
		
		Assert.assertArrayEquals(e, a);
	}

}
