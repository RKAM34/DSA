package Practice;

import java.util.Scanner;

public class Patternrhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
       //int n = 5;
       int rows = 2*n-1;
       int nst = 1;
       int nsp = 2*n;
       while (rows <= n) {
           int csp = 1;
           while (csp <= nsp) {
               System.out.print(" ");
               csp++;
           }
           int cst = 1;
           while (cst <= nst) {
               System.out.print("*");
               cst++;
           }
           System.out.println();
           if (rows <= n/2) {
               nsp--;
               nst += 2;
       
           } else {
               nsp++;
               nst -= 2;
           }
           rows++;

       }
	}

}
