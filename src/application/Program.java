package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] ags) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
	
}
