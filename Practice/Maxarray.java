package Practice;

import java.util.Scanner;

public class Maxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] ans=takeinput(n,scn);
		
		max(ans);

	}
	public static int[] takeinput(int n,Scanner scn){
//		Scanner scn=new Scanner(System.in);
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();

		}
		return arr;
	}
		public static int max(int[] arr) {
	int i;
	int m= arr[0];
	for(i=1;i<arr.length;i++) {
		if(arr[i]>m) {
			m=arr[i];
		
		}
	}	
	System.out.println(m);
	return m;	
		
	}
}
