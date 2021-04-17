package Practice;

import java.util.Scanner;

public class tssp {
static Scanner scn= new Scanner(System.in);
static int count=0;
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int n =scn.nextInt();
		int arr[]=new int[ n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
			
		}
	
	int tsub=(int)Math.pow(2, n);
		
		int target=scn.nextInt();   
   int c=targetsum(arr, 0, 0, "", target);
   System.out.println(c);
   
   double ans=(double)c/(double)tsub;
System.out.println(ans);
	}
	
	
	
	public static int targetsum( int arr[], int idx , int sos , String set, int target) {
	
		
		if(idx==arr.length) {
			
		if(sos==target) {
			//System.out.println(set+" "+"----------"+count);
			count++;
		}
            		
			return count;
			
		}
		
		targetsum(arr, idx+1, sos+arr[idx], set+arr[idx], target);
		targetsum(arr, idx+1, sos, set, target);
	
return count;
	}
	

}
