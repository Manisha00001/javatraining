package dsa1;

public class NextGreater {
	public static int[] nextgreater(int[]arr) {
		int top=-1;
		int n=arr.length;
		int res[]=new int[n];
		int vis[]=new int[n];
		for(int i=n-1;i>=0;i--) {
			while(top>=0 && vis[top]<=arr[i]) {//
				top--;
			}
			if(top==-1) {
				res[i]=-1;
			}
			else {
				res[i]=vis[top];
			}
			top++;
			vis[top]=arr[i];
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {4,5,2,10};
		int result[]=nextgreater(arr);
		for(int i=0;i<4;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
