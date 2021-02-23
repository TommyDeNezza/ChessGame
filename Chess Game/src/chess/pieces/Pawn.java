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
		if(end.getPiece().isWhite() == this.isWhite())
			{
			return false;
			}
		int x = Math.abs(start.getX() - end.getX()); //FIX ALL X AND Y ISSUES HERE
		int y = (start.getY() - end.getY());
		if(this.isWhite() == true && y < 0)
			{
			if(y == -2 && end.getPiece() == null && start.getX() == 1 && Board.boxes[2][start.getY()] == null && x == 0) //moving two spaces on first pawn move
				{
				return true;
				}
			else if(y == -1 && x == 0 && end.getPiece() == null)
				{
				return true;
				}
			else
				{
				return (x == 1 && y == -1 && end.getPiece().isWhite() != this.isWhite());
				}
			}
		else if(this.isWhite() == false && y > 0)
			{
			if(y == 2 && end.getPiece() == null && start.getX() == 6 && Board.boxes[5][start.getY()] == null && x == 0) //moving two spaces on first pawn move
				{
				return true;
				}
			else if(y == 1 && x == 0 && end.getPiece() == null)
				{
				return true;
				}
			else
				{
				return (x == 1 && y == -1 && end.getPiece().isWhite() != this.isWhite());
				}
			}
		return false;
		}
	}
