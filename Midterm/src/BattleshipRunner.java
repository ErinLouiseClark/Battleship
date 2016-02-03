public class BattleshipRunner {

	static boolean user = true;
	static boolean computer = true;
	static boolean game = true;
	
	public static void main(String[] args) {
		System.out.println("Here is your game board.");
		Setup.putSpacesOnBoard();
		Board.userBoard();
		try {
			Thread.sleep(2000L);
		} catch (Exception e){}	

		Ship.fillUserBoard();
		System.out.println("Here is your game board with your ships.");
		Board.userBoard();
		Setup.generateComputerBoard();
		//I finally figured this thing out...
		try {
			Thread.sleep(2000L);
		} catch (Exception e){}	
		System.out.println("You will attack first.");
		try {
			Thread.sleep(2000L);
		} catch (Exception e){}	

		Move.attackComputer();
		try {
			Thread.sleep(2000L);
		} catch (Exception e){}	

		//playGame();
	}
	
	private static void playGame(){
	while(game){
			Move.attackComputer();
			ComputerMove.computerMove();
		}
	}
}

