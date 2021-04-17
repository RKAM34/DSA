package Practice;

import java.util.Scanner;

public class Sumofoddandeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n=234567;
	        int rem=0;
	        int count =0;
	        int oddplace=0;
	        int evensum=0;
	       rem=0;
	        while(n!=0)
	        {
	            count++;
	            n=n/10;
	        }
	        
	        System.out.println(count);
	        
	        while(n!=0)
	        {
	    if(count%2==0)
	    {
	         evensum=evensum+n%10;
	    }
	    else
	    {
	        oddplace= oddplace+n%10;
	    }
	    n=n/10;
	    count--;
	    
	    }
	        System.out.println(evensum);
	        System.out.println(oddplace);
	    

	}

}
