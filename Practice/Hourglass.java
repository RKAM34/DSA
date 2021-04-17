package Practice;

import java.util.Scanner;

public class Hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//    5 4 3 2 1 0 1 2 3 4 5
       //       4 3 2 1 0 1 2 3 4
	//            3 2 1 0 1 2 3	
		//          2 1 0 1 2
		//            1 0 1
		//              0
		//            1 0 1
		//          2 1 0 1 2
		//        3 2 1 0 1 2 3
		//      4 3 2 1 0 1 2 3 4
		//    5 4 3 2 1 0 1 2 3 4 5
	Scanner scn=new Scanner(System.in);
	
		int n=scn.nextInt();
		int nsp=0;
		int nst=2*n+1;
		int row=1;
		int val=n;
		while(row<=2*n+1) {
			
			//for spaces
			int csp=0;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
				
			}
			// for stars
			int cst=1;
			while(cst<=nst) {
				System.out.print(val+" ");
			
				if(cst<=nst/2) {
					val--;
				}else {
					val++;
				}
				cst++;
			}
			val--;
			System.out.println();
			
		if(row<=(2*n-1)/2+1)	{
			nst=nst-2;
			nsp++;
			
			val--;
		}else {
			
			val++;
			nst=nst+2;
			nsp--;
			
			
			
		}
			
			row++;
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
