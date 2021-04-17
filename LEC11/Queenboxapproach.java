package LEC11;

public class Queenboxapproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board= new boolean[4];
		combqueenbox(board , 0 , 0 , 2 , "");

	}

	
	public static void combqueenbox( boolean[] board , int column , int qpsf , int tq , String ans) {
		
		
		
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		if(column==board.length) {
			return;
		}
		
		
		board[column]=true;
		combqueenbox(board , column+1 , qpsf+1 , tq , ans+"b"+column);
		
		board[column]=false;
		combqueenbox(board , column+1 , qpsf , tq , ans);
		
	}
	
}
