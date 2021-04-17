package lec3;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 int n=3124;
                 int pos=1;
                
                 int ans=0;
                 while(n>0)
                 {
                	 
                	 int rem=n%10;
                	 ans=ans+pos*(int)Math.pow(10, rem-1);
                	 n=n/10;

                	 pos++;
                 }
                 System.out.print(ans);
	}

}
