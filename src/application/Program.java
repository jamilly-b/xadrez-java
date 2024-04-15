package application;

import board.Board;
import board.Position;

public class Program {

	public static void main(String[] args) {
		
		Position p = new Position(3, 4);
		
		System.out.println(p);
		
		Board board = new Board(8, 8);
		
		System.out.println(board);
	}

}
