
public abstract class Space
	{
	int xCord;
	int yCord;
	Space(int xCord, int yCord)
		{
		this.xCord = xCord;
		this.yCord = yCord;
		}
	public abstract boolean isSpaceOccupied();
	
	public abstract Piece getPiece();
	
	public static final class EmptySpace extends Space
		{
		EmptySpace(int xCord, int yCord)
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
		Piece pieceOnSpace;
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
