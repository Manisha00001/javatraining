package dsa2;

//Top-Down Approach(Memorization)
public class DP_Top_Down {
	static int x=4;
	static int arr[]=new int[x+1];
	static int fib(int n) {
		if(n<=1) {
			return n;
		}
		if(arr[n]!=0) 
			return arr[n];
		arr[n]=fib(n-1)+fib(n-2);
		return arr[n];
	}
	public static void main(String[] args) {
		System.out.println(fib(x));//0 based indexing
	}
}
