package stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Collectors;

public class BookShelves {
	
	public static void main ( String[] args) {
		
		 String name = new String("/mppd/tlk/fwnyfm/bd/hptdsws\\oulrbhyjhpmpscfliuqnynejg\\nx\\olzbdo/ztc\\lzbozqomviosz\\kulek\\");
		 //String name = new String("/u/love\\i\\");

        String[] books = name.split("");
		Stack<String> bookstack = new Stack<>();
        
		LinkedList<String> booklist = new LinkedList<>();
		booklist.addAll(Arrays.asList(books));
		
		ArrayList<Integer> osa = new ArrayList<>();
		ArrayList<Integer> csa = new ArrayList<>();
		
		 for (int i = 0; i < booklist.size(); i ++) {
		    	if(booklist.get(i).equals("/")) osa.add(i);
		    	else if(booklist.get(i).equals("\\")) csa.add(i);
		 }		
		 
		 for(int i = osa.size() - 1 ; i >=0 ; i --) {
			 
			 for(int j = 0; j < csa.size(); j++) {
				 
				  
				  if(csa.get(j) > osa.get(i)) {  	
					  System.out.println(osa.get(i) + " " + csa.get(j));
					 reverse(osa.get(i), csa.get(j), booklist, bookstack);
					 csa.remove(j);
					 break;
				 }
			 }
			 
		 }
				 
		 System.out.println(booklist.stream()
				                       .filter(x -> !x.equals("/") && !x.equals("\\"))
				                       .collect(Collectors.joining()));		 	
		}
		
	private static void reverse(int os, int cs, LinkedList<String> booklist, Stack<String> bookstack ) {
		
		if(os != cs && os < booklist.size() && cs >= 0 ) {
			 
			 for(int j = os; j <= cs; j ++) bookstack.push(booklist.get(j));
			
			 for(int j = os; j <= cs ; j ++) {
				 booklist.remove(j); booklist.add(j, bookstack.pop());	 
			 } 
		}
	}
}

/*
 *   /u/evol\i\    
 *   /u /love i\  
 *  
 */

