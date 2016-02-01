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
		System.out.println("Attack the computer. Enter which coordinate you would like to hit. Ex: A1.");
		System.out.println("Your move.");
		Scanner userInput = new Scanner(System.in);
		String input = userInput.nextLine();
		for(int i = 1; i < input.length(); i++){
			if(input.length() > 2){
				System.out.println("Invalid space");
				attackComputer();
			}
		
		String row = input.substring(0, 1).toLowerCase();
		int col = Integer.parseInt(input.substring(1, 2))-1;
		String column = input.substring(1,2);
		
		switch (row) 
		{
		
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
			System.out.println("Invalid choice");
			attackComputer();
		}
		
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
			System.out.println("Hit");
			countC++;
		}
		if(userMove == Board.board1[1][2]){
			System.out.println("Hit");
			countC++;
		}
		if(countC == 2){
			System.out.println("You sunk the computer's Carrier!");
			counter++;
		}
		if(userMove == Board.board1[1][6]){
			System.out.println("Hit");
			countB++;
		}
		if(userMove == Board.board1[1][7]){
			System.out.println("Hit");
			countB++;
		}
		if(userMove == Board.board1[1][8]){
			System.out.println("Hit");
			countB++;
		}
		if(countB == 3){
			System.out.println("You sunk the computer's Battleship!");
			counter++;
		}
		if(userMove == Board.board1[5][3]){
			System.out.println("Hit");
			countS++;
		}
		if(userMove == Board.board1[5][4]){
			System.out.println("Hit");
			countS++;
		}
		if(userMove == Board.board1[5][5]){
			System.out.println("Hit");
			countS++;
		}
		if(userMove == Board.board1[5][6]){
			System.out.println("Hit");
			countS++;
		}
		if(countS == 4){
			System.out.println("You sunk the computer's Submarine!");
			counter++;
		}
		if(userMove == Board.board1[0][4]){
			System.out.println("Hit");
			countD++;
		}
		if(userMove == Board.board1[0][5]){
			System.out.println("Hit");
			countD++;
		}
		if(userMove == Board.board1[0][6]){
			System.out.println("Hit");
			countD++;
		}
		if(userMove == Board.board1[0][7]){
			System.out.println("Hit");
			countD++;
		}
		if(userMove == Board.board1[0][8]){
			System.out.println("Hit");
			countD++;
		}
		if(countS == 5){
			System.out.println("You sunk the compter's Destroyer!");
			counter++;
		}

		if(Setup.computerBoard == Board.board2){
			if(userMove == Board.board2[0][0]){
				System.out.println("Hit");
				countC++;
			}
			if(userMove == Board.board2[0][1]){
				System.out.println("Hit");
				countC++;
			}
			if(countC == 2){
				System.out.println("You sunk the computer's Carrier!");
				counter++;
			}
			if(userMove == Board.board2[4][0]){
				System.out.println("Hit");
				countB++;
			}
			if(userMove == Board.board2[5][0]){
				System.out.println("Hit");
				countB++;
			}
			if(userMove == Board.board2[6][0]){
				System.out.println("Hit");
				countB++;
			}
			if(countB == 3){
				System.out.println("You sunk the computer's Battleship!");
				counter++;
			}
			if(userMove == Board.board2[3][8]){
				System.out.println("Hit");
				countS++;
			}
			if(userMove == Board.board2[4][8]){
				System.out.println("Hit");
				countS++;
			}
			if(userMove == Board.board2[5][8]){
				System.out.println("Hit");
				countS++;
			}
			if(userMove == Board.board2[6][8]){
				System.out.println("Hit");
				countS++;
			}
			if(countS == 4){
				System.out.println("You sunk the computer's Submarine!");
				counter++;
			}
			if(userMove == Board.board2[8][4]){
				System.out.println("Hit");
				countD++;
			}
			if(userMove == Board.board2[8][5]){
				System.out.println("Hit");
				countD++;
			}
			if(userMove == Board.board2[8][6]){
				System.out.println("Hit");
				countD++;
			}
			if(userMove == Board.board2[8][7]){
				System.out.println("Hit");
				countD++;
			}
			if(userMove == Board.board2[8][8]){
				System.out.println("Hit");
				countD++;
			}
			if(countS == 5){
				System.out.println("You sunk the compter's Destroyer!");
				counter++;
			}
			
			if(Setup.computerBoard == Board.board3){
				if(userMove == Board.board3[2][2]){
					System.out.println("Hit");
					countC++;
				}
				if(userMove == Board.board3[2][3]){
					System.out.println("Hit");
					countC++;
				}
				if(countC == 2){
					System.out.println("You sunk the computer's Carrier!");
					counter++;
				}
				if(userMove == Board.board3[4][3]){
					System.out.println("Hit");
					countB++;
				}
				if(userMove == Board.board3[4][4]){
					System.out.println("Hit");
					countB++;
				}
				if(userMove == Board.board1[4][5]){
					System.out.println("Hit");
					countB++;
				}
				if(countB == 3){
					System.out.println("You sunk the computer's Battleship!");
					counter++;
				}
				if(userMove == Board.board3[4][3]){
					System.out.println("Hit");
					countS++;
				}
				if(userMove == Board.board3[4][4]){
					System.out.println("Hit");
					countS++;
				}
				if(userMove == Board.board3[4][5]){
					System.out.println("Hit");
					countS++;
				}
				if(userMove == Board.board3[4][6]){
					System.out.println("Hit");
					countS++;
				}
				if(countS == 4){
					System.out.println("You sunk the computer's Submarine!");
					counter++;
				}
				if(userMove == Board.board3[0][4]){
					System.out.println("Hit");
					countD++;
				}
				if(userMove == Board.board3[0][5]){
					System.out.println("Hit");
					countD++;
				}
				if(userMove == Board.board3[0][6]){
					System.out.println("Hit");
					countD++;
				}
				if(userMove == Board.board3[0][7]){
					System.out.println("Hit");
					countD++;
				}
				if(userMove == Board.board3[0][8]){
					System.out.println("Hit");
					countD++;
				}
				if(countS == 5){
					System.out.println("You sunk the compter's Destroyer!");
					counter++;
				}
				
				if(Setup.computerBoard == Board.board4){
					if(userMove == Board.board4[7][1]){
						System.out.println("Hit");
						countC++;
					}
					if(userMove == Board.board4[8][1]){
						System.out.println("Hit");
						countC++;
					}
					if(countC == 2){
						System.out.println("You sunk the computer's Carrier!");
						counter++;
					}
					if(userMove == Board.board4[2][0]){
						System.out.println("Hit");
						countB++;
					}
					if(userMove == Board.board4[3][0]){
						System.out.println("Hit");
						countB++;
					}
					if(userMove == Board.board4[4][0]){
						System.out.println("Hit");
						countB++;
					}
					if(countB == 3){
						System.out.println("You sunk the computer's Battleship!");
						counter++;
					}
					if(userMove == Board.board4[0][2]){
						System.out.println("Hit");
						countS++;
					}
					if(userMove == Board.board4[0][3]){
						System.out.println("Hit");
						countS++;
					}
					if(userMove == Board.board4[0][4]){
						System.out.println("Hit");
						countS++;
					}
					if(userMove == Board.board4[0][5]){
						System.out.println("Hit");
						countS++;
					}
					if(countS == 4){
						System.out.println("You sunk the computer's Submarine!");
						counter++;
					}
					if(userMove == Board.board4[4][4]){
						System.out.println("Hit");
						countD++;
					}
					if(userMove == Board.board4[4][5]){
						System.out.println("Hit");
						countD++;
					}
					if(userMove == Board.board4[4][6]){
						System.out.println("Hit");
						countD++;
					}
					if(userMove == Board.board4[4][7]){
						System.out.println("Hit");
						countD++;
					}
					if(userMove == Board.board4[4][8]){
						System.out.println("Hit");
						countD++;
					}
					if(countS == 5){
						System.out.println("You sunk the compter's Destroyer!");
						counter++;
					}
					if(Setup.computerBoard == Board.board5){
						if(userMove == Board.board5[6][1]){
							System.out.println("Hit");
							countC++;
						}
						if(userMove == Board.board5[7][1]){
							System.out.println("Hit");
							countC++;
						}
						if(countC == 2){
							System.out.println("You sunk the computer's Carrier!");
							counter++;
						}
						if(userMove == Board.board5[8][5]){
							System.out.println("Hit");
							countB++;
						}
						if(userMove == Board.board5[8][6]){
							System.out.println("Hit");
							countB++;
						}
						if(userMove == Board.board5[8][7]){
							System.out.println("Hit");
							countB++;
						}
						if(countB == 3){
							System.out.println("You sunk the computer's Battleship!");
							counter++;
						}
						if(userMove == Board.board5[5][4]){
							System.out.println("Hit");
							countS++;
						}
						if(userMove == Board.board5[5][5]){
							System.out.println("Hit");
							countS++;
						}
						if(userMove == Board.board5[5][6]){
							System.out.println("Hit");
							countS++;
						}
						if(userMove == Board.board5[5][7]){
							System.out.println("Hit");
							countS++;
						}
						if(countS == 4){
							System.out.println("You sunk the computer's Submarine!");
							counter++;
						}
						if(userMove == Board.board5[1][0]){
							System.out.println("Hit");
							countD++;
						}
						if(userMove == Board.board5[1][1]){
							System.out.println("Hit");
							countD++;
						}
						if(userMove == Board.board5[1][2]){
							System.out.println("Hit");
							countD++;
						}
						if(userMove == Board.board5[1][3]){
							System.out.println("Hit");
							countD++;
						}
						if(userMove == Board.board5[1][4]){
							System.out.println("Hit");
							countD++;
						}
						if(countS == 5){
							System.out.println("You sunk the compter's Destroyer!");
							counter++;
						}
						else{
							System.out.println("Miss");
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

