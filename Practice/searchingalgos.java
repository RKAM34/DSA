package Practice;

import java.util.Scanner;

import lec6.Selectionsort;

public class searchingalgos {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int [] arr = {10 ,20,30,40,50 ,90 ,80,70,60};
		//bubblesort(arr);
	insertionsort(arr);
		display(arr);
		
		//System.out.println(binarysearch(arr));
	}
	public static int linearsearch( int arr[] ) {
		System.out.println("please enter the item you want to search");
		
		int item=scn.nextInt();
		for(int i=0;i<arr.length;i++) {
		if(	arr[i]==item) {
			return i+1 ;
		}
		}
		return -1;
		
	}
	public static int binarysearch( int arr[]) {
		System.out.println("please enter the item you want to search");
		int item = scn.nextInt();
		int lo = 0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(item>arr[mid]) {
				lo=mid+1;
			}
			else if(item<arr[mid]) {
				hi=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void bubblesort(int arr[]) {
		for(int counter=0;counter<=arr.length-1;counter++) {
			for(int j=0;j<arr.length-1-counter;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void display(int[] arr) {
		System.out.println("elements of the given array are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
 public static void selectionsort( int arr[]) {
	 for(int counter=0;counter<arr.length-1;counter++) {
		 int min = counter;
		 for(int j=counter+1;j<=arr.length-1;j++) {
			 if(arr[j]<arr[min]) {
				 min=j;
			 }
			 int temp = arr[min];
			 arr[min]=arr[counter];
			 arr[counter]= temp;
			 
		 }
	 }
 }
 public static void insertionsort( int arr[]) {
	 for(int counter=1;counter<=arr.length-1;counter++) {
		 int val=arr[counter];
		 int j = counter-1;
		 while(j>=0&&arr[j]>val) {
			 arr[j+1]=arr[j];
			 j--;
		 }
		 arr[j+1]=val;
		 
	 }
 }
}
