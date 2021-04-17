package LEC9;

import java.util.Scanner;

public class Recfibb {
 static Scanner  scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=scn.nextInt();
  System.out.println(fibbonacci(n)+" ");
  
	}
	public static int fibbonacci(int n) {
		if(n==1||n==0){
			return n;
		}
		
		int temp=fibbonacci(n-1);
		int temp1=fibbonacci(n-2);
		
		
		
		return temp +temp1;
	}

}
