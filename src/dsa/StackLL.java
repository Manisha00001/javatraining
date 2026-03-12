package dsa;

class LNode{
	int data;
	LNode next;
	LNode(int data){
		this.data=data;
		next=null;
	}
}
class StackMethods{
	LNode top;
	void push(int data) {
		LNode newnode=new LNode(data);
		if(top==null) {
			top=newnode;
		}
		else {
			newnode.next=top;
			top=newnode;
		}
	}
	void pop() {
		top=top.next;
	}
	int peek() {
		return top.data;
	}
	void display() {
		while(top!=null) {
			System.out.println(top.data);
			top=top.next;
		}
	}
}
public class StackLL {
	public static void main(String[] args) {
		StackMethods obj=new StackMethods();
		obj.push(10);
		obj.push(20);
		obj.push(30); 
		obj.push(40); 
		obj.push(50);
		obj.pop();
		System.out.println("peek : "+obj.peek());
		obj.display();
	}

}
