package Practice;

import java.util.Scanner;

public class oyyo {
 static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n = scn.nextInt();
	        int [] arr = new int[n];
	        for(int i=0;i<arr.length;i++){
	            
	            arr[i]=scn.nextInt();
	        }
	        System.out.println(stairsv(n,arr,new int[n+1]));
	        
	}

	
	
	 public static int stairsv(int n, int []arr, int[]qb){
	      
	      if(n==0){
	          return 1;
	      }
	      if(qb[n]!=0){
	          return qb[n];
	      }
	      int ans1=0;
	      
	      for(int i=1;i<arr[i];i++){
	      
	      
	      int di=stairsv(n-i,arr,qb);
	     	     
	     ans1  =ans1+di;
	    qb[n]=ans1;
	    qb[n]=ans1;
	      }
	    
	      return ans1;
	  }
	
}
