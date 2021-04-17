package LEC11;

public class Queenapp2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board= new boolean[3][3];
		queen2d(board , 0 , 0 , 0 , 2 ,"");
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
		
		board[row][col]=true;
		queen2d(board, row, col+1, qpsf+1, tq, ans+"("+row+"-"+col+")");
		board[row][col]=false;
		queen2d(board, row, col+1, qpsf, tq, ans);
		
		
	}

}
