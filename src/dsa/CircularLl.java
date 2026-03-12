package dsa;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}
class CLL_Methods{
	Node head;
	void insert(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			head.next=head;
		}
		else {
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			temp.next=newnode;
		    newnode.next=head;
		}
	}
	void insertAtBegin(int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		Node temp=head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		temp.next=newnode;
		head=newnode;	
	}
	void insertAtPos(int pos,int data) {
		if(pos==1) {
			insertAtBegin(data);
			return;
		}
		Node newnode=new Node(data);
		Node temp=head;
		for(int i=1;i<pos-1;i++) 
			temp=temp.next;
			if(temp==head) {
				System.out.println("Invalid position");
				return;
			}
			newnode.next=temp.next;
			temp.next=newnode;
	}
	void deleteAtEnd() {
		Node temp=head;
		while(temp.next.next!=head) {
			temp=temp.next;
		}
		temp.next=head;
	}
	void deleteAtBegin(){
		Node temp=head;
		while(temp.next!=head ) {
			temp=temp.next;
		}
		temp.next=head.next;
		head=head.next;
	}
	
	void display(){
		Node temp=head;
		while(temp.next!=head) {// 10 20 30 40 50 
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}
public class CircularLl {
	public static void main(String[] args) {
		CLL_Methods obj=new CLL_Methods();
		obj.insert(10);	
		obj.insert(20);	
		obj.insert(30);		
		obj.insertAtBegin(40);
		obj.deleteAtEnd();
		obj.deleteAtBegin();
		obj.insertAtPos(2, 50);
		obj.display();
	}

}
