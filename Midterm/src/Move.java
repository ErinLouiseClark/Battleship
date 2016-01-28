import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import org.omg.Messaging.SyncScopeHelper;
public class Move {

	static int rowChoice = 0;
	static int countC = 0;
	static int countB = 0;
	static int countS = 0;
	static int countD = 0;
	static int counter = 0;
	static String coordinate = attackComputer();
	static String sink = sinkShip(coordinate);
	
	
	public static String attackComputer(){
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
		String column = input.substring(1,2);
		
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
		String coordinate = rowChoice + column;
		
		if(Setup.computerBoard[rowChoice][col]== "M"){
			System.out.println("Miss");
			return coordinate;
			}
		else{
			System.out.println("Hit");
		}

		}	
	}
}

	public static void sinkShip(String userMove){
	if(Setup.computerBoard == Board.board1){
		if(userMove == Board.board1[0][2]){
			countC++;
		}
		if(userMove == Board.board1[1][2]){
			countC++;
		}
		if(countC == 2){
			System.out.println("You sunk the computer's Carrier!");
			counter++;
		}
		if(userMove == Board.board1[1][7]){
			countB++;
		}
		if(userMove == Board.board1[1][8]){
			countB++;
		}
		if(userMove == Board.board1[1][9]){
			countB++;
		}
		if(countB == 3){
			System.out.println("You sunk the computer's Battleship!");
			counter++;
		}
		if(userMove == Board.board1[5][3]){
			countS++;
		}
		if(userMove == Board.board1[5][4]){
			countS++;
		}
		if(userMove == Board.board1[5][5]){
			countS++;
		}
		if(userMove == Board.board1[5][6]){
			countS++;
		}
		if(countS == 4){
			System.out.println("You sunk the computer's Submarine!");
			counter++;
		}
		if(userMove == Board.board1[0][4]){
			countD++;
		}
		if(userMove == Board.board1[0][5]){
			countD++;
		}
		if(userMove == Board.board1[0][6]){
			countD++;
		}
		if(userMove == Board.board1[0][7]){
			countD++;
		}
		if(userMove == Board.board1[0][8]){
			countD++;
		}
		if(countS == 5){
			System.out.println("You sunk the compter's Destroyer!");
			counter++;
		}

		if(counter == 4){
			System.out.println("You sunk all of the computer's ships!");
			System.out.println("YOU WIN!");
			System.exit(0);
		}
		
		
	}	
		
	}
}

