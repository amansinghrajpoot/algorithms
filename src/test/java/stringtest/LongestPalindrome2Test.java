package stringtest;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import strings.LongestPalindrome2;

public class LongestPalindrome2Test {
	
	@Test
	public void isLongestPalindrom8() {
		String s = "babad";
		String result = LongestPalindrome2.longestPalindrome(s);
		ArrayList<String> al = new ArrayList<>();
		al.add("aba"); al.add("bab");
		boolean rb = al.contains(result);
		Assert.assertEquals(true, rb);
		
	}
	
	@Test
	public void isLongestPalindrom9() {
		String s = "aa";
		String result = LongestPalindrome2.longestPalindrome(s);
		Assert.assertEquals("aa", result);
		
	}
	
	@Test
	public void isLongestPalindrom10() {
		String s = "ababbaabbaa";
		String result = LongestPalindrome2.longestPalindrome(s);
		Assert.assertEquals("abbaabba", result);
		
	}
	
	@Test
	public void isLongestPalindrom11() {
		String s = "aaaaaaa";
		String result = LongestPalindrome2.longestPalindrome(s);
		Assert.assertEquals("aaaaaaa", result);
		
	}
	
	@Test
	public void isLongestPalindrom12() {
		String s = "abcdef";
		String result = LongestPalindrome2.longestPalindrome(s);
		Assert.assertEquals("f", result);
		
	}
	
	@Test
	public void isLongestPalindrom13() {
		String s = "cbbd";
		String result = LongestPalindrome2.longestPalindrome(s);
		Assert.assertEquals("bb", result);
		
	}
    
	@Test
	public void isLongestPalindrom14() {
		String s = "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
		String result = LongestPalindrome2.longestPalindrome(s);
		Assert.assertEquals("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", result);
		
	}
	

}
