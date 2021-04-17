package lect1;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the number you want to reverse");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		

		int rem = 0;
		int sum = 0;
		for (; n != 0; n = n / 10) {
			rem = n % 10;
			sum = sum * 10 + rem;

		}
		System.out.println(sum);

	}

}
