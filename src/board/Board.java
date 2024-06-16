package board;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		
		this.rows = rows;
		this.columns = columns;
		
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
//	
//	public void placePiece(Piece piece, Position position) {
//		//TODO
//		
//	}
//	
//	public Piece removePiece(Position position) {
//		//TODO
//		
//	}
//	
//	public boolean positionExists(Position position) {
//		//TODO
//		
//	}
//	
//	public boolean thereIsAPiece(Position position) {
//		//TODO
//		
//	}
	
	@Override
	public String toString() {
		return ("8 - - - - - - - -\r\n"
				+ "7 - - - - - - - -\r\n"
				+ "6 - - - - - - - -\r\n"
				+ "5 - - - - - - - -\r\n"
				+ "4 - - - - - - - -\r\n"
				+ "3 - - - - - - - -\r\n"
				+ "2 - - - - - - - -\r\n"
				+ "1 - - - - - - - -\r\n"
				+ " a b c d e f g h");
	}

	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
}
