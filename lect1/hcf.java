package lect1;

import java.util.Scanner;

public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int hcf = 0;
		int b = scn.nextInt();
		for (int i = 1; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0)
				hcf = i;
		}
		System.out.println(hcf);
	}

}
