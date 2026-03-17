package dsa2;

import java.util.Arrays;

//Longest increasing subsequence
/*
  10 9 2 5 3 7 101 18
  10 101
  9 101
  2 5 7
  2 3 7 101
  O/p:4
 */
public class LIS {
	public static void main(String[] args) {
		int arr[]= {3,10,2,1,20};
		int n=arr.length;
		int store[]=new int[n];
		for(int i=0;i<n;i++) {
			store[i]=1;
		}
		for(int i=1;i<n;i++){
	        for(int j=0;j<i;j++){
	            if(arr[j]<arr[i]){
	                store[i]=Math.max(store[i],store [j]+1);
	            }
	        }
	    }
		int max=store[0];
		for(int i=0;i<n;i++) {
			if(store[i]>max) {
				max=store[i];
			}
		}
		System.out.println(max);
		
	}

}
