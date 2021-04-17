package lec3;

import java.util.Scanner;

public class Anybase2dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter the base ");
		int base = scn.nextInt();
		System.out.println("please enter the number");

		int n = scn.nextInt();

		int ans = 0;

		int mult = 1;
		while (n > 0) {
			int rem = n % 10;
			ans = ans + rem * mult;
			n = n / 10;
			mult *= base;
		}
		System.out.println("the decimal representation is " + ans);

	}

}
