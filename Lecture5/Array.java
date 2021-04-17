package Lecture5;

import java.util.Scanner;

public class Array {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size ");
		int n=scn.nextInt();
		int[] ans=takeinput(n);
		display(ans);
		int m=max(ans);
          System.out.println("the largest element is    "+ m);
         System.out.println("the location of your element is"+ linearsearch(ans));
	}
	public static int[] takeinput(int n) {
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{	
			arr[i]=scn.nextInt();
		}
		return arr;
		
	}
	public static void display(int[] arr) {
		System.out.println("elements of the given array are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int max(int[] arr) {
	int i;
	int max= arr[0];
	for(i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		
		}
	}
		
		
	return max;	
		
	}
  public static int linearsearch(int[]arr)
  { System.out.println("please enter the element you want to search");
	  int item=scn.nextInt();
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]==item) {
			  return i;
			  
		  }
		  
	
	  }return -1;
  }
  public static int secondlargest(int arr[]) {
		int max=arr[0];
		int max2=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max2=max;
				
				max=arr[i];
			
			}
			if(arr[i]<max&&arr[i]>max2) {
				max2=arr[i];
			}
		}
		return max2;
		
	}
 
}
