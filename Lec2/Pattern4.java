package Lec2;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int n=5;
	       int rows=1;
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
	    				  
	    				  if(cst%2==0)
	    				   {System.out.print("!");}
	    				  else {  System.out.print("*");} 
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
