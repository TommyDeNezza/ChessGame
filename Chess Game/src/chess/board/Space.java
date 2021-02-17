package chess.board;
import chess.pieces.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public abstract class Space
	{
	protected final int xCord;
	protected final int yCord;
	private static final Map<Integer, EmptySpace> EMPTY_SPACES = createAllEmptySpaces();
	private static Map<Integer, EmptySpace> createAllEmptySpaces()
		{
		final Map<Integer, EmptySpace> emptySpaceMap = new HashMap<>();
		for(int i = 0; i < 8; i ++)
			{
			for(int j = 0; j < 8; j++)
				{
				emptySpaceMap.put(i, new EmptySpace(i, j));
				}
			}
		return Collections.unmodifiableMap(emptySpaceMap);
		}
	Space(int xCord, int yCord)
		{
		this.xCord = xCord;
		this.yCord = yCord;
		}
	
	public abstract boolean isSpaceOccupied();
	
	public abstract Piece getPiece();
	
	public static final class EmptySpace extends Space
		{
		EmptySpace(final int xCord, final int yCord)
			{
			super(xCord, yCord);
			}	
		public boolean isSpaceOccupied()
			{
			return false;
			}
		public Piece getPiece()
			{
			return null;
			}
		}
	public static final class OccupiedSpace extends Space
		{
		private final Piece pieceOnSpace;
		OccupiedSpace(int xCord, int yCord, Piece pieceOnSpace)
			{
			super(xCord, yCord);
			this.pieceOnSpace = pieceOnSpace;
			}
		public boolean isSpaceOccupied()
			{
			return true;
			}
		public Piece getPiece()
			{
			return this.pieceOnSpace;
			}
		}	
	}
