package chess.pieces;

import chess.board.*;

public abstract class Piece
	{
	private boolean killed = false;
	private boolean white = false;
	protected Piece(boolean white)
		{
		this.setWhite(white);
		}
	protected boolean isWhite()
		{
		return this.white;
		}
	protected void setWhite(boolean white)
		{
		this.white = white;
		}
	protected boolean isKilled()
		{
		return this.killed;
		}
	protected void setKilled(boolean Killed)
		{
		this.killed = killed;
		}
	public abstract boolean canMove(Board board, Spot start, Spot end);
	}
