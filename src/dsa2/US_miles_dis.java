package dsa2;

import java.util.Scanner;

public class US_miles_dis {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double litre=sc.nextDouble();
		double dist=sc.nextDouble();
		double km=(litre/dist)*100;
		double gallon=0.2642;
		double miles=0.6214;
		double us=(dist*miles)/(litre*gallon);
		System.out.println(km);
		System.out.println(us);
	}

}
