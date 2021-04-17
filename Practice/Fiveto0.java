package Practice;

import java.util.Scanner;

public class Fiveto0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
        long n=scn.nextLong();
        long ans=0;
        long mult=1;
        scn.close();
        if (n==0)
        {
        	ans=5;
        }
        else {
        while(n>0) {
            long rem=(int)(n%10);
            if(rem==0)
            {
                rem=5;
            }
            ans= rem*mult+ans;
            mult=mult*10;
            n=n/10;
        }
        }
        System.out.println(ans);
        
	}

}
