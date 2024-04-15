package board;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}

//	public boolean [][] possibleMoves(){
//		//TODO
//		
//	}
//	
//	public boolean possibleMove(Position position) {
//		//TODO
//		
//	}
//	
//	public boolean isThereAnyPossibleMove() {
//		//TODO
//		
//	}
}
