package dsa1;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}
class LL_Methods{
	Node head;
	void insert(int data) {//insert at end // O(n) n unit of time
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {//To find the last node in the list
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	void insertAtBegin(int data) {//O(1)
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
	}
	void insertAtPos(int pos,int data) {//O(n)
		if(pos==1) {
			insertAtBegin(data);
			return;
		}
		Node newnode=new Node(data);
		Node temp=head;
		for(int i=1;i<pos-1 && temp!=null;i++) 
			temp=temp.next;
			if(temp==null) {
				System.out.println("Invalid position");
				return;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
	void deleteAtBegin() {//O(1)
		Node temp=head;//Another way head=head.next;
		head=temp.next;
	}
	void deleteAtEnd(){//O(n)
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	
	void deleteAtPos(int pos) {//O(n)
		if(pos==1) {
			deleteAtBegin();
			return;
		}
		Node temp=head;
		for(int i=1;i<pos-1 && temp!=null;i++) 
			temp=temp.next;
		if(temp==null || temp.next==null) {//temp==null executed when this condition(temp!=null)fails 
			System.out.println("Invalid del position");//temp.next==null executed when this condition(6<5)fails
			return;
		}
		
		temp.next=temp.next.next;
	}
	void display(){
		Node temp=head;
		while(temp!=null) {// 10 20 30 40 50 
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class LinkedEX {
	public static void main(String[] args) {
		LL_Methods obj=new LL_Methods();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.insert(50);
		obj.insertAtBegin(60);
		obj.deleteAtEnd();
		obj.deleteAtBegin();
		obj.insertAtPos(3, 25);
		obj.deleteAtPos(6);
		obj.display();
		
		
	}

}

