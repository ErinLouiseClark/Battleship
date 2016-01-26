import java.util.ArrayList;
import java.util.Scanner;
public class Ship {

	private String name;
	private int size;

	public Ship(int si, String na){
		size = si;
		name = na;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	static int rowChoice = 0;
	
	public static void fillUserBoard(){
		ArrayList<Ship> Ships = new ArrayList<Ship>();
		Ship carrier = new Ship(2, "Carrier");
		Ship battleship = new Ship(3, "Battleship");
		Ship submarine = new Ship(4, "Submarine");
		Ship destroyer = new Ship (5, "Destroyer");
		
		Ships.add(carrier);
		Ships.add(battleship);
		Ships.add(submarine);
		Ships.add(destroyer);
		
		int [][] setShips = new int [8][8];
		String X = " ";
		
		Scanner userInput = new Scanner(System.in);
		for(int i = 0; i < Ships.size(); i++){
			Ship ship = Ships.get(i);
			System.out.println("Your " + Ships.get(i).getName() + " takes up " + Ships.get(i).getSize() + " spaces.");
			System.out.println("Enter which " + Ships.get(i).getSize() + " contiguous coordinates you would like to place your " + Ships.get(i).getName() + ". Ex: A1. Press enter after each coordinate.");
			for(int ii = 0; ii < ship.getSize(); ii++){
				String input = userInput.nextLine();
				if(input.length() > 2){
					System.out.println("Invalid space.");
					System.exit(0);
				}
				else{
				String row = input.substring(0, 1).toLowerCase();
				int column = Integer.parseInt(input.substring(1, 2));
				int col = column-1;
							
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
					System.out.println("Invalid choice.");
					System.exit(0);
				}
			
				}
				Board.userBoard[rowChoice][col] = Ships.get(i).getName().substring(0,1).toUpperCase();				
				}

			}
	
		}
		
	}
}