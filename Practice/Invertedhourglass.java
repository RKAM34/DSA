package Practice;

import java.util.Scanner;

public class Invertedhourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn=new Scanner(System.in);
       
       int n = 5;
       int rows = 1;
       int nst = 1;
       int nsp = 2 * n - 1;
       while (rows <= 2 * n + 1) {
           int val;
           int cst;
           cst = 1;
           val = n;
           while (cst <= nst) {
               System.out.print(val+" ");
               val--;
               cst++;
           }
           int csp = 1;
           while (csp <= nsp) {
               System.out.print("  ");
               csp++;
           }
           if (rows == n + 1) {
               cst = 2;
           } else {
               cst = 1;
           }
           
           if (rows == n + 1)
               val = 1;
           else
               val++;
           while (cst <= nst) {
               System.out.print(val+" ");
               val++;
               cst++;
           }
           System.out.println();
           if (rows < n + 1) {
               nst++;
               nsp -= 2;
           }
           else {
               nst--;
               nsp += 2;
           }
           rows++;
       }
   }

	

}
