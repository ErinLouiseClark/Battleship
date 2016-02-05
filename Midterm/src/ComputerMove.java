public class ComputerMove {

static int counter = 0;
static int countC;
static int countB;
static int countS;
static int countD;

public static String computerMove(){
	
	try {
		Thread.sleep(2000L);
	} catch (Exception e){}	

	
	int randomRow = (int)(Math.random()*8);
	int randomCol = (int)(Math.random()*8);
	String compMove = Board.userBoard[randomRow][randomCol];
	
	if(compMove.equals("H")){
		computerMove();
	}
	if(compMove.equals(" ")){
		compMove = "M";
		System.out.println("The computer missed your ship.");
	}
	if(compMove.equals("C")){
		System.out.println("The computer hit your carrier.");
		BattleshipRunner.play();
		countC++;
		if(countC == 2){
			System.out.println("The computer sunk your carrier!");
			countC++;
			counter++;
		}
		
		compMove = "H";
	}
	if(compMove.equals("B")){
		System.out.println("The computer hit your battleship.");
		BattleshipRunner.play();
		countB++;
		if(countB == 3){
			System.out.println("The computer sunk your battleship!");
			countB++;
			counter++;
		}
		compMove = "H";
	}
	if(compMove.equals("S")){
		System.out.println("The computer hit your submarine.");
		BattleshipRunner.play();
		countS++;
		if(countS == 4){
			System.out.println("The computer sunk your submarine!");
			countS++;
			counter++;
		}
		compMove = "H";
	}
	if(compMove.equals("D")){
		System.out.println("The computer hit your destroyer.");
		BattleshipRunner.play();
		countD++;
		if(countD == 5){
			System.out.println("The computer sunk your destroyer!");
			countD++;
			counter++;
		}
		compMove = "H";
	}
	
	if(counter == 14){
		System.out.println("The computer sunk all your ships!");
		System.out.println("YOU LOSE!");
		System.exit(0);
	}
	try {
		Thread.sleep(1000L);
	} catch (Exception e){}	

	Move.attackComputer();
	
return compMove;
}
}
