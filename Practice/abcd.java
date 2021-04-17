package Practice;

import java.util.Scanner;

public class abcd {
	
	static Scanner scn = new Scanner(System.in);
	public static boolean check(long n) {
		
		return n!=0&&(n&(n-1))==0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	Scanner scn = new Scanner(System.in);
	long n =scn.nextLong();
		long [] arr = new long[(int) n];
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = scn.nextLong();
			
		}
		
		long count=0; long count =0;
		long sum=0;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				sum++;
			}
		if(check(arr[i])) {
			count++;
			sum+=arr[i];
		}
		
	

	}
		System.out.println(count);
		System.out.println(sum);
	}
	
	
	
}
