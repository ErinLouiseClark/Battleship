public class BattleshipRunner {

	static boolean user = true;
	static boolean computer = true;
	static boolean game = true;
	
	public static void main(String[] args) {
		System.out.println("Here is your game board.");
		Setup.putSpacesOnBoard();
		Board.userBoard();
		Ship.fillUserBoard();
		System.out.println("Here is your game board with your ships.");
		Board.userBoard();
		Setup.generateComputerBoard();
		//I finally figured this thing out..
		System.out.println("You will attack first.");
		Move.attackComputer();
		//playGame();
	}
	
	private static void playGame(){
	while(game){
			Move.attackComputer();
			ComputerMove.computerMove();
		}
	}
}

