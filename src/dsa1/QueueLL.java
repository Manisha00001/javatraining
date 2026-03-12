package dsa1;

class NOde{
	int data;
	NOde next;
	NOde(int data){
		this.data=data;
		next=null;
	}
}
class Queue_Method{
	NOde front;
	NOde rear;
	void enQueue(int data) {
		NOde newnode=new NOde(data);
		if(front==null) {
			front=rear=newnode;
		}
		else {
			NOde temp=rear;
			temp.next=newnode;
			rear=newnode;
		}
	}
	void deQueue(){
		front=front.next;
	}
	int peek() {
		return front.data;
	}
	void display() {
		NOde temp=front;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
}
public class QueueLL {
	public static void main(String[] args) {
		Queue_Method  obj=new Queue_Method();
		obj.enQueue(1);
		obj.enQueue(2);
		obj.enQueue(3);
		obj.enQueue(4);
		obj.enQueue(5);
		obj.deQueue();
		System.out.println("Peek element : "+obj.peek());
		obj.display();
	}
}
