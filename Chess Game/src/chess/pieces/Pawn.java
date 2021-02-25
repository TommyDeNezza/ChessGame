package chess.pieces;

import chess.board.Board;
import chess.board.Spot;

public class Pawn extends Piece
	{
	public static int x;
	public static int y;
	public Pawn(boolean white)
		{
		super(white);
		}
	public boolean canMove(Board board, Spot start, Spot end)
		{
		if(end.getPiece() == null)
			{
			
			}
		else if(end.getPiece().isWhite() == this.isWhite())
			{
			return false;
			}
		x = (start.getX() - end.getX());
		y = Math.abs(start.getY() - end.getY());
		if(this.isWhite() == true && x < 0)
			{
			if(x == -2 && end.getPiece() == null && start.getX() == 1 && Board.boxes[2][start.getY()].getPiece() == null && y == 0) //moving two spaces on first pawn move
				{
				return true;
				}
			else if(x == -1 && y == 0 && end.getPiece() == null)
				{
				return true;
				}
			else
				{
				return (y == 1 && x == -1 && end.getPiece().isWhite() != this.isWhite());
				}
			}
		if(this.isWhite() == false && x > 0)
			{
			if(x == 2 && end.getPiece() == null && start.getX() == 6 && Board.boxes[5][start.getY()].getPiece() == null && y == 0) //moving two spaces on first pawn move
				{
				return true;
				}
			else if(x == 1 && y == 0 && end.getPiece() == null)
				{
				return true;
				}
			else
				{
				return (y == 1 && x == 1 && end.getPiece().isWhite() != this.isWhite());
				}
			}
		return false;
		}
	public String displayLetter()                     
		{
		if(this.isWhite() == true)
			{
			return "P";
			}
		return "p";
		}
	}
