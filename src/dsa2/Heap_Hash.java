package dsa2;

import java.util.HashMap;
import java.util.PriorityQueue;

/*
  Heap & Hashing Integration means using a heap and hashmap together
  to get quickly min /max element and fast searching of elements
  
  frequency of top k elements --- 10 10 3 3 3 5 5 5
  priority queue remove the priority element first
 */
public class Heap_Hash {
	public static void main(String[] args) {
		int arr[]= {1,1,1,2,2,3};
		int k=2;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		PriorityQueue <Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));//(a,b)->map.get(a)-map.get(b) used for sorting
		for(int key:map.keySet()) {
			pq.add(key);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.poll() );
		}
	}

}
