package chess.pieces;

import chess.board.Board;
import chess.board.Spot;

public class Knight extends Piece
	{
	public Knight(boolean white)
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
		return x*y == 2; //knight move from b1 to c3 would be up two over 1, mult together get 2 same for all movements
		}
	}
