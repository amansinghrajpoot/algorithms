package arrays;

public class PalindromeNumber {
	
public static boolean isPalindrome(int x) {
        
        if (x < 0) return false;
        
        
        String num = Integer.toString(x);
        if(num.length() == 1) return true;
        
        int  mid = num.length()/2;
        
        int i = 0, j = num.length() - 1;
        
        while ( i < mid ){
            if(num.charAt(i) != num.charAt(j)) return false;
            i++; j--;
        }
        
        return true;
}

}
