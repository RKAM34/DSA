package Lec4;

import java.util.Scanner;

public class Funcfibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		fibbonaci(n);

	}
	public static void fibbonaci(int n) {
		
		
		int n1=0;
		int n2=1;
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
	}
	}
}
