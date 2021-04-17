package Lec8;

import java.util.ArrayList;

public class Arraylistadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one[]= {9,9,9,9};
		int two[]= {9,9};
		System.out.println(add(one,two));

	}
	public static ArrayList<Integer> add(int[] one, int[] two){
	int carry=0;
		int i=one.length-1;
		int j=two.length-1;
		ArrayList<Integer> list= new ArrayList<>();
		
		while(i>=0||j>=0) {
			
			int sum=carry;
			if(i>=0) {
				sum=sum+one[i];
			}
			if(j>=0) {
				sum=sum+one[j];
			}
			int rem=sum%10;
			carry=sum/10;
			list.add(0,rem);
			i--;
			j--;
			
			
		}

			
		
		if(carry>0) {
		list.add(0,carry);
		}
		
		
		
		
		
		return list;
		
	}
}
