package dsa2;

import java.util.Arrays;
import java.util.Scanner;

public class Prefix_sum {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int val=0;
		int res[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			val+=a[i];
			res[i]=val;
		}
		System.out.println(Arrays.toString(res));*/
		int arr[]= {2,4,6,8};
		int n=arr.length;
		int res[]=new int[n];
		res[0]=arr[0];
		for(int i=1;i<n;i++) {
			res[i]=res[i-1]+arr[i];
		}
		System.out.println(Arrays.toString(res));
	}
}
