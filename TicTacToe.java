package bridgeLabz;

public class TicTacToe {

	public static void main(String[] args) {
		System.out.println("::Welcome to Tic-Tac-Toe board::");
		displayBoard(createBoard());

	}
	private static char[] displayBoard(char[] board) {
		System.out.println(" "+ board[1] + "  | " + board[2] + " | " + board[3]);
		System.out.println(" ---+---+---");
		System.out.println(" "+ board[4] + "  | " + board[5] + " | " + board[6]);
		System.out.println(" ---+---+---");
		System.out.println(" "+ board[7] + "  | " + board[8] + " | " + board[9]);
		return board;
	}
	public static boolean win = false;
	public static char[] board;
	public static int index;
	private static char[] createBoard() {
		char[] board = new char[10];	
		for(index = 1; index<board.length; index++) {
			board[index] = ' ';
		}
		return board;
	}

}
