package stringtest;

import org.junit.Assert;
import org.junit.Test;

import strings.KMP;

public class KMPTest {
	
	@Test
	public void isCorrect() {
		
		String str = "ababcabcabababd";
		String pattern = "ababd";
		
		boolean actualbool = KMP.solution(str, pattern);
		
		Assert.assertEquals(true, actualbool);
		
	}
	
	@Test
	public void isCorrect2() {
		
		String str = "ababcabcababab";
		String pattern = "ababd";
		
		boolean actualbool = KMP.solution(str, pattern);
		
		Assert.assertEquals(false, actualbool);
		
	}

	@Test
	public void isCorrect3() {
		
		String str = "abcdftabc";
		String pattern = "a";
		
		boolean actualbool = KMP.solution(str, pattern);
		
		Assert.assertEquals(true, actualbool);
		
	}
}
