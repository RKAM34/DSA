package Lec2;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int n=9;
	       int rows=0;
	       int nst=1;
	       
	       int nsp=n-1;
	       
	       while(rows<=n) {
	    	   int csp=1;
	    	   while(csp<=nsp) {
	    		   
	    		   System.out.print(" ");
	    		   csp++;
	    	   }
	    	            int cst=1;
	    			   while(cst<=nst) {
	    				   System.out.print(rows);
	    				   cst++;
	    			   }
	    			   //updation
	    			   System.out.println();
	    			   nst+=2;
	    			   nsp--;
	    			   rows++;
	       }
	     

	}

}
