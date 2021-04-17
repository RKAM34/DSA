package Practice;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 int a=scn.nextInt();
		 int b =scn.nextInt(); 
	        System.out.println( lcm(a, b)); 

	}
	  static int gcd(int a, int b) 
	    { 
	    if (a == 0) 
	        return b;  
	    return gcd(b % a, a);  
	    } 
	      
	    // method to return LCM of two numbers 
	    static int lcm(int a, int b) 
	    { 
	        return (a*b)/gcd(a, b); 
	    } 
	      
}
