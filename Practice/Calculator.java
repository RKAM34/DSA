package Practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation();
	
	
	}
	public static void operation( ) {
	Scanner scn=new Scanner(System.in);
		
		 char operator=scn.next().charAt(0);
		 if(operator=='X'||operator=='x') {
			 System.exit(0);
			 
		 }else {
			 check(operator);
		
		 }
		 
	}
	public static void check(char operator) {
		Scanner scn=new Scanner(System.in);
		if(operator!='/'&&operator!='*'&&operator!='+'&&operator!='-') {
			System.out.println("Invalid operation. Try again.");
			operation();
			
		}
		int a=scn.nextInt();
		int b=scn.nextInt();
		
		if(operator=='/') {
			divide( a,b);
		} else if(operator=='*') {
			multiply(a,b);
		} else if(operator=='+') {
			add(a,b);
		}else if(operator=='-') {
			subtract(a,b);
		}
		operation();
		
		
	}
	public static int add(int a,int b) {
		int sum=0;
		sum=a+b;
		System.out.println(sum);
		return sum;
	 	
	}
	public static int subtract(int a,int b) {
		int diff=0;
		diff=a-b;
		System.out.println(diff);
		return diff;
	}
	public static int multiply(int a,int b) {
		int prod=0;
		prod=a*b;
		System.out.println(prod);
		return prod;
	}
	public static int divide(int a,int b) {
		int div=0;
		div=a/b;
		System.out.println(div);
		return div;
	}

}
