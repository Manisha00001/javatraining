package dsa2;

public class Bellman {//to find the minimum distance from source to node with negative weight also
	static void bellman(int V,int e,int edges[][],int src) {
		int dis[]=new int[V];
		for(int i=0;i<V;i++) {
			dis[i]=Integer.MAX_VALUE;
		}
		dis[src]=0;
		for(int i=1;i<=V-1;i++) {
			for(int j=0;j<e;j++) {
				int u=edges[j][0];
				int v=edges[j][1];
				int weight=edges[j][2];
				if(dis[u]!=Integer.MAX_VALUE && dis[u]+weight<dis[v])
					dis[v]=dis[u]+weight;
			}
		}
		for(int i=0;i<V;i++) {
			System.out.println("From source 0 to "+i+" "+dis[i]);
		}
		
	}
	public static void main(String[] args) {
		Bellman obj=new Bellman();
		int v=5;
		int e=8;
		int edges[][]= {{0,1,-1},
						{0,2,4},
						{1,2,3},
						{1,3,2},
						{1,4,2},
						{3,2,5},
						{3,1,1},
						{4,3,-3}
						};
		int src=0;
		obj.bellman(v,e,edges,src);//src=source
	}

}
