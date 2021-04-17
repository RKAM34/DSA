package LEC11;

public class Nqueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board= new boolean[4][4];
		queen2d(board , 0 , 0 , 0 , 4 ,"");
	}
public static void queen2d( boolean[][] board , int row ,   int col , int qpsf , int tq , String ans) {
		
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		if(col==board[0].length) {
			row++;
			col=0;
		}
		if(row==board.length) {
			return;
		}
		if(isitsafe(board, row, col)) {
		board[row][col]=true;
		queen2d(board, row, col+1, qpsf+1, tq, ans+"("+row+"-"+col+")");
		board[row][col]=false;}
		
			queen2d(board, row, col+1, qpsf, tq, ans);
			
		
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
