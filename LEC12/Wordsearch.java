package LEC12;

public class Wordsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   char [][] board = {{'a' , 'b', 'c' ,'e' },{'s','f','c','s'},{'a','d','e','e'}};
		   boolean[][] visited = new boolean[board.length][board[0].length];
		   String word = "see";
		   boolean ans=false;
		 for(int row=0;row<=board.length;row++) {
			 for(int col=0;col<=board[0].length;col++) {
				 ans=ans||wordsearch(board, row, col, visited, word, 0);
			 }
		 }  
		 if(ans) {
			 System.out.println("true");
		 }
		 else {System.out.println("false");}
	}
    public static boolean wordsearch(char[][]board , int row , int col , boolean[][] visited , String word ,int vidx) {
    	
    	if(vidx==word.length()) {
    		return true;
    	}
    	if(row<0||row>=board.length||col<0||col>=board[0].length||visited[row][col]) {
    		return false;
    	}
    	if(board[row][col]!=word.charAt(vidx)) {
    		return false;
    	}
    	
    	
     visited[row][col]= true;	
    boolean down =	wordsearch(board, row+1, col, visited, word, vidx+1);
    boolean up   =  wordsearch(board, row-1, col, visited, word, vidx+1);
    boolean left =	wordsearch(board, row, col-1, visited, word, vidx+1);
    boolean right=	wordsearch(board, row, col+1, visited, word, vidx+1);
    	visited[row][col]=false;
    return down||up||left||right;
    	
    }
}
