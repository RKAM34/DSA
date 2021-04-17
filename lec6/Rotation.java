package lec6;

import java.util.Arrays;
import java.util.Scanner;

public class Rotation {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=scn.nextInt();
		while(t-->0) {
			int n=scn.nextInt();
			int [] arr=new int[n];
		
			
			int r = scn.nextInt();
			takeinput(arr,n);
			rotate(arr, r+1);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}

		}
//	int n=scn.nextInt();
	//	int arr[]=new int[n];
	//	int arr[]= {1,2,3,4,5};
//rotate(arr,3);
//for(int i=0;i<arr.length;i++) {
	//System.out.print(arr[i]+" ");
}

	

public static void reverse(int[] arr) {
	int lo=0;
	int hi=arr.length-1;
	
	int temp=0;
	while(lo<hi) {
		//swap
		temp=arr[lo];
		arr[lo]=arr[hi];
		arr[hi]=temp;
		
		lo=lo+1;
		hi=hi+-1;
		
		
		
		
		
	}

}
public static int[] takeinput(int[]arr,int n) {
//	int [] arr=new int[n];
	
	for(int i=0;i<n;i++)
	{	
		arr[i]=scn.nextInt();
	}
	return arr;
	
}
public static void reverse(int[] arr,int i,int j) {
	
	
	
	int low=i;
	int high=j;
	
	int temp=0;
	while(low<high) {
		//swap
		temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		
		low=low+1;
		high=high-1;
		
		
		
		
		
	}
}
public static void rotate(int[]arr,int r)
{
	
	r=r%arr.length;
	
	
	
	int length=arr.length;
	int i=length-r;
	
	reverse(arr,0,i-1);
	reverse(arr,i,arr.length-1);
	reverse(arr);
	
	}
}
