package chess.board;

import java.util.List;

import chess.pieces.*;

public class Game
	{
	private static Board board;
	public static Player currentTurn;
	public static Spot startBox;
	public static Spot endBox;
	private static GameStatus status; //correlates to enum
	public static void initialize(Player P1, Player P2)
		{
		Board.resetBoard();
		if(P1.isWhiteSide())
			{
			currentTurn = P1;
			}
		else
			{
			currentTurn = P2;
			}
		Game.setStatus(GameStatus.ACTIVE);
		}
	public boolean isEnd()
		{
		return (Game.getStatus() != GameStatus.ACTIVE);
		}
	public static GameStatus getStatus()
		{
		return Game.status;
		}
	public static void setStatus(GameStatus status)
		{
		Game.status = status;
		}
	public static boolean playerMove(Player player, int startX, int startY, int endX, int endY) throws Exception
		{
		startBox = Board.getBox(startX, startY);
		endBox = Board.getBox(endX,  endY);
		Move move = new Move(player, startBox, endBox);
		return makeMove(move, player);
		}
	public static boolean makeMove(Move move, Player player)
		{
		Piece sourcePiece = move.getStart().getPiece();
		if(sourcePiece == null)
			{
			return false;
			}
		if(player != currentTurn)
			{
			return false;
			}
		 if (sourcePiece.isWhite() != player.isWhiteSide()) 
			 { 
         return false; 
			 }  
		 if (sourcePiece.canMove(board, move.getStart(), move.getEnd()) == false) 
			 { 
			 return false; 
			 } 
		 Piece destPiece = move.getEnd().getPiece(); 
		 if (destPiece != null) 
			 { 
			 destPiece.setKilled(true);  
			 }  
		 move.getEnd().setPiece(move.getStart().getPiece()); 
		 move.getStart().setPiece(null); 
		 if (destPiece != null && destPiece instanceof King) 
			{ 
         	if (player.isWhiteSide()) 
         		{ 
         		Game.setStatus(GameStatus.WHITE_WIN); 
         		} 
         	else 
         		{ 
             	Game.setStatus(GameStatus.BLACK_WIN); 
         		} 
		 	} 
		return true;
		}
	}
