package dsa;

class Queue{
	int arr[];
	int size;
	int front;
	int rear;
	Queue(int size){
		this.size=size;
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	boolean isFull() {
		return rear==size-1;
	}
	boolean isEmpty() {
		return front==-1;
	}
	
	void enQueue(int data){
		if(isFull()) {
			System.out.println("Queue overflow");
			return;
			}
		if(front==-1) {
			arr[++rear]=data;
			front++;
		}
		else {
			arr[++rear]=data;
		}
	}
	int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return 0;
		}
		return arr[front++];
	}
	int peek() {
		return arr[front];
	}
	
	void display() {
		for(int i=front;i<=rear;i++) {
			System.out.println(arr[i]);
		}
	}
}

public class QueueConcept {
	public static void main(String[] args) {
		Queue obj=new Queue(5);
		//
		obj.deQueue();
		//System.out.println("First element: "+obj.peek());
		//obj.display();
	}

}
