package dsa2;

class Graph_Methods {
	class Node1 {
		int data;
		Node1 next;
		Node1(int data) {
			this.data=data;
		}
	}
	int size;
	Node1[] arr;
	Graph_Methods(int size) {
		this.size=size;
		arr=new Node1[size];
	}
	void addedge(int u,int v){
		  Node1 newnode =new Node1(v);
		  newnode.next=arr[u];
		  arr[u]=newnode;
		    
		  newnode=new Node1(u);
		  newnode.next=arr[v];
		  arr[v]=newnode;
		}
	void df(int start){
	    boolean[]visited=new boolean[size];
	    dfs_traverse(start,visited);
	}
	void dfs_traverse(int start,boolean[] visited){
	    visited[start]=true;
	    System.out.println(start+" ");
	   Node1 temp=arr[start];
	   while(temp!=null){
	        if(!visited[temp.data]){
	            dfs_traverse(temp.data,visited);
	        }
	        temp=temp.next;
	    }
	}

	}
public class Graph_LL {
	public static void main(String[] args) {
		Graph_Methods obj=new Graph_Methods(5);
	    obj.addedge(0,1);
	    obj.addedge(0,2);
	    obj.addedge(1,3);
	    obj.addedge(1,4);
	    obj.df(0);
	}
}
