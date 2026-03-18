package dsa2;

import java.util.HashMap;

class Node3{
	int key;
    int value;
    Node3 prev;
    Node3 next;
    Node3(int key,int value){
        this.key=key;
        this.value=value;
   }
}
class LRUcache {
	int capacity;
	HashMap<Integer,Node3>map;
	Node3 head,tail;
	LRUcache(int capacity){
	   this.capacity=capacity;
	   map=new HashMap<>();
	   head=new Node3(0,0);
	   tail=new Node3(0,0);
	   head .next=tail;
	   tail.prev=head;
	}
}
class LRU{	    
	public static void main(String[] args) {
		LRUcache obj=new LRUcache(2);
	    System.out.println(11&10);
	    	
	}
}


