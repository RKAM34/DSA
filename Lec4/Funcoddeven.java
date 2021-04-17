package Lec4;

import java.util.Scanner;

public class Funcoddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner scn=new Scanner(System.in);
	
		int n =scn.nextInt();
		oddeven(n);
	}
 public static void oddeven(int n) {
	 
		if(n%2==0)
        { System.out.println("the input is a even number");}

else 
	System.out.println("the input is odd");
 }
}
