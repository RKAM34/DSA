package Practice;

import java.util.Scanner;

public class Revisingquadeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = (int)(Math.pow(b,2) - 4 * a *c);
        int root1 = (int)((-b - Math.sqrt(d)) / 2 * a);
        int root2 = (int)((-b + Math.sqrt(d)) / 2 * a);;
        if(d>0)
        {
            System.out.println("Real and Distinct");
            System.out.println(root1 +" " +root2);
        }
        else if(d == 0)
        {
            System.out.println("Real and Equal"); 
            System.out.println(root1 +" " +root2);        
        }
        else
        {
            System.out.println("Imaginary");
           
        }


	}

}
