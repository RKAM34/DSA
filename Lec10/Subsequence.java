package Lec10;

import java.util.ArrayList;

 class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   String str="abc";	
   System.out.println(subseq(str));
       
	}
	public static ArrayList<String> subseq(String str){
		
		if(str.length()==0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
	char ch=str.charAt(0);
	String ros=str.substring(1);
	ArrayList<String> rr= subseq(ros);
	ArrayList<String> mr= new  ArrayList<>();
	for(String val : rr) {
		mr.add(val);
		mr.add(ch+val);
		// mr.add(val+(int)ch);
	}
		return mr;
		
		
		
		
	}
	
	

}
