package chess;

import board.Board;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPiece(){
		
		ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()];
		
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				matrix[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return matrix;
	}

}
