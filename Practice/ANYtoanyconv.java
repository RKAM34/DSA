package Practice;

import java.util.Scanner;

public class ANYtoanyconv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner Scn = new Scanner(System.in);
	        int sb = Scn.nextInt();
	        int db = Scn.nextInt();
	        int sn = Scn.nextInt();
	        if(sb!=10&&db!=10) {
	            int ans= AnytoD(sn,sb);
	            Convert(ans,db,10);
	        }
	        else {
	            Convert(sn,db,sb);
	        }
	    }
	    public static void Convert(int sn,int db,int sb)
	    {
	        int rem;
	        int ans = 0;
	        int mult = 1;
	        while (sn > 0) {
	            rem = sn % db;
	            ans = ans + rem * mult;
	            mult = mult *sb;
	            sn = sn / db;
	            }
	        System.out.println(ans);
	    }
	    public static int AnytoD(int sn,int sb)
	    {
	        int rem;
	        int ans = 0;
	        int mult = 1;
	        while (sn> 0) {
	            rem = sn % 10;
	            ans = ans + rem * mult;
	            mult = mult * sb;
	            sn = sn / 10;
	        }
	        return ans;

	}

}
