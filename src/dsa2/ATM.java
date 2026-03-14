package dsa2;

public class ATM {
	public static void main(String[] args) {
		int amount=1853;
		int n1=amount/500;
		System.out.println("500 Notes: "+n1);
		int rem_n1=amount%500;
		int n2=rem_n1/200;
		System.out.println("200 Notes: "+n2);
		int rem_n2=amount%200;
		int n3=rem_n2/200;
		System.out.println("100 Notes: "+n3);
		int rem_n3=amount%100;
		System.out.println("remaining: "+rem_n3);
	}

}
