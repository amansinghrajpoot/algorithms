package arraystest;

import org.junit.Assert;
import org.junit.Test;

import strings.LengthOfLongestSubstring;

public class LengthOfLongestSubstringTest {
	
	@Test
	public void isCorrect() {
		
		String s = "abcabcbb";
		
		int len = LengthOfLongestSubstring.solution(s);
		Assert.assertEquals(3, len);
	}
	
	@Test
	public void isCorrect2() {
		
		String s = "dvdf";
		
		int len = LengthOfLongestSubstring.solution(s);
		Assert.assertEquals(3, len);
	}

}
