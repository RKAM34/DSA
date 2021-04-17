package Practice;

//import java.util.ArrayList;
import java.util.Scanner;

public class A {
static 	Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		//System.out.println("enter a string to check wether its a pallindrome or not");
		String str=scn.next();
	//	boolean n=checkpallindrome(str);
		//if(n==true) {
			//System.out.println("given string is a pallindrome");
		//}
		//else {
			//System.out.println("the given string is not a pallindrome");
		//}
		
		checksubs(str);
	}
	
	public static boolean checkpallindrome( String str) {
		
		int lo=0;
		int hi=str.length()-1;
		
		while(lo<=hi) {
		if(str.charAt(lo)==str.charAt(hi)) {
         lo++;
         hi--;
		}
		else {
			return false;
		}
		}
		return true;
		
			
		}
	
	public static int checksubs( String str) {
		
		int count = 0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				
			if(checkpallindrome(str.substring(i, j))) {
				count++;
				System.out.print(str.substring(i, j)+" ");
			}
				
			}
		}
		return count;

		
		
		
		
	}
}

