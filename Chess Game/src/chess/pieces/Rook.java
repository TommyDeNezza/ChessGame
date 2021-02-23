package chess.pieces;

import chess.board.Board;
import chess.board.Spot;

public class Rook extends Piece
	{
	public Rook(boolean white)
		{
		super(white);
		}

	public boolean canMove(Board board, Spot start, Spot end)
		{
		if(end.getPiece().isWhite() == this.isWhite())
			{
			return false;
			}
		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getY() - end.getY());
		return x - y == x || y - x == y;
		}
	}
