package Practice;

import java.util.Scanner;

public class Fibbpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn=new Scanner(System.in);
	    int n=scn.nextInt();
		int n1=0;
		int n2=1;
		int sum=0;
		int row=1;
   
    		
    		for(int i = 1; i<=n;i++)
    		{ 	int j=1;			
    			while(j<= i){
    			System.out.print(n1+" ");
    			sum=n1+n2;
    			n1=n2;
    			n2=sum;
    			j++;
                }
                System.out.println();
    		}
	}

}
