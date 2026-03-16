package dsa2;

import java.util.Scanner;

public class Petrol_Amount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float x=sc.nextInt();
		float y=sc.nextInt();
		float z=sc.nextInt();
		double s=x/y;
		System.out.println(s);
		double amount=(x/y)*z*30;
		System.out.println(amount);
	}

}
