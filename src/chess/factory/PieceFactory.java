package chess.factory;

import chess.ChessPiece;
import chess.Color;

public interface PieceFactory {
	 ChessPiece createPiece(String type, Color color);
}
