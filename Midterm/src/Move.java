import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import org.omg.Messaging.SyncScopeHelper;
public class Move {

	static int rowChoice = 0;
		
	public static void attackComputer(){
		int [][] hitComputer = new int [8][8];
		Scanner userInput = new Scanner(System.in);
		System.out.println("Attack the computer. Enter which coordinate you would like to hit. Ex: A1.");
		String input = userInput.nextLine();
		for(int i = 1; i < input.length(); i++){
			if(input.length() > 2){
				System.out.println("Invalid space");
			}
		
		String row = input.substring(0, 1).toLowerCase();
		int col = Integer.parseInt(input.substring(1, 2));
		switch (row) {
		
		case "a":
		{
			rowChoice = 0;
		}
		
		case "b":
		{
			rowChoice = 1;
		}
		
		case "c":
		{
			rowChoice = 2;
		}
		case "d":
		{
			rowChoice = 3;
		}
		
		case "e":
		{
			rowChoice = 4;
		}
		case "f":
		{
			rowChoice = 5;
		}
		case "g":
		{
			rowChoice = 6;
		}
		case "h":
		{
			rowChoice = 7;
		}
		default:
		{
			System.out.println("Invalid choice");
		}
			
		}
		
		Board.userBoard[rowChoice][col] = input;
		
		}
	}
	
	public static void computerMove(){
		
		int randomRow = (int)(Math.random()*8)-1;
		int randomCol = (int)(Math.random()*8)-1;
		if (Board.computerDisplay[randomRow][randomCol] == Board.userBoard[Board.row][Board.col]){
			System.out.println("The computer " + Setup.hit + " your ship.");
		}
		else{
			System.out.println("The computer " + Setup.miss + "ed your ship.");
		}
	
			

			
	}

	
}