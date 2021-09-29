package bridgeLabz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		System.out.println("::Welcome to Tic-Tac-Toe board::");

		makeMove(displayBoard(createBoard()));

	}

	private static void makeMove(char[] board) {
		Scanner scanner = new Scanner(System.in);
		char player1 = chooseSymbol();
		char computer = (player1 == 'X') ? 'O' : 'X';
		Random rand = new Random();
		while (!win) {
			int play = rand.nextInt(2);
			if (play == 0) {
				System.out.println("Choose cell you want to put symbol[1-9]:");
				int cell = scanner.nextInt();
				if (board[cell] == ' ') {
					board[cell] = player1;
					displayBoard(board);

				} else {
					System.out.println("Cell already taken..");
				}
			} else {
				System.out.println("Computer turn choose cell to play : ");
				int computerInput = scanner.nextInt();
				if (board[computerInput] == ' ') {
					board[computerInput] = computer;
					displayBoard(board);
				} else {
					System.out.println("Cell already taken..");
				}

			}
			  
				checkWin(board);
		}
		 if(win != true) {
			 System.out.println("Its a tie..!!");
		 }
		System.out.println("Player with '"+ chr +"'symbol is a Winner...!!");

	}

	private static char checkWin(char[] board) {
		chr = ' ';
		for (char ch : board) {
			switch (ch) {
			case 'X':
				if (check(board) == true) {
					win = true;
					chr = 'X';
					break;
				}

			case 'O':
				if (check(board) == true) {
					win = true;
					chr = 'O';
				}
				break;

			default:

				break;
			}
		} 
		return chr;
	}

	private static boolean check(char[] board) {
		boolean istriple = false;
		if (board[1] == board[2] && board[2] == board[3] && board[3] != ' ') {
			istriple = true;
		} else if (board[4] == board[5] && board[5] == board[6] && board[6] != ' ') {
			istriple = true;
		} else if (board[7] == board[8] && board[8] == board[9] && board[9] != ' ') {
			istriple = true;
		} else if (board[1] == board[4] && board[4] == board[7] && board[7] != ' ') {
			istriple = true;
		} else if (board[2] == board[5] && board[5] == board[8] && board[8] != ' ') {
			istriple = true;
		} else if (board[3] == board[6] && board[6] == board[9] && board[9] != ' ') {
			istriple = true;
		} else if (board[1] == board[5] && board[5] == board[9] && board[9] != ' ') {
			istriple = true;
		} else if (board[3] == board[5] && board[5] == board[7] && board[7] != ' ') {
			istriple = true;
		}
		return istriple;
	}

	private static char chooseSymbol() {
		System.out.println("Choose your Symbol to Play X or O :");
		char player = ' ';
		Scanner scanner = new Scanner(System.in);
		char symbol = scanner.next().toUpperCase().charAt(0);
		if (symbol == 'X' || symbol == 'O') {
			player = (symbol != 'X') ? 'O' : 'X';
		} else {
			System.out.println("Choose valid symbol [X/O]");
		}
		return player;

	}

	private static char[] displayBoard(char[] board) {
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("--+---+-- ");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("--+---+-- ");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
		return board;
	}

	public static boolean win = false;
	static char chr;
	public static int index;

	private static char[] createBoard() {
		char[] board = new char[10];
		for (index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
		return board;
	}

}
