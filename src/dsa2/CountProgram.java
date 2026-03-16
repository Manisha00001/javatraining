package dsa2;

import java.util.Scanner;

public class CountProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int veg_count=0,Non_veg_count=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int val=sc.nextInt();
			if(val==1) {
				veg_count++;
			}
			else if(val==2) {
				Non_veg_count++;
			}
			else {
				System.out.println("Press 1 or 2 only");
			}
		}
		
		System.out.println("Veg Count:"+veg_count);
		System.out.println("Non Veg Count:"+Non_veg_count);
	}

}
