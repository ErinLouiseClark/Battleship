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
	static String coordinate = attackComputer();
	static String sink = sinkShip(coordinate);
	
	
	public static String attackComputer(){
		int [][] hitComputer = new int [8][8];
		System.out.println("You will attack first.");
		System.out.println("Attack the computer. Enter which coordinate you would like to hit. Ex: A1.");
		System.out.println("Your move.");
		Scanner userInput = new Scanner(System.in);
		String input = userInput.nextLine();
		for(int i = 1; i < input.length(); i++){
			if(input.length() > 2){
				System.out.println("Invalid space");
			}
		
		String row = input.substring(0, 1).toLowerCase();
		int col = Integer.parseInt(input.substring(1, 2))-1;
		String column = input.substring(1,2);
		
		switch (row) 
		{
		
		case "a":
		{
			rowChoice = 0;
		}
		
		case "b":
		{
			rowChoice = 1;
		}
		
		case "c":
		{
			rowChoice = 2;
		}
		case "d":
		{
			rowChoice = 3;
		}
		
		case "e":
		{
			rowChoice = 4;
		}
		case "f":
		{
			rowChoice = 5;
		}
		case "g":
		{
			rowChoice = 6;
		}
		case "h":
		{
			rowChoice = 7;
		}
		default:
		{
			System.out.println("Invalid choice");
		}
		String coordinate = rowChoice + column;
		
		if(Setup.computerBoard[rowChoice][col]== "M"){
			System.out.println("Miss");
			}
		else{
			System.out.println("Hit");
			}
		}	
	}
		return coordinate;
}


	public static String sinkShip(String userMove){
	if(Setup.computerBoard == Board.board1){
		if(userMove == Board.board1[0][2]){
			countC++;
		}
		if(userMove == Board.board1[1][2]){
			countC++;
		}
		if(countC == 2){
			System.out.println("You sunk the computer's Carrier!");
			counter++;
		}
		if(userMove == Board.board1[1][6]){
			countB++;
		}
		if(userMove == Board.board1[1][7]){
			countB++;
		}
		if(userMove == Board.board1[1][8]){
			countB++;
		}
		if(countB == 3){
			System.out.println("You sunk the computer's Battleship!");
			counter++;
		}
		if(userMove == Board.board1[5][3]){
			countS++;
		}
		if(userMove == Board.board1[5][4]){
			countS++;
		}
		if(userMove == Board.board1[5][5]){
			countS++;
		}
		if(userMove == Board.board1[5][6]){
			countS++;
		}
		if(countS == 4){
			System.out.println("You sunk the computer's Submarine!");
			counter++;
		}
		if(userMove == Board.board1[0][4]){
			countD++;
		}
		if(userMove == Board.board1[0][5]){
			countD++;
		}
		if(userMove == Board.board1[0][6]){
			countD++;
		}
		if(userMove == Board.board1[0][7]){
			countD++;
		}
		if(userMove == Board.board1[0][8]){
			countD++;
		}
		if(countS == 5){
			System.out.println("You sunk the compter's Destroyer!");
			counter++;
		}

		if(Setup.computerBoard == Board.board2){
			if(userMove == Board.board2[0][0]){
				countC++;
			}
			if(userMove == Board.board2[0][1]){
				countC++;
			}
			if(countC == 2){
				System.out.println("You sunk the computer's Carrier!");
				counter++;
			}
			if(userMove == Board.board2[4][0]){
				countB++;
			}
			if(userMove == Board.board2[5][0]){
				countB++;
			}
			if(userMove == Board.board2[6][0]){
				countB++;
			}
			if(countB == 3){
				System.out.println("You sunk the computer's Battleship!");
				counter++;
			}
			if(userMove == Board.board2[3][8]){
				countS++;
			}
			if(userMove == Board.board2[4][8]){
				countS++;
			}
			if(userMove == Board.board2[5][8]){
				countS++;
			}
			if(userMove == Board.board2[6][8]){
				countS++;
			}
			if(countS == 4){
				System.out.println("You sunk the computer's Submarine!");
				counter++;
			}
			if(userMove == Board.board2[8][4]){
				countD++;
			}
			if(userMove == Board.board2[8][5]){
				countD++;
			}
			if(userMove == Board.board2[8][6]){
				countD++;
			}
			if(userMove == Board.board2[8][7]){
				countD++;
			}
			if(userMove == Board.board2[8][8]){
				countD++;
			}
			if(countS == 5){
				System.out.println("You sunk the compter's Destroyer!");
				counter++;
			}
			
			if(Setup.computerBoard == Board.board3){
				if(userMove == Board.board3[2][2]){
					countC++;
				}
				if(userMove == Board.board3[2][3]){
					countC++;
				}
				if(countC == 2){
					System.out.println("You sunk the computer's Carrier!");
					counter++;
				}
				if(userMove == Board.board3[4][3]){
					countB++;
				}
				if(userMove == Board.board3[4][4]){
					countB++;
				}
				if(userMove == Board.board1[4][5]){
					countB++;
				}
				if(countB == 3){
					System.out.println("You sunk the computer's Battleship!");
					counter++;
				}
				if(userMove == Board.board3[4][3]){
					countS++;
				}
				if(userMove == Board.board3[4][4]){
					countS++;
				}
				if(userMove == Board.board3[4][5]){
					countS++;
				}
				if(userMove == Board.board3[4][6]){
					countS++;
				}
				if(countS == 4){
					System.out.println("You sunk the computer's Submarine!");
					counter++;
				}
				if(userMove == Board.board3[0][4]){
					countD++;
				}
				if(userMove == Board.board3[0][5]){
					countD++;
				}
				if(userMove == Board.board3[0][6]){
					countD++;
				}
				if(userMove == Board.board3[0][7]){
					countD++;
				}
				if(userMove == Board.board3[0][8]){
					countD++;
				}
				if(countS == 5){
					System.out.println("You sunk the compter's Destroyer!");
					counter++;
				}
				
				if(Setup.computerBoard == Board.board4){
					if(userMove == Board.board4[7][1]){
						countC++;
					}
					if(userMove == Board.board4[8][1]){
						countC++;
					}
					if(countC == 2){
						System.out.println("You sunk the computer's Carrier!");
						counter++;
					}
					if(userMove == Board.board4[2][0]){
						countB++;
					}
					if(userMove == Board.board4[3][0]){
						countB++;
					}
					if(userMove == Board.board4[4][0]){
						countB++;
					}
					if(countB == 3){
						System.out.println("You sunk the computer's Battleship!");
						counter++;
					}
					if(userMove == Board.board4[0][2]){
						countS++;
					}
					if(userMove == Board.board4[0][3]){
						countS++;
					}
					if(userMove == Board.board4[0][4]){
						countS++;
					}
					if(userMove == Board.board4[0][5]){
						countS++;
					}
					if(countS == 4){
						System.out.println("You sunk the computer's Submarine!");
						counter++;
					}
					if(userMove == Board.board4[4][4]){
						countD++;
					}
					if(userMove == Board.board4[4][5]){
						countD++;
					}
					if(userMove == Board.board4[4][6]){
						countD++;
					}
					if(userMove == Board.board4[4][7]){
						countD++;
					}
					if(userMove == Board.board4[4][8]){
						countD++;
					}
					if(countS == 5){
						System.out.println("You sunk the compter's Destroyer!");
						counter++;
					}
					
					if(Setup.computerBoard == Board.board5){
						if(userMove == Board.board5[6][1]){
							countC++;
						}
						if(userMove == Board.board5[7][1]){
							countC++;
						}
						if(countC == 2){
							System.out.println("You sunk the computer's Carrier!");
							counter++;
						}
						if(userMove == Board.board5[8][5]){
							countB++;
						}
						if(userMove == Board.board5[8][6]){
							countB++;
						}
						if(userMove == Board.board5[8][7]){
							countB++;
						}
						if(countB == 3){
							System.out.println("You sunk the computer's Battleship!");
							counter++;
						}
						if(userMove == Board.board5[5][4]){
							countS++;
						}
						if(userMove == Board.board5[5][5]){
							countS++;
						}
						if(userMove == Board.board5[5][6]){
							countS++;
						}
						if(userMove == Board.board5[5][7]){
							countS++;
						}
						if(countS == 4){
							System.out.println("You sunk the computer's Submarine!");
							counter++;
						}
						if(userMove == Board.board5[1][0]){
							countD++;
						}
						if(userMove == Board.board5[1][1]){
							countD++;
						}
						if(userMove == Board.board5[1][2]){
							countD++;
						}
						if(userMove == Board.board5[1][3]){
							countD++;
						}
						if(userMove == Board.board5[1][4]){
							countD++;
						}
						if(countS == 5){
							System.out.println("You sunk the compter's Destroyer!");
							counter++;
						}
						
		if(counter == 4){
			System.out.println("You sunk all of the computer's ships!");
			System.out.println("YOU WIN!");
			System.exit(0);
		}	
		}	
		
	}
}
}
}
	return coordinate;
}
}

