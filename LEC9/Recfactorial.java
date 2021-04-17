package LEC9;

import java.util.Scanner;

public class Recfactorial {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=scn.nextInt();
    int a= fact(n);
    System.out.println(a);
	}
	public static int fact(int n) {
		
		if(n==1) {
			return 1;
		}
		
		
		int temp=fact(n-1);
		temp=temp*n;
		
		
		
		
		return temp;
	}
	
	public static int factoriall(int n) {
		if(n==1) {
			return 1;
		}
		
		
		int temp=factoriall(n-1);
		temp=temp*n;
		return temp;
	}

}
