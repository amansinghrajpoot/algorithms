package stringtest;

import org.junit.Assert;
import org.junit.Test;

import strings.HaystackAndNeedle;

public class HaystackAndNeedleTest {
	
	@Test
	public void testHaystackAndNeedle() {
		
	  String haystack = "Hello";
	  String needle = "ll";
	  int idx = HaystackAndNeedle.strStr(haystack, needle);
	  
	  Assert.assertEquals(2, idx);
	}
	
	@Test
	public void testHaystackAndNeedle2() {
		
	  String haystack = "abc";
	  String needle = "c";
	  int idx = HaystackAndNeedle.strStr(haystack, needle);
	  
	  Assert.assertEquals(2, idx);
	}

	@Test
	public void testHaystackAndNeedle3() {
		
	  String haystack = "a";
	  String needle = "a";
	  int idx = HaystackAndNeedle.strStr(haystack, needle);
	  
	  Assert.assertEquals(0, idx);
	}
	@Test
	public void testHaystackAndNeedle4() {
		
	  String haystack = "abb";
	  String needle = "bb";
	  int idx = HaystackAndNeedle.strStr(haystack, needle);
	  
	  Assert.assertEquals(1, idx);
	}
}
