package Practice;

import java.util.Scanner;

public class floodfill {
 static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //int n =scn.nextInt();
 //int m = scn.nextInt();
 int [][] arr=        {{0,1,0,0,0,0,0},
	                   {0,1,0,1,1,1,0},
	                   {0,0,0,0,0,0,0},
	                   {1,0,1,1,0,1,1},
	                   {1,0,1,1,0,1,1},
	                   {1,0,0,0,0,0,0}};
boolean[][] visited = new boolean[arr.length][arr[0].length];
 floodfillfunc(arr, 0, 0, "",visited);
	}
 
	public static void floodfillfunc(int [][] arr , int row , int col ,String psf, boolean visited[][]) {
		if(row<0||col<0||row==arr.length||col==arr[0].length||arr[row][col]==1||visited[row][col]==true) {
		
			return ;
		}
		if(row==arr.length-1&&col==arr[0].length-1) {
			System.out.println(psf);
			return  ;
		}
         visited[row][col]=true;
		floodfillfunc(arr, row-1, col, psf+"t",visited);
		
		
			floodfillfunc(arr, row, col-1, psf+"l",visited);
		
		
		
			floodfillfunc(arr, row+1, col, psf+"d",visited);
		
		
			
		
		floodfillfunc(arr, row, col+1, psf+"r",visited);
		
		
	}
}


