package dsa;

import java.util.Scanner;

public class MangoTree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		//int n=sc.nextInt();
		int arr[][]=new int[m][m];
		int search=sc.nextInt();
		if(search<=m || search%m==0 ||search%m==1) {
			System.out.println("Mango tree");
		}
		else {
			System.out.println("Not a Mango Tree");
		}
	}
}
