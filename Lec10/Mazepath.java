package Lec10;

import java.util.ArrayList;

public class Mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mazepath(0,0,3,3));

	}
	public static ArrayList<String> mazepath(int cr, int cc, int er, int ec){
		if (cr==er&&cc==ec) {
			
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		if(cc<=ec) {
		ArrayList<String> rrH=mazepath(cr,cc+1,er,ec);
		for(String val : rrH) {
			
			mr.add("H" + val);
		}
		}
		if(cr<=er) {
			ArrayList<String> rrV = mazepath(cr+1, cc, er, ec);
			for(String val : rrV) {
				mr.add("V" + val);
				
			}
		}
		if(cr<=er&&cc<=ec) {
			ArrayList<String> rrD = mazepath(cr+1,cc+1,er,ec);
			for(String val : rrD) {
				mr.add("D" + val);
			}
		}
		return mr;
	}


}
