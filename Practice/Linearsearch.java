package Practice;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] ans=takeinput(n);
		   System.out.println( linearsearch(ans));
		
	}
	public static int[] takeinput(int n){
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();

		}
		return arr;
	}
	 public static int linearsearch(int[]arr)
	  { 
	  Scanner scn=new Scanner(System.in);
		  int item=scn.nextInt();
		  for(int i=0;i<arr.length;i++)
		  {
			  if(arr[i]==item) {
				  return i;
				  
			  }
			  
		
		  }return -1;
	  }

}
