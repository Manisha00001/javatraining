package dsa2;

public class TopologicalOrder {
	static int stack[];
	static int top=-1;
	static void dfs(int node,boolean[] visited,int graph[][],int v) {
		visited[node]=true;
		for(int i=0;i<v;i++) {
			if(graph[node][i]==1 &&!visited[i]) {
				dfs(i,visited,graph,v);
			}
		}
		stack[++top]=node;
}
	static void toposort(int[][] graph,int v) {
		boolean visited[]=new boolean[v];
		stack=new int[v];
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				dfs(i,visited,graph,v);
			}
		}
		while(top!=-1) {
			System.out.println(stack[top--]);
		}
	}
	
	public static void main(String[] args) {
		TopologicalOrder obj=new TopologicalOrder();
		int v=6;
		int graph[][]= {{0,0,0,0,0,0},
						{0,0,0,0,0,0},
						{0,0,0,1,0,0},
						{0,0,0,0,0,0},
						{0,1,0,0,0,0},
						{1,0,1,0,0,0}};
		obj.toposort(graph, v);
		
	}
}
