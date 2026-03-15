package dsa2;

/*
 		 10
 	0---------1
 	|		  |
 	|5  	  | 2
 	|		  |
 	3---------4
 		 2
 	0--->4
 	#0-1-4
 	10+2=12 not minimum
 	#0-3-4
 	5+2=7 minimum(It is Dijkstra)
 */
public class DijkstraA {
	static int findmin(int distance[],boolean visited[],int v) {
		//to find the node's nearest neighbor
		int min_node=-1;
		for(int i=0;i<v;i++) {
			if(!visited[i] && (min_node==-1 || distance[i]<distance[min_node])) {
				min_node=i;
			}
		}
		return min_node;
	}
	static void dijkstra(int graph[][],int v,int src) {
		int distance[]=new int[v];//to save distance
		boolean visited[]=new boolean[v];
		for(int i=0;i<v;i++) {
			distance[i]=Integer.MAX_VALUE;//in default the array is filled with 0 store that it will consider 0 as minimum weight
		}
		distance[src]=0;
		for(int i=0;i<v;i++) {
			int min_node=findmin(distance,visited,v);
			visited[min_node]=true;
			for(int j=0;j<v;j++) { // to visit min_nofr neighbors
				if(graph[min_node][j]!=0 && !visited[j]) {
					int newdist=distance[min_node]+graph[min_node][j];
					if(newdist<distance[j]) {
						distance[j]=newdist;
						
					}
				}
				
			}
		}
		for(int i=0;i<v;i++) {
			System.out.println("From Vertex 0 to "+i+" "+distance[i]);
		}
	}
	public static void main(String[] args) {
		DijkstraA obj=new DijkstraA();
		int v=5;
		int graph[][]= {{0,10,0,5,0},
						{10,0,1,2,0},
						{0,1,0,0,4},
						{5,2,0,0,2},
						{0,0,4,2,0}};
		int src=0;
		obj.dijkstra(graph, v, src);
	}

}
/*
 pick nearest unvisited neighbor
 update its neighbors
 mark it as visited
 */
