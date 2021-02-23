package chess.pieces;

import chess.board.Board;
import chess.board.Spot;

public class Queen extends Piece
	{
	public Queen(boolean white)
		{
		super(white);
		}
	public boolean canMove(Board board, Spot start, Spot end)
		{
		return false;
		}
	}
