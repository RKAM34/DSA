package Lec15;

import java.util.Scanner;

public class Countpallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//complexity is reduced from n^4 to n^2
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		int res =0;
		for(int i=0 ; i<str.length();i++) 
		{
			
			int counter1=grow(str,i ,i);
			int counter2=grow(str,i,i+1);
			res+= counter1 + counter2;
		}
		System.out.println(res);

	}
	
	public static int grow( String str , int si , int ei) {
		int count = 0;
		while(si>=0&&ei<str.length()&&str.charAt(si)==str.charAt(ei)) {
			
			
			count++;
			si--;
			ei++;
			
			
		}
		return count;
		
	
		
	}
}
