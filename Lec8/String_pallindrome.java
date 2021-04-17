package Lec8;

import java.util.Scanner;

public class String_pallindrome {
	
	static Scanner scn=new Scanner(System.in);

	public static void main(String[] args) {
      String str = scn.next();  
	
	boolean n=	checkpallindrome( str );
    
	if(n==true) {
        
		System.out.println("true");
        
	}
        else {
    
        	System.out.println("false");
        
        }
	}
  
	public static boolean checkpallindrome(String str) {
	
	int lo=0;
	
	int high=str.length()-1;
	
	while(lo<=high) {
		
		if(str.charAt(lo)==str.charAt(high)) {
		
	   		lo++;
			
			high--;
		}
		
		else
		
			return false;
		
	 }
	
	return true;

 }

   }
  
