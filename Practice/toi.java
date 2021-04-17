package Practice;

import java.util.Scanner;

public class toi {
	 static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str= scn.next();
		checkpalsub(str);
	}
	
	
	public static boolean checkpall(String str) {
		int lo=0;
		int hi=str.length()-1;
		while(lo<=hi) {
			
			if(str.charAt(lo)==str.charAt(hi)) {
				lo++;
				hi--;
				
				
			}
			else 
				return false;
			
			
		}
		return true;
		
	}

	public static int  checkpalsub(String str) {
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<=str.length();j++) {
				
				if(checkpall(str.substring(i, j))) {
					count++;
					System.out.println(str.substring(i, j));
				}
			}
			
		}
		return count;
		
	}
}
