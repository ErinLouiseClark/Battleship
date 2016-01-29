import java. util.ArrayList;
public class ComputerMove {

ArrayList<String> computerMoves = new ArrayList<String>();
ArrayList<String> hits = new ArrayList<String>();
ArrayList<String> misses = new ArrayList<String>();
int counter = 0;

public static void computerMove(){
	
	int randomRow = (int)(Math.random()*8)-1;
	int randomCol = (int)(Math.random()*8)-1;
	String compMove = randomRow + randomCol;
	if(!computerMoves.contains(compMove)){
		computerMoves.add(compMove);
	}
	if (Board.computerDisplay[randomRow][randomCol] == Ship.userList[Ship.rowChoice][Ship.col]){
		System.out.println("The computer hit your ship.");
		hits.add(compMove);
		counter++:
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
