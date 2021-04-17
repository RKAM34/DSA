package Lec8;

import java.util.ArrayList;

public class Arraylistintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one[]= {1,2,3,5,9,12};
		int two[]= {3,4,4,5,11,12,13,19};
		System.out.println(intersection(one,two));
     
	}
	public static ArrayList<Integer> intersection(int[] one, int[] two){
		int i=0;
		int j=0;
		ArrayList<Integer> list= new ArrayList<>();
		while(i<one.length&&j<two.length) {
			
			if(one[i]<two[j]) {
			i++;}
		
		else if(one[i]>two[j]) {
			j++;
		}
		
		else {
			
			list.add(one[i]);
			i++;
			j++;
		
			
			
		}
		}

		return list;

		
		
	}

	}
