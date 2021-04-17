package Lecture5;

import java.util.Scanner;

public class Armstrongnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter lowerlimit");
		int lowerlim=scn.nextInt();
		System.out.println("enter upperlimit");
		int upperlim=scn.nextInt();
		printarmstrong(lowerlim,upperlim);

	}
public static void printarmstrong(int lowerlim,int upperlim)
{
	
	for(int i=lowerlim;i<=upperlim;i++) {
		
		boolean ans=isarmstrong(i);
		if(ans==true){
			System.out.println(i);
			
		}
		
		
	}

}


public static boolean isarmstrong(int n)
{ int temp=n;
 int sum=0;
int count=0;	
int rem=0;
while(n>0)
{ 
  n=n/10;
  count++;
	}
n=temp;
while(n>0)
{
	rem=n%10;
	sum=sum+(int)Math.pow( rem,count );
n=n/10;

}


if(sum==temp)
	{return true;
	}
else {
	return false;
}


}
}
