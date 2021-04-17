package Lec4;

import java.util.Scanner;

public class Funcprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		checkprime(n);

	}

	public static void checkprime(int n) {

		int i = 1;
		int fact = 0;
		while (i <= n) {
			if (n % i == 0) {
				fact++;
				
			}
			i++;
		}
		if (fact == 2) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}
}
