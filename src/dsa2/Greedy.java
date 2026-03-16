package dsa2;

import java.util.Arrays;

/*
  Greedy algorithm is an approach that builds a solution step-by-step always
  choosing the best immediate option without reconsidering previous choice.
 */
//maximum no of over-lapping Activities
class Activities{
	int start,end;
	Activities(int start,int end){
		this.start=start;
		this.end=end;
	}
	
}

public class Greedy {
	public static void main(String[] args) {
		int start[]= {1,3,0,5,8,5};
		int end[]=   {9,5,8,7,2,1};
		int n=start.length;
		Activities[] obj=new Activities[n];
		//to make pair start and end array we used array of objects
		for(int i=0;i<n;i++) {
			obj[i]=new Activities(start[i],end[i]);
		}
		
		Arrays.sort(obj,(s,e)->s.end - e.end);
		// if we sort the end array elements, then we come to know
	    for(int i=0;i<n;i++){
	       System.out.println(obj[i].start+" "+obj[i].end); 
	    }
	    int count=1;
	    int lastend =obj[0].end;
	    for (int i=1;i<n;i++){
	        if(obj[i].start>=lastend)
	        count++;
	        lastend=obj[i].end;
	        }
	    System.out.println(".........");
	    System.out.println(count);
	}
}
