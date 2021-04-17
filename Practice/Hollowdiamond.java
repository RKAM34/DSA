package Practice;

import java.util.Scanner;

public class Hollowdiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = n/2+1;
		int nsp = -1;

		while (row <= n) {

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*"+"\t");
				cst++;
			}
			int csp = 1;
			while (csp <= nsp) {

				System.out.print(" "+"\t");
				csp++;
			}

			cst = 1;
			if (row == 1 || row == n)
				cst++;
			while (cst <= nst) {
				System.out.print("*"+"\t");
				cst++;
			}

			if (row <= n /2) {
				nst--;
				nsp += 2;

			} else {

				nst++;
				nsp -= 2;
			}

			row++;
			System.out.println();
		}

		
}
}