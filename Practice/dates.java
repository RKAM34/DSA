package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dates {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String c;
    c=br.readLine();
    String [] temp=c.split(" ");
    System.out.println(temp[0]+" "+temp[1]);
System.out.println( checkdates(temp[0], temp[1]));

	}
	
	public static char checkdates(String d1 , String d2) {
		
		String []arr1=d1.split("/");
		String []arr2=d2.split("/");
		
	 for(int i =arr1.length-1;i>=0;i--) {
		 if(Integer.parseInt(arr1[i])<Integer.parseInt(arr2[i])) {
			 
			return 'E';
			 
		 } else if(Integer.parseInt(arr1[i])>Integer.parseInt(arr2[i])) {
			 return 'L';
		 }
		
		 
		 
	 }
		
           return 'S';
		
		
	}

}
