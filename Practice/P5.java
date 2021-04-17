package Practice;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner scn=new Scanner(System.in);
				int n=scn.nextInt();
				int nr=2*n-1;
				int row=1;
				int nst=1;
				while(row<=nr)
				{int cst=1;
					while(cst<=nst) {
						System.out.print("* ");
						cst++;
						
					}
		
					System.out.println(" ");
					if(row<=nr/2) {
					nst++;	
					}
					else {
						nst--;
					}
					
					row++;
				}
					
	}

}
