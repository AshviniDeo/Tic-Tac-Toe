package bridgeLabz;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		System.out.println("::Welcome to Tic-Tac-Toe board::");
		displayBoard(createBoard());
		chooseSymbol();

	}
	private static char chooseSymbol() {
		System.out.println("Choose your Symbol to Play X or O :");
		Scanner scanner = new Scanner(System.in);
		char symbol = scanner.next().toUpperCase().charAt(0);
		char player = (symbol !='X')?'O':'X';
		return player;
		
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
