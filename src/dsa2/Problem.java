package dsa2;
import java.util.Scanner;

public class Problem {
	static int plus(int n) {
		int sum=0;
		while(n!=0) {
			int last=n%10;
			sum+=last;
			n=n/10;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Problem obj=new Problem();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int ans=obj.plus(n);
		System.out.println(ans);
		if(ans/10==0) {
			System.out.println(ans);
		}
		else {
			int tot=obj.plus(ans);
			System.out.println(tot);
		}
	}
}
