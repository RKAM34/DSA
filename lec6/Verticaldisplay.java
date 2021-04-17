package lec6;

import java.util.Scanner;

public class Verticaldisplay {

	 static Scanner scn;
	public static void main(String[] args) {
		int[][] arr= input();
		//int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		display(arr);
		// TODO Auto-generated method stub

	}
	public static void display(int arr[][]) {
		
			for(int j=0;j<arr[0].length;j++)
			{
				for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i][j]+" ");
			}
			

		}
	}
	public static int[][] input() {
		scn = new Scanner(System.in);
		
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