package Lec7;

import java.util.Scanner;

public class Array2d {

	private static Scanner scn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=takeinput();
		
		display(arr);

	}
public static int[][] takeinput(){
scn = new Scanner(System.in);
System.out.println("enter no of rows");
int rows=scn.nextInt();
int[][]arr=new int[rows][];
for(int r=0;r<arr.length;r++)
{System.out.println("enter column for"+r+"rows");
int cols=scn.nextInt();
arr[r]=new int[cols];
for(int c=0;c<cols;c++)
{System.out.println("enter value for"+r+"-"+c+".");
arr[r][c]=scn.nextInt();

	}
	}
return arr;
}
public static void display(int arr[][]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();

	}
}
}
