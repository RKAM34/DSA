package lec3;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int ans=0;
		
		int mult=1;
		while(n>0) {
			int rem=n%2;
			ans=ans+rem*mult;
			n=n/2;
			mult*=10;
		}
		System.out.println(ans);

	}

}
