package lect1;

import java.util.Scanner;

public class Fibbonaci {
 static	Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	
		int n= scn.nextInt();
		int a = fibbonacci(n);
		System.out.println(a+" ");
	}
	public static int fibbonacci(int n) {
		
		if(n==1) {
			return 1;
			
		}
		else if(n==0) {
			return 0;
		} 
		
		
		int temp =fibbonacci(n-1);
		int temp2=fibbonacci(n-2);
		int ans=temp+temp2;
		return ans;
	}

}
