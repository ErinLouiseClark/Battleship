public class BattleshipRunner {

	public static void main(String[] args) {
		System.out.println("Here is your game board.");
		Board.emptyBoard();
		Setup.putSpacesOnBoard();
		Board.userBoard();
		Ship.fillUserBoard();
		System.out.println("Here is your game board with your ships.");
		Board.userBoard();
		Board.emptyBoard();
		Setup.generateComputerBoard();
		//I finally figured this thing out..
		playGame();
	}
	
	private void playGame(){
		while(true){
			Move.attackComputer();
			ComputerMove.computerMove();
		}
	}

}