package dsa2;

class Node{
	int size;
	int arr[][];
	Node(int size){
		this.size=size;
		arr=new int[size][size];
	}
	void addedge(int u,int v) {
		arr[u][v]=1;
		arr[v][u]=1;
	}
	void dfs(int start) {
		boolean visited[]=new boolean[size];
		dfs_traverse(start,visited);
	}
	 void dfs_traverse(int start, boolean[] visited) {
		visited[start]=true;
		System.out.print(start+" ");
		for(int i=0;i<size;i++) {//check the neighbor of each node 
			if(arr[start][i]==1 && !visited[i]) {
				dfs_traverse(i,visited);
			}
		}
	}
	 void bfs(int start) {
		 boolean visited[]=new boolean[size];
		 int store[]=new int[size];
		 int front=0,rear=0;
		 visited[start]=true;
		 store[rear++]=start;
		 while(front<rear) {
			 int node=store[front++];
			 System.out.print(node+" ");
			 for(int i=0;i<size;i++) {//check the neighbor of each node 
				if(arr[node][i]==1 && !visited[i]) {
					visited[i]=true;
					store[rear++]=i;
				}
			}
		 }
	 }
}

public class Graph {
	public static void main(String[] args) {
		Node obj=new Node(5);
		obj.addedge(0, 1);
		obj.addedge(0, 2);
		obj.addedge(1, 3);
		obj.addedge(2, 4);
		System.out.println("Depth-First Search");
		obj.dfs(0);
		System.out.println();
		System.out.println("Breadth-First Search");
		obj.bfs(0);
		
	}

}
