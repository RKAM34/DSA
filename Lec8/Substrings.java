package Lec8;

public class Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("nitin");
		checksubs(str);

	}
	public static void checksubs(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				
				
				System.out.println(str.substring(i, j));
			}
		}
		
	}

}
