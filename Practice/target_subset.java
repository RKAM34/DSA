package Practice;

import java.util.Scanner;

public class target_subset {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n = scn.nextInt();
     int [] arr= new int[n];
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=scn.nextInt();
     }
     int target = scn.nextInt();
 sumofsubset(arr, 0, "", 0, target);
 
	}
	
	
	
	
	public static void sumofsubset(int [] arr , int idx, String set , int sos, int target) {
		if(idx==arr.length) {
			if(sos==target) {
				System.out.print(set+",");
				
			}
			return;
			
		}
		sumofsubset(arr, idx+1, set+arr[idx]+",", sos+arr[idx], target);
		sumofsubset(arr, idx+1, set, sos, target);
	}

}
