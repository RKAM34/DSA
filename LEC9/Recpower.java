package LEC9;

import java.util.Scanner;


public class Recpower {
	 static Scanner scn=new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=scn.nextInt();
		int b=scn.nextInt();
    int n=     power(a,b);
    System.out.println(n);
	}
public static int power( int a,int  b) {
	if(b==0) {
		return 1;
	}
	
	
	
   int temp=power(a,b-1);
	temp=temp*a;
	
	
	
	return temp;
}
}
