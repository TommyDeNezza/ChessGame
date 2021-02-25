package chess.pieces;
import chess.board.Board;
import chess.board.Spot;
public class Bishop extends Piece
	{
	public Bishop(boolean white)
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
		int x = Math.abs(start.getX() - end.getX());
		int y = Math.abs(start.getY() - end.getY());
		return x/y == 1;
		}
	@Override
	public String displayLetter()
		{
		if(this.isWhite() == true)
			{
			return "B";
			}
		return "b";
		}
	}
