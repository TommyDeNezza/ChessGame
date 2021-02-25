package chess.board;
import chess.pieces.*;
public class Board
	{
	public static Spot [][] boxes = new Spot [8][8];
//	public Board()
//		{
//		Board.resetBoard();
//		}
	public static Spot getBox(int x, int y) throws Exception
		{
		if(x < 0 || x > 7 || y < 0 || y > 7)
			{
			throw new Exception("Index out of bound");
			}
		return boxes[x][y];
		}
	public static void resetBoard()
		{
		//this initializes all of the pieces (first black then white)
		boxes [0] [0] = new Spot(0, 0, new Rook(true)); 
		boxes [0] [1] = new Spot(0, 1, new Knight(true));
		boxes [0] [2] = new Spot(0, 2, new Bishop(true));
		boxes [0] [3] = new Spot(0, 3, new Queen(true));
		boxes [0] [4] = new Spot(0, 4, new King(true));
		boxes [0] [5] = new Spot(0, 5, new Bishop(true));
		boxes [0] [6] = new Spot(0, 6, new Knight(true));
		boxes [0] [7] = new Spot(0, 7, new Rook(true));
		for(int i = 0; i < 8; i++)
			{
			boxes [1][i] = new Spot(1, i, new Pawn(true));
			}
		
		boxes [7] [0] = new Spot(7, 0, new Rook(false)); 
		boxes [7] [1] = new Spot(7, 1, new Knight(false));
		boxes [7] [2] = new Spot(7, 2, new Bishop(false));
		boxes [7] [3] = new Spot(7, 3, new Queen(false));
		boxes [7] [4] = new Spot(7, 4, new King(false));
		boxes [7] [5] = new Spot(7, 5, new Bishop(false));
		boxes [7] [6] = new Spot(7, 6, new Knight(false));
		boxes [7] [7] = new Spot(7, 7, new Rook(false));
		for(int i = 0; i < 8; i++)
			{
			boxes [6][i] = new Spot(1, i, new Pawn(false));
			}
		
		for(int i = 2; i < 6; i ++)
			{
			for(int j = 0; j < 8; j++)
				{
				boxes [i][j] = new Spot(i, j, null);
				}
			}
		}
	public static void printBoard()
		{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" _________________");
		for(int i = 7; i >= 0; i--)
			{
			System.out.print(i+"|");
			for(int j = 0; j < 8; j++)
				{
				if(boxes[i][j].getPiece() == null)
					{
					System.out.print(" |");
					}
				else
					{
					System.out.print(boxes[i][j].getPiece().displayLetter()+"|");
					}
				}
			System.out.println(" ");
			}
		System.out.println("y_________________");
		System.out.println("  0 1 2 3 4 5 6 7  x");
		}
	}
