package application;

import java.util.Scanner;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		
	}

}
