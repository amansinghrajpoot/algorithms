package arrays;


import java.util.LinkedList;

public class MaxPossibleValue {
  
	static int sy = 0;
	
	public static void main(String[] s) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(7); list.add(7); list.add(4); list.add(6); list.add(6);list.add(3); list.add(4); list.add(4);
		list.add(6);
	
		
		int x = solution(5, list);
		System.out.println(x);
	
	}
	
	public static int solution(int K, LinkedList<Integer> A) {
		
		
		int x = 0;
		for (int j = 0 ; j < A.size(); j ++) {
			for (int i = j + 1; i < A.size(); i++) {
			
			   if(i - j <= K && i > j) {
				if(A.get(i) - A.get(j) > x) {x = A.get(i) - A.get(j);}
			   }
			}
		}
		
		return x;
	}
	
}
	
	