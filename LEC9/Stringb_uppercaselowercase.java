package LEC9;

import java.util.Scanner;

public class Stringb_uppercaselowercase {
     static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str=	togglecase();
	
          System.out.println(str);
          
           
	}
	public static String togglecase() {
		
		
		

        String str=scn.next();
       
        StringBuilder sb=new StringBuilder(str);
       for(int i=0;i<str.length();i++) {
    	   
    	   char ch=sb.charAt(i);
    	   if(Character.isUpperCase(ch)) {
    		   
    		   char temp =Character.toLowerCase(ch);
    		   sb.setCharAt(i, temp);
    	   }
    	   else if(Character.isLowerCase(ch))
    	   {
    		   
    		   char temp=Character.toUpperCase(ch);
    		   sb.setCharAt(i, temp);
    		   
    	   }
       }
        

	
	
	return sb.toString();
	}

}
