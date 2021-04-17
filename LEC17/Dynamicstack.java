package LEC17;

import LEC16.Stack;

public class Dynamicstack extends Stack  {
	
 @Override
 public void push(int item) throws Exception{
	 
	 if(isfull()) {
		 
		 
		 int[] n = new int[2*data.length];
		 
		 for(int i=0;i<data.length;i++) {
			 
			 
			 n[i]=data[i];
			 
			 
		 }
		 data=n;
		 
		 
		 
	 }
	 
	 super.push(item);
	 
 }
 

		
	
	
	
	
}
