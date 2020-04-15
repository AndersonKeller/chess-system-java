package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Main {

	public static void main(String[] args) {
		/* Chess System
		 *  Author Anderson Keller
		 */
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}
