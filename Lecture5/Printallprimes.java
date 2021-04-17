package Lecture5;

import java.util.Scanner;

public class Printallprimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter lowerlimit");
		int lowerlim=scn.nextInt();
		System.out.println("enter upperlimit");
		int upperlim=scn.nextInt();
		printallprimes(lowerlim,upperlim);

	}
 
	public static void printallprimes(int lowerlim,int upperlim)
	{for(int i=lowerlim;i<=upperlim;i++) {
		boolean ans=isprime(i);
		if (ans==true) {
			
			System.out.println(i);
		}
	}
		
	
	
	
	
	}
	public static boolean isprime(int n) {
		
		int i=2;
		while(i<=n-1)
		{
			if(n%i==0) {
				return false;
			}
			i++;
		}return true;
		
	}
}
