package chess.board;
import chess.pieces.*;
public class Board
	{
	public static Spot [][] boxes = new Spot [8][8];
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
		System.out.println("_________________");
		System.out.println("|"+boxes[7][0]+"|"+boxes[7][1]+"|"+boxes[7][2]+"|"+boxes[7][3]+"|"+boxes[7][4]+"|"+boxes[7][5]+"|"+boxes[7][6]+"|"+boxes[7][7]+"|");
		System.out.println("|"+boxes[6][0]+"|"+boxes[6][1]+"|"+boxes[6][2]+"|"+boxes[6][3]+"|"+boxes[6][4]+"|"+boxes[6][5]+"|"+boxes[6][6]+"|"+boxes[6][7]+"|");
		System.out.println("|"+boxes[5][0]+"|"+boxes[5][1]+"|"+boxes[5][2]+"|"+boxes[5][3]+"|"+boxes[5][4]+"|"+boxes[5][5]+"|"+boxes[5][6]+"|"+boxes[5][7]+"|");
		System.out.println("|"+boxes[4][0]+"|"+boxes[4][1]+"|"+boxes[4][2]+"|"+boxes[4][3]+"|"+boxes[4][4]+"|"+boxes[4][5]+"|"+boxes[4][6]+"|"+boxes[4][7]+"|");
		System.out.println("|"+boxes[3][0]+"|"+boxes[3][1]+"|"+boxes[3][2]+"|"+boxes[3][3]+"|"+boxes[3][4]+"|"+boxes[3][5]+"|"+boxes[3][6]+"|"+boxes[3][7]+"|");
		System.out.println("|"+boxes[2][0]+"|"+boxes[2][1]+"|"+boxes[2][2]+"|"+boxes[2][3]+"|"+boxes[2][4]+"|"+boxes[2][5]+"|"+boxes[2][6]+"|"+boxes[2][7]+"|");
		System.out.println("|"+boxes[1][0]+"|"+boxes[1][1]+"|"+boxes[1][2]+"|"+boxes[1][3]+"|"+boxes[1][4]+"|"+boxes[1][5]+"|"+boxes[1][6]+"|"+boxes[1][7]+"|");
		System.out.println("|"+boxes[0][0]+"|"+boxes[0][1]+"|"+boxes[0][2]+"|"+boxes[0][3]+"|"+boxes[0][4]+"|"+boxes[0][5]+"|"+boxes[0][6]+"|"+boxes[0][7]+"|");
		System.out.println("_________________");
		}
	}
