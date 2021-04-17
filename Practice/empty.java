package Practice;

import java.util.Scanner;

public class empty {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = scn.nextLine();
		
printperm(str, "");
	}

	public static void printperm(String ques , String asf ) {
		if(ques.length()==0) {
			System.out.println(asf);
			return;
			
		}
		for(int i=0;i<ques.length();i++) {
			char ch = ques.charAt(i);
			String leftpart= ques.substring(0, i);
			String rightbpart=ques.substring(i+1);
			String ros = leftpart +rightbpart;
			
			
			printperm(ros, asf+ch);
		}
		
		
		
	}
}
