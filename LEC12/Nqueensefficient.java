package LEC12;

public class Nqueensefficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board= new boolean[4][4];
		nqueensefficient(board , 0  , 0 , 4 ,"");
	}

	
 public static void nqueensefficient( boolean [][] board , int row , int qpsf , int tq , String ans ) {
	 
	 if(qpsf==tq) {
		 System.out.println(ans);
		 return;
	 }
	 if(row==board.length) {
		 return;
	 }
	 
	 for(int col=0;col<board[0].length;col++) {
		 if(isitsafe(board, row, col)) {
	 board[row][col]=true;
	 nqueensefficient(board, row+1, qpsf+1, tq, ans+"("+row+"-"+col+")");
	 board[row][col]=false;
	 
		 }
	 }
	 
	 
 }
 public static boolean isitsafe(boolean[][] board , int row , int col )
	{
		//up
		int r = row-1;
		int c = col;
		while(r>=0)
		{if(board[r][c]) {
			
			return false;
		}
		r--;
		}
		//diagnal left 
		r=row-1;
		c=col-1;
		while(r>=0&&c>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		//diagnal right
		r=row-1;
		c=col+1;
		while(r>=0&&c<board.length) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		//backwards
		r=row;
		c=col-1;
		while(c>=0) {
			if(board[r][c]) {
				return false;
			}
			c--;
		}
		
		
		
		
		return true;
		
	}
}
