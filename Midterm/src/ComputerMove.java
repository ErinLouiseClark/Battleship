
public class ComputerMove {

	

public static void computerMove(){
	
	int randomRow = (int)(Math.random()*8)-1;
	int randomCol = (int)(Math.random()*8)-1;
	if (Board.computerDisplay[randomRow][randomCol] == Board.userBoard[Board.row][Board.col]){
		System.out.println("The computer hit your ship.");
	}
	else{
		System.out.println("The computer missed your ship.");
	}
	}
}
