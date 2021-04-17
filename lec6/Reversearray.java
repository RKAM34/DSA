package lec6;

import java.util.Scanner;
     
public class Reversearray {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size ");
	//	Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		  int[]arr= takeinput(n);
	
      reverse(arr);
		  for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
        
        	}

		
			
	
	public static int[] takeinput(int n) {
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{	
			arr[i]=scn.nextInt();
		}
		return arr;
		
	}
            public static int[] reverse(int[] arr) {
	int low=0;
	int high=arr.length-1;
	
	int temp=0;
	while(low<high) {
		//swap
		temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		
		low=low+1;
		high=high-1;
		
		
			
	}
	return  arr;
}
}
