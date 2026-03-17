package dsa2;

//Sliding window is a technique used to proces subarrays/substrings efficiently
//by dividing repeated calculations
//sum of maximum element in subArray of k
public class Sliding_Window {
	public static void main(String[] args) {
		int[] arr= {2,1,5,1,3,2};
		int window=3;
		int sum=0;
		for(int i=0;i<window;i++) {
			sum+=arr[i];
		}
		int max=sum;
		for(int i=window;i<arr.length;i++) {
			sum=sum-arr[i-window]+arr[i];
			max=Math.max(sum, max);
		} 
		System.out.println(max);
	}
	
}
