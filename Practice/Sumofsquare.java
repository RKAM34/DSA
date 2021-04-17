package Practice;

import java.util.Scanner;

public class Sumofsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int rem=0;
       int sum=0;
       
       while(n!=0) {
    	   rem=n%10;
    	  int ans= square(rem);
    	   sum=sum+ans;
    	   n=n/10;
       }
       
       System.out.println("the square of individual digits are"+sum);
	}
public static int square(int n) {
	
	n=n*n;
	
	return n;
}
}
