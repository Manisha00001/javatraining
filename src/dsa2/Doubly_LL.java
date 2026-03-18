package dsa2;

//spotify playing prev and next song in playlist
//ctrl+z=prev(undo)
//ctrl+y=next(redo)
class Node2{
	int data;
	Node2 next;
	Node2 prev;
	Node2(int data){
		this.data=data;
		next=null;
		prev=null;
	}
}
class Doubly_LL_Methods{
	Node2 head;
	void insert(int data) {
		Node2 newnode=new Node2(data);
		if(head==null) {
			head=newnode;
		}
		else{
			Node2 temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
		}
	}
	void insertAtBegin(int data) {
		Node2 temp=head;
		Node2 newnode=new Node2(data);
		newnode.next=head;
		head.prev=newnode;
		head=newnode;
	}
	void display() {
		Node2 temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	void insertAtPos(int pos,int data) {
		if(pos==1) {
			insertAtBegin(data);
			return;
		}
		Node2 temp=head;
		Node2 newnode=new Node2(data);
		for(int i=1;i<pos-1 && temp!=null;i++) {
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("Invalid position");
			return;// if we do not give return here it will show null pointer exception
		}
		newnode.prev=temp;//first we need to complete new node work
		newnode.next=temp.next;
		temp.next=newnode;
	}
}
public class Doubly_LL {
	public static void main(String[] args) {
		Doubly_LL_Methods obj=new Doubly_LL_Methods();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insertAtBegin(40);
		obj.insertAtPos(3, 70);
		obj.display();
		System.out.println("-----");
		obj.insertAtPos(7, 70);
		obj.display();
	}

}
