package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class rec { 
 static Scanner scn = new Scanner(System.in);
	
 public static void main(String[] args) {
	 System.out.println(mazepath(0, 0, 3, 3));
	 
 }

public static ArrayList<String> mazepath(int sr, int sc , int dr, int dc){
	
	if(sr==dr&&sc==dc) {
		ArrayList<String> br = new ArrayList<>();
		br.add(" ");
		return br;
		
	}
	
	ArrayList<String> mazeresult =new ArrayList<>();
	if(sc<=dc) {
		
		
		
	ArrayList<String> rrh = mazepath(sr, sc+1, dr, dc);
	
	for(String i : rrh) {
		
		mazeresult.add("H"+i);
		
	}
	
	
	}
	if(sr<=dr) {
	ArrayList<String> rrv=mazepath(sr+1, sc, dr, dc);
	
	
	for(String i: rrv) {
		mazeresult.add("V"+i);
	}
	
	}
	if(sc<=dc&&sr<=dr) {
	ArrayList<String> rrd=mazepath(sr+1, sc+1, dr, dc);
	for(String i : rrd) {
		mazeresult.add("D"+i);
	}
	
	}
	return mazeresult;
} 

}
