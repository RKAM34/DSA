package lec3;

import java.util.Scanner;

public class Decimal2anybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter the base in which you want the answer ");
		int base = scn.nextInt();
		System.out.println("please enter the decimal number");

		int n = scn.nextInt();

		int ans = 0;

		int mult = 1;
		while (n > 0) {
			int rem = n % base;
			ans = ans + rem * mult;
			n = n / base;
			mult *= 10;
		}
		System.out.println("the " + base + " representation is " + ans);


	}

}
