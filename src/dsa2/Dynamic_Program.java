package dsa2;

/*
   Dynamic programming is a problem solving Technique used to solve Complex problems
   by breaking them into smaller overlapping subproblems and storing their results to avoids repeated works
 */
//Bottom-Up Approach(Another name:Tabulation)
public class Dynamic_Program {
	static int fib(int n) {
		int arr[]=new int[n+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i-2];//why -1 and -2 add(last 2)
		}
		return arr[n];
	}
	public static void main(String[] args) {
		System.out.println(fib(6));// it is a 0-based indexing
	}

}
