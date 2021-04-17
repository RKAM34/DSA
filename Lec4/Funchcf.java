package Lec4;

import java.util.Scanner;

public class Funchcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		hcf(a,b);
	}

	
	public static void hcf(int a,int b) {
		
		int hcf = 0;
	
		for (int i = 1; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0)
				hcf = i;
		}
		System.out.println(hcf);
	}
}
