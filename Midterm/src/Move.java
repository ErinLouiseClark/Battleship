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
	//static String coordinate = attackComputer();
	//static String sink = sinkShip(coordinate);
	//static String[][] coordinate = new String[8][8];
	
	
	public static void attackComputer(){
		int [][] hitComputer = new int [8][8];
		System.out.println("Your move.");
		Scanner userInput = new Scanner(System.in);
		String input = userInput.nextLine();
		String H = null;
		for(int i = 1; i < input.length(); i++){
			if(input.length() > 2){
				System.out.println("Invalid space");
				attackComputer();
			}
		
		String row = input.substring(0, 1).toLowerCase();
		int col = Integer.parseInt(input.substring(1, 2))-1;
		
		switch (row) {
		
		case "a":
		{
			rowChoice = 0;
			break;
		}
		
		case "b":
		{
			rowChoice = 1;
			break;
		}
		
		case "c":
		{
			rowChoice = 2;
			break;
		}
		case "d":
		{
			rowChoice = 3;
			break;
		}
		
		case "e":
		{
			rowChoice = 4;
			break;
		}
		case "f":
		{
			rowChoice = 5;
			break;
		}
		case "g":
		{
			rowChoice = 6;
			break;
		}
		case "h":
		{
			rowChoice = 7;
			break;
		}
		default:
		{
			System.out.println("Invalid choice");
			attackComputer();
		}
		}
		sinkShip(rowChoice, col);
		}	
			
	}


	public static void sinkShip(int row, int column){
		if(Setup.computerBoard == Board.board1){
			board1(row, column);
		}
		if(Setup.computerBoard == Board.board2){
			board2(row, column);
		}
		if(Setup.computerBoard == Board.board3){
			board3(row, column);
		}
		if(Setup.computerBoard == Board.board4){
			board4(row, column);
		}
		if(Setup.computerBoard == Board.board5){
			board5(row, column);
		}	
		
		if(countC == 2){
			System.out.println("You sunk the computer's Carrier!");
			countC++;
			counter++;
		}
		if (countB == 3){
			System.out.println("You sunk the computer's Battleship!");
			countB++;
			counter++;
		}
		if(countS == 4){
			System.out.println("You sunk the computer's Submarine!");
			countS++;
			counter++;
		}
		if(countD == 5){
			System.out.println("You sunk the computer's Destroyer!");
			countD++;
			counter++;
		}
		
		if(counter == 4){
			System.out.println("You sunk all of the computer's ships!");
			System.out.println("YOU WIN!");
			System.exit(0);
		}
		ComputerMove.computerMove();
	}		
	
	private static void board1(int row, int column){
		
			if (row == 0 && column == 2) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countC++;
			}
			else if (row == 1 && column == 2) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countC++;
			}
			
			else if (row == 1 && column == 6) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countB++;
			}
			else if (row == 1 && column == 7) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countB++;
			}
			else if (row == 1 && column == 8) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countB++;
			}	
			else if (row == 5 && column == 3) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 5 && column == 4) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 5 && column == 5) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 5 && column == 6) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			
			else if (row == 0 && column == 4) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 0 && column == 5) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 0 && column == 6) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 0 && column == 7) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 0 && column == 8) {
				System.out.println("Hit");
				countD++;
			}
			else{
				System.out.println("Miss");
			}
	}
	private static void board2(int row, int column){
			if (row == 0 && column == 0) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countC++;
			}
			else if (row == 0 && column == 1) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countC++;
			}
			else if (row == 4 && column == 0) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countB++;
			}
			else if (row == 5 && column == 0) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countB++;
			}
			else if (row == 6 && column == 0) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countB++;
			}
			else if (row == 3 && column == 8) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 4 && column == 8) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 5 && column == 8) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 6 && column == 8) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 8 && column == 4) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 8 && column == 5) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 8 && column == 6) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 8 && column == 7) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 8 && column == 8) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else{
				System.out.println("Miss");
			}
	}
	
	private static void board3(int row, int column){
			if (row == 2 && column == 2) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countC++;
			}
			else if (row == 2 && column == 3) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countC++;
			}
			else if (row == 4 && column == 3) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countB++;
			}
			else if (row == 4 && column == 4) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countB++;
			}
			else if (row == 4 && column == 5) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countB++;
			}
			else if (row == 6 && column == 1) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 6 && column == 2) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 6 && column == 3) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 6 && column == 4) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 0 && column == 4) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 0 && column == 5) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 0 && column == 6) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 0 && column == 7) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 0 && column == 8) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else{
				System.out.println("Miss");
			}
		}
	
	private static void board4(int row, int column){
			if (row == 7 && column == 1) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countC++;
			}
			else if (row == 8 && column == 1) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countC++;
			}
			else if (row == 2 && column == 0) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countB++;
			}
			else if (row == 3 && column == 0) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countB++;
			}
			else if (row == 4 && column == 0) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countB++;
			}
			else if (row == 0 && column == 2) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 0 && column == 3) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 0 && column == 4) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 0 && column == 5) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countS++;
			}
			else if (row == 4 && column == 4) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 4 && column == 5) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 4 && column == 6) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 4 && column == 7) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else if (row == 4 && column == 8) {
				System.out.println("Hit");
				BattleshipRunner.play();
				countD++;
			}
			else{
				System.out.println("Miss");
			}
		}
	private static void board5(int row, int column){
		if (row == 6 && column == 1) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countC++;
		}
		else if (row == 7 && column == 1) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countC++;
		}
		else if (row == 8 && column == 5) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countB++;
		}
		else if (row == 8 && column == 6) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countB++;
		}
		else if (row == 8 && column == 7) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countB++;
		}
		else if (row == 5 && column == 4) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countS++;
		}
		else if (row == 5 && column == 5) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countS++;
		}
		else if (row == 5 && column == 6) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countS++;
		}
		else if (row == 5 && column == 7) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countS++;
		}
		else if (row == 1 && column == 0) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countD++;
		}
		else if (row == 1 && column == 1) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countD++;
		}
		else if (row == 1 && column == 2) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countD++;
		}
		else if (row == 1 && column == 3) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countD++;
		}
		else if (row == 1 && column == 4) {
			System.out.println("Hit");
			BattleshipRunner.play();
			countD++;
		}
		else{
			System.out.println("Miss");
		}
	}
}



