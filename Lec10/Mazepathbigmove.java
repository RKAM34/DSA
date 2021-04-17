package Lec10;

import java.util.ArrayList;

public class Mazepathbigmove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mazepath1(0,0,2,2));

	}
  public static ArrayList<String> mazepath1(int cr, int cc, int er, int ec )
  {
	  
	if (cr==er&&cc==ec) {
			
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
	ArrayList<String> mr = new ArrayList<>();
	for(int i=1;i<=er||i<=ec;i++) {
	
		if(cc<=ec) {
		ArrayList<String> rrH=mazepath1(cr,cc+i,er,ec);
		for(String val : rrH) {
			
			mr.add("H" + i + val);
		}
		}
		if(cr<=er) {
			ArrayList<String> rrV = mazepath1(cr+i, cc, er, ec);
			for(String val : rrV) {
				mr.add("V" + i + val);
				
			}
		}
		if(cr<=er&&cc<=ec) {
			ArrayList<String> rrD = mazepath1(cr+i,cc+i,er,ec);
			for(String val : rrD) {
				mr.add("D" + i + val);
			}
		} 	
	
		//return mr;
	}
	
	return mr;
	}

	  
	  
	  
  
}

