package Practice;

import java.util.Scanner;

public class Oddevensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rem = 0;
		int s1 = 0;
		int s2 = 0;
		while (n != 0) {
			rem = n % 10;
			int ans = check(rem);
			if (ans == 0) {
				s1 = s1 + rem;
			
			}

			else if (ans == 1) {
				s2 = s2 + rem;
			
			}
			n = n / 10;
			
		}
		
		System.out.println("sum off even digits is" + s1);
		System.out.println("sum off odd digits is" + s2);
	}

	public static int check(int n) {

		if (n % 2 == 0) {
			return 0;
		} else
			return 1;
	}

}
