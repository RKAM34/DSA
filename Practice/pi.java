package Practice;

import java.util.Scanner;

public class A extends B {
 static    Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    this.();
		Scanner scn=new Scanner(System.in);
  //  int [] arr= {2,3,4,5,6,7};
    System.out.println("please enter the size of an array");
    int size=scn.nextInt();
    int []inputArray=new int[size];
	  
	  for(int i=0;i<inputArray.length;i++) {
		  inputArray[i]=scn.nextInt();
	  }
	  
      int p=scn.nextInt();
    
    System.out.println(binarySearch(inputArray,0,inputArray.length,p));
	}
  public static int binarySearch(int[] arr, int left ,int right,int p) {
	  
	  if(right>1) {
		
		  int mid=left+(right+1)/2;
		  
		  
		  if(arr[mid]==p) {
			  return mid;
		  }
		  if(arr[mid]>p) {
			  return binarySearch(arr,mid+1,right,p);
		  }
	  }
	 
		 	  
	//  binarysearch(arr,mid+1,right,p);
	  return -1;
	 
  }
  public static int binarysearch() {
	  
	  
	  
	  
  }
  public static int[] input (int size) {
	  
	  int []inputArray=new int[size];
	  
	  for(int i=0;i<inputArray.length;i++) {
		  inputArray[i]=scn.nextInt();
	  }
	  
	  return inputArray;
  }
}
