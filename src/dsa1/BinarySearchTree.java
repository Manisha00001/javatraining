package dsa1;

class NODe{
	int data;
	NODe left,right;
	NODe(int data){
		this.data=data;
	}
}
class Binary_Search{
	NODe root;
	void insert(int data){
		root=insertdata(root,data);
	}
	NODe insertdata(NODe root,int data){
		if(root==null) {
			return new NODe(data);
		}
		if(data<root.data) {
			root.left=insertdata(root.left,data);
		}
		else if(data>root.data){
			root.right=insertdata(root.right,data);
		}
		return root;
	}
	boolean search(NODe root,int data) {
		if(root==null) {
			return false;
		}
		if(root.data==data) {
			return true;
		}
		else if(data<root.data) {
			return search(root.left,data);
		}
		else {
			return search(root.right,data);
		}
		
	}
	void inorder(NODe root) {
		while(root!=null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
			return;
		}
	}
	void preorder(NODe root) {
		while(root!=null) {
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
			return;
		}
	}
	void postorder(NODe root) {
		while(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
			return;
		}
	}
	NODe delete(NODe root,int data) {
		if(root==null)
			return null;
		if(data<root.data) {
			root.left=delete(root.left,data);
		}
		else if(data>root.data) {
			root.right=delete(root.right,data);
		}
		else {
			if(root.left==null && root.right==null) {
				return null;//no child
			}//one child
			else if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}//two child
			NODe successor=findMin(root.right);
			root.data=successor.data;
			root.right=delete(root.right,successor.data);
		}
		return root;
	}
	NODe findMin(NODe root) {
		while(root.left!=null)
			root=root.left;	
		return root;
	}
}
public class BinarySearchTree {
	public static void main(String[] args) {
		Binary_Search obj=new Binary_Search();
		obj.insert(30);
		obj.insert(20);
		obj.insert(70);
		obj.insert(10);
		obj.insert(60);
		obj.insert(50);
		obj.delete(obj.root, 30);
		System.out.println(obj.search(obj.root, 30));
		System.out.println(obj.search(obj.root, 90));
		System.out.println("*****");
		obj.inorder(obj.root);
		System.out.println("*****");
		obj.preorder(obj.root);
		System.out.println("*****");
		obj.postorder(obj.root);
	}
}
