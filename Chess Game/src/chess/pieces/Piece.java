package chess.pieces;

import chess.board.*;

public abstract class Piece
	{
	private boolean killed = false;
	protected boolean white = true;
	public Piece(boolean white)
		{
		this.setWhite(white);
		}
	public boolean isWhite()
		{
		return this.white;
		}
	public void setWhite(boolean white)
		{
		this.white = white;
		}
	public boolean isKilled()
		{
		return this.killed;
		}
	public void setKilled(boolean Killed)
		{
		this.killed = killed;
		}
	public abstract boolean canMove(Board board, Spot start, Spot end);
	public abstract String displayLetter();
	}
