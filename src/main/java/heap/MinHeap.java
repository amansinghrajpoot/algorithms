package heap;


import java.util.LinkedList;

public class MinHeap {
	
	LinkedList<Integer> heap = new LinkedList<Integer>();

	
	public LinkedList<Integer> getHeap() {
		LinkedList<Integer> clone  = new LinkedList<Integer>();
		clone.addAll(heap);
		return clone;
	}
	
	public void insert(int x) {
		this.heap.add(x);
		this.heapInvariance(heap);
	}
	
	public void delete(int x) {
		int idx = this.heap.indexOf(x);
		if (idx != -1) {
			this.swap(idx, heap.size() - 1);
			heap.pollLast();
			this.heapInvariance(heap);
		}	
	}
	
	private void heapInvariance(LinkedList<Integer> heap) {
		
	    int p = 0;
	    for(int i = heap.size() - 1 ; i >= 1; i = p) {
	      
	    	try {
	    		if(i % 2 == 0) p = (i - 2)/2;
	    		else p = (i - 1)/ 2;
	    	} catch ( ArithmeticException e) { p = 0; }
	    	
	    	if( i % 2 == 0 && i != p) {
	    		if(heap.get(i) < heap.get(i -1) && heap.get(i) < heap.get(p)) this.swap(i, p);
	    		else if ( heap.get(i - 1) <= heap.get(i) && heap.get(i - 1) < heap.get(p)) this.swap(i -1, p);
	    	}
	    	else {
	    		if(heap.get(i) < heap.get(p)) this.swap(i, p);
	    	}
	    }
	}
	
	private void swap(int i, int j) {
		Integer temp = null;
		temp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
	
	@Override
	public String toString() {
		 StringBuilder buffer = new StringBuilder(50);
		 printByLevel(buffer,"","", 0);
	     return buffer.toString();
	}
	public void print() {
		System.out.println(this);
	}
	
	private void printByLevel(StringBuilder buffer, String prefix, String childrenPrefix,int node) {
        
		buffer.append(prefix);
        buffer.append(heap.get(node));
        buffer.append('\n');
        
        if ( (2*node + 1) < heap.size() && (2*node + 2) < heap.size()) {
        	printByLevel(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ", (2*node + 1) );
        }
        else if ((2*node + 1) < heap.size()){
        	printByLevel(buffer, childrenPrefix + "└── ", childrenPrefix + "│   ", (2*node + 1) ); }
        
        if ( (2*node + 2) < heap.size()) {
        	printByLevel(buffer, childrenPrefix + "└── ", childrenPrefix + "    ", (2*node + 2));
        }
	    
	 }
	
	
}
