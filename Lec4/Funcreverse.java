package Lec4;

import java.util.Scanner;

public class Funcreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		reverse(n);

	}
 public static void reverse(int n) {
	 
	 

		int rem = 0;
		int sum = 0;
		for (; n != 0; n = n / 10) {
			rem = n % 10;
			sum = sum * 10 + rem;

		}
		System.out.println(sum);

 }
}
