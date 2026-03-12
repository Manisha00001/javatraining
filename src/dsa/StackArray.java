package dsa;

//import java.util.Arrays;

class Stack{
	int arr[];
	int top;
	int size;
	Stack(int size){
		this.size=size;
		arr=new int[size];
		top=-1;
	}
	boolean isFull() {
		if(top==size-1) {
			return true;
		}
		return false;
	}
	boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	void push(int data) {
		if(isFull()) {
			System.out.println("Stack is overflow");
			return;
		}
		arr[++top]=data;
	}
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		return arr[top--];
	}
	int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		return arr[top];
		
	}
	void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]);
		}
	}
}
public class StackArray {
	public static void main(String[] args) {
		Stack obj=new Stack(5);
		obj.isFull();
		obj.push(10);
		/*obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(60);
		obj.push(70);*/
		obj.isEmpty();
		System.out.println("Pop : "+obj.pop());
		System.out.println("Peek : "+obj.peek());
		obj.display();
		
	}

}
