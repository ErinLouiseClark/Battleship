import java. util.ArrayList;
public class ComputerMove {

//static ArrayList<String> computerMoves = new ArrayList<String>();
//static String[][] computerBoard = new String[8][8];
//static ArrayList<String> hits = new ArrayList<String>();
//static ArrayList<String> misses = new ArrayList<String>();
static int counter = 0;
static int countC;
static int countB;
static int countS;
static int countD;

public static String computerMove(){
	
	int randomRow = (int)(Math.random()*7);
	int randomCol = (int)(Math.random()*7);
	String compMove = Board.userBoard[randomRow][randomCol];
	

	if(compMove == " "){
		compMove = "M";
		System.out.println("The computer missed your ship.");
	}
	else if(compMove == "C"){
		compMove = "H";
		System.out.println("The computer hit your carrier.");
		countC++;
		if(countC == 2){
			System.out.println("The computer sunk your carrier!");
		}
		counter++;
	}
	else if(compMove == "B"){
		compMove = "H";
		System.out.println("The computer hit your battleship.");
		countB++;
		if(countB ==3){
			System.out.println("The computer sunk your battleship!");
		}
		counter++;
	}
	else if(compMove == "S"){
		compMove = "H";
		System.out.println("The computer hit your submarine.");
		countS++;
		if(countS == 4){
			System.out.println("The computer sunk your submarine!");
		}
		counter++;
	}
	else if(compMove == "D"){
		compMove = "H";
		System.out.println("The computer hit your destroyer.");
		countD++;
		if(countD == 5){
			System.out.println("The computer sunk your destroyer!");
		}
		counter++;
	}
	else if(compMove == "H"){
		computerMove();
	}
	if(counter == 14){
		System.out.println("The computer sunk all your ships!");
		System.out.println("YOU LOSE!");
		System.exit(0);
	}
	Move.attackComputer();
return compMove;
}
}
