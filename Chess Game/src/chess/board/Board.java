package chess.board;

public class Board
	{
	Spot [][] boxes;
	public Board()
		{
		this.resetBoard();
		}
	public Spot getBox(int x, int y) throws Exception
		{
		if(x < 0 || x > 7 || y < 0 || y > 7)
			{
			throw new Exception("Index out of bound");
			}
		return boxes[x][y];
		}
	public void resetBoard()
		{
		//this initializes all of the pieces (first white then black)
		//boxes [0] [0] rook
		//boxes [0] [1] knight
		
		//boxes [7] [0] rook
		//boxes [7] [1] knight
		
		for(int i = 2; i < 6; i ++)
			{
			for(int j = 0; j < 8; j++)
				{
				boxes [i][j] = new Spot(i, j, null);
				}
			}
		}
	
	}
