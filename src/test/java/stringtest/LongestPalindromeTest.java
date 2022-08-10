package stringtest;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import strings.LongestPalindrome;

public class LongestPalindromeTest {
	
	@Test
	public void isLongestPalindrom() {
		String s = "babad";
		String result = LongestPalindrome.longestPalindrome(s);
		ArrayList<String> al = new ArrayList<>();
		al.add("aba"); al.add("bab");
		boolean rb = al.contains(result);
		Assert.assertEquals(true, rb);
		
	}
	
	@Test
	public void isLongestPalindrom1() {
		String s = "aa";
		String result = LongestPalindrome.longestPalindrome(s);
		Assert.assertEquals("aa", result);
		
	}
	
	@Test
	public void isLongestPalindrom3() {
		String s = "ababbaabbaa";
		String result = LongestPalindrome.longestPalindrome(s);
		Assert.assertEquals("abbaabba", result);
		
	}
	
	@Test
	public void isLongestPalindrom4() {
		String s = "aaaaaaa";
		String result = LongestPalindrome.longestPalindrome(s);
		Assert.assertEquals("aaaaaaa", result);
		
	}
	
	@Test
	public void isLongestPalindrom5() {
		String s = "abcdef";
		String result = LongestPalindrome.longestPalindrome(s);
		Assert.assertEquals("f", result);
		
	}
	
	@Test
	public void isLongestPalindrom6() {
		String s = "cbbd";
		String result = LongestPalindrome.longestPalindrome(s);
		Assert.assertEquals("bb", result);
		
	}
    
	@Test
	public void isLongestPalindrom7() {
		String s = "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
		String result = LongestPalindrome.longestPalindrome(s);
		Assert.assertEquals("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", result);
		
	}
	
	
}
