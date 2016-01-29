import java. util.ArrayList;
public class ComputerMove {

static ArrayList<String> computerMoves = new ArrayList<String>();
static String[][] computerBoard = new String[8][8];
static ArrayList<String> hits = new ArrayList<String>();
static ArrayList<String> misses = new ArrayList<String>();
static int counter = 0;

public static void computerMove(){
	
	int randomRow = (int)(Math.random()*8)-1;
	int randomCol = (int)(Math.random()*8)-1;
	String compMove = computerBoard[randomRow][randomCol];
	if(!computerBoard.contains(compMove)){
		computerBoard.add(compMove);
	}
	if (Board.computerDisplay[randomRow][randomCol] == Board.userBoard[Ship.rowChoice][Ship.column]){
		System.out.println("The computer hit your ship.");
		hits.add(compMove);
		counter++;
	}
	else{
		System.out.println("The computer missed.");
		misses.add(compMove);
	}
	if(counter == 14){
		System.out.println("The computer sunk all your ships!");
		System.out.println("YOU LOSE!");
		System.exit(0);
	}
	}
}
