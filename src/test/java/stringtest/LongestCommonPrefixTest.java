package stringtest;

import org.junit.Assert;
import org.junit.Test;

import strings.LongestCommonPrefix;

public class LongestCommonPrefixTest {
	
	@Test
	public void checkPrefix() {
		
		String[] input = {"flower", "flute", "flat"};
		String expected = "fl";
		String result = LongestCommonPrefix.longestCommonPrefix(input);
		
		Assert.assertEquals(expected, result);
		
	}
	
	@Test
	public void checkPrefix2() {
		
		String[] input = {"dog", "cat", "bee"};
		String expected = "";
		String result = LongestCommonPrefix.longestCommonPrefix(input);
		
		Assert.assertEquals(expected, result);
		
	}

}
