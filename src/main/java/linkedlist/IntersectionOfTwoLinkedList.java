package linkedlist;

import java.util.HashSet;

public class IntersectionOfTwoLinkedList {
	
public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        HashSet<ListNode> hs = new HashSet<ListNode>();
        
        ListNode curnode1 = headA;
        ListNode curnode2 = headB;
        
        while (curnode1 != null && curnode2 != null){            
       
             if( hs.contains(curnode2))
             return curnode2;
             if( hs.contains(curnode1))
             return curnode1;
            
             if(curnode2 == curnode1 ) return curnode1;
            
             hs.add(curnode2);
             hs.add(curnode1);
            
             curnode1 = curnode1.next;
             curnode2 = curnode2.next;
            
        }
        
        while (curnode1 != null){
        
            if( hs.contains(curnode1))
                return curnode1;
            curnode1 = curnode1.next;
  
        }
        
        while (curnode2 != null){
            
            if( hs.contains(curnode2))
                return curnode2;
            
             curnode2 = curnode2.next;
        }
        
        return null;
        
    }

}
