package lec6;

import java.util.Scanner;

public class Array1 {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //binary search
		//Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
//		int arr[]=new int[m];
	    int[]arr= takeinput(m);
		int item=scn.nextInt();
		System.out.println(binarysearch(arr,item));
		
	}
	public static int[] takeinput(int n) {
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{		
			arr[i]=scn.nextInt();
		}
		return arr;
		
	}
	
	public static int binarysearch(int arr[], int item)
	{ 
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
		int mid=(low+high)/2;
		
		if(item>arr[mid]) {
		low=mid+1;
		} else if(item<arr[mid]){
			high=mid-1;
		}else {
			return mid;
		}
		}
		return -1;
	}
	

}
