package Practice;

import java.util.Scanner;

public class Spiralclockwise {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]ans = input(n ,m);
        spiraldisp(ans);
    }
    public static int [][] input(int n ,int m)
    {
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]= scn.nextInt();
            }
        }
        return arr;
    }
    public static void spiraldisp(int[][] arr) {
        int minrow = 0;
        int maxrow = arr.length - 1;
        int mincol = 0;
        int maxcol = arr[0].length - 1;
        int count = 0;
        int total = arr.length * arr[0].length;
        while(count<total)
        {
            for(int col= mincol;col<=maxcol&&count<total;col++)//loop1
            {
                System.out.print(arr[minrow][col]+", ");
                count++;
            }
            minrow++;
            for(int row= minrow;row<=maxrow&&count<total;row++)//loop2
            {
                System.out.print(arr[row][maxcol]+", ");
                count++;
            }
            maxcol--;
            for(int col=maxcol;col>=mincol&&count<total;col--)//loop3
            {
                System.out.print(arr[maxrow][col]+", ");
                count++;
            }
            maxrow--;
            for (int row= maxrow; row>=minrow&&count<total;row-- )
            {
                System.out.print(arr[row][mincol]+", ");
                count++;
            }.
            mincol++;
            
        }
        System.out.print("END");
    }


	}


