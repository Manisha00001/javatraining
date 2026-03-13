package dsa1;

class Node1{
	int data;
	Node1 left,right;
	Node1(int data){
		this.data=data;
	}
}
class Binary_Methods{
	Node1 root;
	void insert(int data) {
		root=insertdata(root,data);
	}
	Node1 insertdata(Node1 root,int data) {
		if(root==null) {
			return new Node1(data);
		}
		if(root.left==null) {
			root.left=insertdata(root.left,data);
		}
		else {
			root.right=insertdata(root.right,data);
		}
		return root;
	}
	void inorder(Node1 root) {
		while(root!=null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
			return;
		}
	}
	void preorder(Node1 root) {
		while(root!=null) {
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
			return;
		}
	}
	void postorder(Node1 root) {
		while(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
			return;
		}
	}
	int height(Node1 root) {
		if(root==null) {
			return 0;
		}
		int left=height(root.left);
		int right=height(root.right);
		return Math.max(left, right)+1;
	}
}

public class TreeC {
	public static void main(String[] args) {
		Binary_Methods obj=new Binary_Methods();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.insert(90);

		System.out.println("INorder");
		obj.inorder(obj.root);
		System.out.println("PREorder");
		obj.preorder(obj.root);
		System.out.println("POSTorder");
		obj.postorder(obj.root);
		System.out.println("Number of Root levels:"+obj.height(obj.root));;
	}
}
