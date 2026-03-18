package dsa2;

import java.util.HashMap;

class LRU {
	class Node{
		int key;
	    int value;
	    Node prev;
	    Node next;
	    Node(int key,int value){
	        this.key=key;
	        this.value=value;
	    }
}
	    int capacity;
	    HashMap<Integer,Node>map;
	    Node head,tail;
	    LRU(int capacity){
	        this.capacity=capacity;
	        map=new HashMap<>();
	        head=new Node(0,0);
	        tail=new Node(0,0);
	        head .next=tail;
	        tail.prev=head;
	    }
	    
	
	    
	    public static void main(String[] args) {
	    	System.out.println("Hello World");
	    }
	}


