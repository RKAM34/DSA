package Lec15;

import java.util.Scanner;

public class Sumofseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//n.x^n + n+1.x^n-1 . . . .... .  .. . .. n.x^1
      Scanner scn  = new Scanner(System.in);
      int n = scn.nextInt();
      int x = scn.nextInt();
  
      int mult=x ;
      int sum = 0;
      for(int i=n;i>=1;i--) {
    	  sum = sum + i*mult ;
    	  mult= x* mult ;
    	  
    	  
    	  
      }
      System.out.println(sum);
	}

}
