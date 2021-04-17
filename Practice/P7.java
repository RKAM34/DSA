package Practice;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int ans=2*n-1;
		int row=1;
		int nst=1;
		int nsp=3;
		int val=1;
		while(row<=ans)
		{
		
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print("  ");
				
			}
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print( val+" ");
				 if(cst<=nst/2) {
					   val++;
				   }else {
					   val--;
				   }
			}
			 
			val++;
			System.out.println();
			
			if(row<=ans/2)
			{   nst=nst+2;
				nsp--;
				
				val++;
			}
			else {
				nst=nst-2;
				nsp++;
				val--;
			}
			row++;
			
			
			
			
			
		}
		
	}

}
