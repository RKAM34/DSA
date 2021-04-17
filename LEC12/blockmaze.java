package LEC12;

public class blockmaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][] arr = {{0 , 1, 0 ,0 },{0,0,0,0},{0,0,1,0},{0,1,0,0}};
        boolean[][] visited= new boolean[4][4];
        blockmaze(arr, 0, 0, visited, "");
	}
	public static void blockmaze(int [][] board , int  row , int col , boolean[][] visited , String ans) {
       
		
		if(row==board.length-1&&col==board[0].length-1) {
			System.out.println(ans);
			return;
		}
		if(row<0||row>=board.length||col<0||col>=board[0].length||board[row][col]==1||visited[row][col]==true) {
			return;
		}
		visited[row][col]=true;
		blockmaze(board, row+1, col, visited, ans+"D");
		blockmaze(board, row-1, col, visited, ans+"U");
		blockmaze(board, row, col-1, visited, ans+"L");
		blockmaze(board, row, col+1, visited, ans+"R");
        visited[row][col]=false;
	}

}
