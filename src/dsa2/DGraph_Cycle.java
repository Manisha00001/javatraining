package dsa2;

public class DGraph_Cycle {
	static boolean dfs(int node,boolean[] visited,boolean[] stack,int[][] graph,int v) {
		visited[node]=true;
		stack[node]=true;
		for(int i=0;i<v;i++) {
			if(graph[node][i]==1) {
				if(!visited[i]) {
					if(dfs(i,visited,stack,graph,v))
						return true;
				}
				else if(stack[i]){
					return true;
				}
			}
		}
		return false;
	}
	static boolean cycle(int graph[][],int v) {
		boolean visited[]=new boolean[v];
		boolean stack[]=new boolean[v];
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				if(dfs(0,visited,stack,graph,4))
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		DGraph_Cycle obj=new DGraph_Cycle();
		int v=4;
		int graph[][]= {{0,1,0,0},
						{0,0,1,0},
						{0,0,0,0},
						{0,1,0,0}};
		System.out.println(obj.cycle(graph, v));
	}
}
