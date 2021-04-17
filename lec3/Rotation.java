package lec3;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter a number");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		System.out.println("enter number of rotations");
		int rot=scn.nextInt();
		int temp=num;
		int count=0;
		//for large no
		
	//for negative inputs
		if(rot<0) {
			rot+=count;
		}
		
	//counter
		while(num>0)
		{
			count++;
			num=num/10;
		}
		int ans=0;
		//for reversing
		for(int i=1;i<=rot;i++)
		{
			int rem=temp%10;
			temp=temp/10;
			ans=rem*(int)Math.pow(10,count-1 )+temp;
			temp=ans;
		}
		System.out.println(temp);
		
		
         
        		
         
         
         
	}

}
