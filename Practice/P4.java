package Practice;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nsp=n-1;
		int nst=1;
		
		int row=1;
		while(row<=n)
		{ int csp=1;
		  while(csp<=nsp)
		  {
			  System.out.print("  ");
			  csp++;
		  }
			int cst=1;
			while(cst<=nst)
			{
				System.out.print(" *");
				cst++;
			}
			
			
			
			
	
			//row updation
			System.out.println();
			row++;
			nsp--;
			nst++;
		}

	}

}
