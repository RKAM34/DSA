package lect1;

import java.util.Scanner;

public class Demo {
 static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("enter the size of the array");
		int n = scn.nextInt();
		System.out.println("enter the" + n+ " elements");
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			
			arr[i]=scn.nextInt();
		}
		display(arr);
	//	System.out.println(max(arr)+ " "+ "is the largest element in the array");
	//	System.out.println(secondlargest(arr)+" "+"is the second largest element in the array");
//	System.out.println(linearsearch(arr)+" "+" is the place of your element");
		reverse(arr);
		display(arr);
	}
	public static void  display(int arr[]) {
	System.out.println("the elements in the array are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		
	}
	public static int max(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int linearsearch(int arr[]) {
		System.out.println("enter the element you want to search"); 
		int m =scn.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==m) {
				return i;
				
			}
		
			}
		return -1;
		}
	public static int[] reverse(int arr[]) {
		int low=0;
		int high=arr.length-1;
		int temp;
		while(low<high) {
			temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low=low+1;
			high=high-1;
		}
	return arr;
	}
		}


		
		
		
		
		

