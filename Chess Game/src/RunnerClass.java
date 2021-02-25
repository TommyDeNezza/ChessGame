import java.util.Scanner;

import chess.board.*;
import chess.pieces.*;
public class RunnerClass
	{
	static Scanner ui = new Scanner(System.in);
	public static void main(String[] args) throws Exception
		{
		Player P1 = new Player(true);
		Player P2 = new Player(false);
		Game.initialize(P1, P2);
		//System.out.println(Game.getStatus());
		//System.out.println(Game.currentTurn.isWhiteSide());
		System.out.println("P1, represented by the capitalized pieces, will go first, then P2, start.");
		while(Game.getStatus() == GameStatus.ACTIVE)
			{
			Game.startBox = null;
			Game.endBox = null;
			Board.printBoard();
			System.out.println(Game.currentTurn.isWhiteSide());
			System.out.println("What piece would you like to move? (enter in x cord)");
			int yStart = ui.nextInt();
			System.out.println("What piece would you like to move? (enter in y cord)");
			int xStart = ui.nextInt();
			System.out.println("What space would you like to move to? (enter in x cord)");
			int yEnd = ui.nextInt();
			System.out.println("What space would you like to move to? (enter in y cord)");
			int xEnd = ui.nextInt();
			//Game.startBox = Board.getBox(xStart, yStart);
			//Game.endBox = Board.getBox(xEnd,  yEnd);
			Game.playerMove(Game.currentTurn, xStart, yStart, xEnd, yEnd);
			System.out.println(Game.startBox.getX());
			System.out.println(Game.startBox.getY());
			System.out.println(Game.endBox.getX());
			System.out.println(Game.endBox.getY());
			System.out.println(Pawn.x);
			System.out.println(Pawn.y);
			if (Game.currentTurn == P1) 
				{ 
			 	Game.currentTurn = P2; 
				} 
			 else 
				{ 
				Game.currentTurn = P1; 
				} 
			}
		//Board.resetBoard();
		}
	}
