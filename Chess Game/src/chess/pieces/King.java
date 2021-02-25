package chess.pieces;

import chess.board.Board;
import chess.board.Spot;

public class King extends Piece
	{
	private boolean castlingDone = false;
	public King(boolean white)
		{
		super(white);
		}
	protected boolean isCastlingDone()
		{
		return this.castlingDone;
		}
	public boolean canMove(Board board, Spot start, Spot end)
		{
		if(end.getPiece() == null)
			{
			
			}
		else if(end.getPiece().isWhite() == this.isWhite()) //checks the location being moved, and if there is a piece present sees if it is the same color as the piece being moved
			{
			return false;
			}
		int x = Math.abs(start.getX()-end.getX());
		int y = Math.abs(start.getY()-end.getY());
		if(x + y == 1)
			{
			//For time sake there will not be check/checkmate so if you move your king into danger it is able to be taken but when I it this is where
			return true;
			}
		//if(this.isCastlingDone())
			//{
			//return false;
			//}
		else if(x == 1 && y == 1)
			{
			return true;
			}
		return false;
		}
	public String displayLetter()
		{
		if(this.isWhite() == true)
			{
			return "K";
			}
		return "k";
		}
	}
