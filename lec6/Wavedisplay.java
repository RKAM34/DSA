package lec6;

import java.util.Scanner;

public class Wavedisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr=input();
		//int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		display(arr);
		
	}
	public static void display(int arr[][]) {
			for(int j=0;j<arr[0].length;j++) {
				if(j%2==0) 
				{for(int i=0;i<arr.length;i++)
			
				 
					System.out.print(arr[i][j]+"  ");
				}
				else {
					 for(int i=arr.length-1;i>=0;i--)
						 System.out.print(arr[i][j]+"  ");
			}
			}

		
	}
	public static int[][] input() {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("enter no of rows and columns");
		int rows=scn.nextInt();
		int cols=scn.nextInt();
		int [][] arr=new int[rows][cols];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			{  System.out.println("enter the elements for row"+i+"columns"+j+".");
		
			
				arr[i][j]=scn.nextInt();
			}
		}

		return arr;
}

}
