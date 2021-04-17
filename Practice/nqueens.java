package Practice;

import java.util.Scanner;

public class nqueens {
 static Scanner scn= new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n =scn.nextInt();
       int arr[]=new int[n];
       for(int i =0;i<arr.length;i++) {
    	   
    	   arr[i]=scn.nextInt();
       }
       
       
       Integer dp []= new Integer[n+1];
       dp[n]=1;
       for(int i=n-1;i>=0;i--) {
    	   if(arr[i]>0) {
    		   int min =Integer.MAX_VALUE;
    	   for(int j=1;j<=arr[i]&&i+j<dp.length;j++) {
    		 if(dp[i+j]!=null) {  
    		   min= Math.min(min, i+j);
    		 }
    	   }
    	   
    	   if(min!=Integer.MAX_VALUE) {
    		   dp[i]=min+1;
    	   }
    	   else 
    	   {
    		   dp[i]=null;
    	   }
       }
       
       System.out.println(dp[0]);
       }
	}

	
	
	
	
	
	
	
	
	public static int dpfib(int n , int [] qb ) {
			
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0 ;
		}
				
			
			if(qb[n]!=0) {
				return qb[n];
			}
			int n1 =dpfib(n-1, qb);
			int n2 =dpfib(n-2, qb);
			 int n3=dpfib(n-3, qb);
			int sum= n1+n2+n3;
			 qb[n]=sum;
			
			return sum;
			
			
			
		}
		
	
	

}
