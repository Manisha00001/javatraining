package dsa2;

/*
 	LCS-Longest common substring
 	which finds the longest sequence that appears in both in the same order(not neccesarily continuous)
 	ABCBDAB
 	BDCAB
 	
 	AB
 	BC
 	BD
 	BCA
 	BDAB O/P:4
 */
public class LCS {
		public static void main(String[] args) {
		   String s1="ABC";
		   String s2="AC";
		   int rows=s1.length();
		    int cols=s2.length();
		    int store[][]=new int[rows+1][cols+1];
		    for(int i=1;i<=rows;i++){
		         for(int j=1;j<=cols;j++){
		             if(s1.charAt(i-1)==s2.charAt(j-1)){
		                 store[i][j]=store[i-1][j-1]+1;
		             }
		             else{
			            store[i][j]=Math.max(store[i-1][j],store[i][j-1]);
			        }
		             
		    }
		}
		    System.out.println(store[rows][cols]);
	}

}
