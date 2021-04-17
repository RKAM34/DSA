package Lec8;

import java.util.Scanner;

public class Substrings_pallindrome {
 static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=scn.next();
		checksubs(str);
		//System.out.println(n);
	//boolean b=	checkpallindrome(str);
		
  //  System.out.println(checkpallindrome(str));
    
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
	public static int checksubs(String str) {
		
		int count=0;
		for(int i=0;i<str.length();i++) {
		
			for(int j=i+1;j<=str.length();j++) {

				if(checkpallindrome(str.substring(i,j))) {
					count++;

				System.out.print(str.substring(i,j)+"  ");
				}
			
	//System.out.print(str.substring(i, j)+"   ");
			}
		
		}

		
		
	//	System.out.println(count);
		return count;
	}
}
