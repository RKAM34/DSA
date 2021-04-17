package LEC11;

public class Backtracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coins = {2,3,4,6};
		coinchange(coins,0,10,"",0);
	}
 public static void coinchange(int[] coins , int vidx , int target , String ans , int lastused) {
	 
	 if(target==0) {
		 System.out.println(ans);
		 return;
	 }
	 if(target<0) {
		 return;
	 }
	 
	 
	 
	 
	 for(int i=lastused;i<coins.length;i++) {
		 
		 coinchange(coins,i,target-coins[i],ans+coins[i],i);
		 
	 }
	 
	 
	 
	 
	 
 }
}
