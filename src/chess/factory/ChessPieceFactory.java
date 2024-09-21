package chess.factory;

import board.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class ChessPieceFactory implements PieceFactory {

	private Board board;
	private ChessMatch chessMatch; 

    public ChessPieceFactory(Board board, ChessMatch chessMatch) {
        this.board = board;
        this.chessMatch = chessMatch;
    }

	@Override
	public ChessPiece createPiece(String type, Color color) {
		switch (type) {
        case "B":
            return new Bishop(board, color);
        case "N":
            return new Knight(board, color);
        case "R":
            return new Rook(board, color);
        case "Q":
            return new Queen(board, color);
        case "K":
            return new King(board, color, chessMatch);
        case "P":
            return new Pawn(board, color, chessMatch);
        default:
            throw new IllegalArgumentException("Invalid piece: " + type);
		}
	}

}
