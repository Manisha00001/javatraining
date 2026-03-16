package dsa2;

public class Prims {
	static int minKey(int[] key,boolean visited[],int V) {//MSD
		int min=Integer.MAX_VALUE;
		int min_index=-1;
		for(int i=0;i<V;i++) {
			if(!visited[i] && key[i]<min) {
				min=key[i];
				min_index=i;
			}
		}
		return min_index;
	}
	static void Prims_MST(int graph[][],int V) {//Goal is-connect all nodes/vertex with minimum cost
		int parent[]=new int[V];
		int key[]=new int[V];
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++) {
			key[i]=Integer.MAX_VALUE;
		}
		key[0]=0;
		parent[0]=-1;
		for(int i=0;i<V-1;i++) {
			int u=minKey(key,visited,V);
			visited[u] = true;
            for(int j=0; j<V; j++){
                if(graph[u][j]!=0 && !visited[j] && graph[u][j] < key[j]){
                    parent[j] = j;
                    key[j] = graph[u][j];
                }
            }
		}for(int i=0; i<V; i++){
			System.out.println("From src 0 to "+ i + " "+key[i]);
	     }
}
	public static void main(String[] args) {
		Prims obj=new Prims();
		int graph[][]= {{0,2,0,6,0},
						{2,0,3,8,5},
						{0,3,0,0,7},
						{6,8,0,0,9},
						{0,5,7,9,0}};
		int v=5;
		obj.Prims_MST(graph, v);
		
	}

}
