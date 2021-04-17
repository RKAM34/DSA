package Practice;

import java.util.Scanner;

public class Triangleval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scn=new Scanner(System.in);
		  int n=scn.nextInt();
	       int rows=1;
	       int nst=1;
	       
	       int nsp=n-1;
	       int val=1;
	    
	       while(rows<=n) {
	    	   
	    	   int csp=1;
	    	   while(csp<=nsp) {
	    		   
	    		   System.out.print("  ");
	    		   csp++;
	    	   }
	    	            int cst=1;
	    			   while(cst<=nst) {
	    				   System.out.print(val+" ");
	    				   if(cst<=nst/2) {
	    					   val++;
	    				   }else {
	    					   val--;
	    				   }
	    					   
	    				   
	    				   cst++;
	    				   
	    			   }
	    			   //updation
	    			  val++;
	    			   System.out.println();
	    			 
	    			   nst+=2;
	    			   nsp--;
	    			   rows++;
	    			   val++;
	       }
	     
	}

}
