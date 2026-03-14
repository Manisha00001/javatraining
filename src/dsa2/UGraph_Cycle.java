package dsa2;

public class UGraph_Cycle {
	static boolean dfs(int node,int parent,boolean[] visited,int[][] graph,int v) {
		visited[node]=true;
		for(int i=0;i<v;i++) {
			if(graph[node][i]==1) {
				if(!visited[i]) {
					if(dfs(i,node,visited,graph,v))
					return true;
				}
				else if(i!=parent){
					return true;
				}
			}
		}
		return false;
	}
	static boolean cycle(int graph[][],int v) {
		boolean visited[]=new boolean[v];
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				if(dfs(i,-1,visited,graph,v))
				return true;
			}
		}

		return false;
	}
	
	public static void main(String[] args) {
		UGraph_Cycle obj=new UGraph_Cycle();
		int v=4;
		int graph[][]= {{0,1,0,1},
						{0,0,0,0},
						{0,0,0,0},
						{0,0,0,0}
						};
		System.out.println(obj.cycle(graph, v));
		
		
	}

}
/* 
  for Example: 1 is connected with 0,same time 0 is connected with its not a cycle
  because 0 is a parent for 1.parent node will not forms a cycle 
  (so the condition i!= parent is given)
  
               0
           3    	1
               	2
 */
