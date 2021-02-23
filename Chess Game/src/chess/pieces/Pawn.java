package chess.pieces;

import chess.board.Board;
import chess.board.Spot;

public class Pawn extends Piece
	{
	public Pawn(boolean white)
		{
		super(white);
		}
	public boolean canMove(Board board, Spot start, Spot end)
		{
		boolean straight = true;
		if(end.getPiece().isWhite() == this.isWhite())
			{
			return false;
			}
		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getY() - end.getY());
		if(this.isWhite() == true)
			{
			
			}
		else
			{
			
			}
		return false;
		}
	}
