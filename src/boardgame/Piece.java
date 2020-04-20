package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

<<<<<<< HEAD
public abstract boolean[][] possibleMoves();
=======
	public abstract boolean[][] possibleMoves();
>>>>>>> ce68ee1a458b3e156d8ba11c5e9ce3afc6f5baa4
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
<<<<<<< HEAD
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
=======
		for (int i =0; i<mat.length; i++) {
			for (int j =0; i<mat.length; j++) {
>>>>>>> ce68ee1a458b3e156d8ba11c5e9ce3afc6f5baa4
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
<<<<<<< HEAD
=======
	
>>>>>>> ce68ee1a458b3e156d8ba11c5e9ce3afc6f5baa4
}
