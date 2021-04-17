package LEC11;

public class Coinschangeboxapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coins = {2,3,4,6};
     coinschange(coins,0,10,"");
	}


public static void coinschange( int[] coins , int vidx, int target , String ans)
{
    
	if(target==0) {
		System.out.println(ans);
		return;
	}
	if(target<0||vidx==coins.length) {
		return;
	}
	
	
	 coinschange(coins , vidx , target-coins[vidx] , ans+coins[vidx]);
	 
	coinschange(coins , vidx+1 , target , ans );
	
}
}