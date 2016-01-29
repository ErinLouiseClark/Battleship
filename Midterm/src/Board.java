import java.util.ArrayList;
import java.util.List;

public class Board {

	public static ArrayList<String> carrier;
	public static ArrayList<String> battleship;
	public static ArrayList<String> destroyer;
	public static ArrayList<String> submarine;
	
	
	static int row = 0;
	static int col = 0;
	static String [][] computerDisplay = new String [8][8];
	static String [][] userBoard = new String [8][8];
	static String [][] board1 = {
		{"M", "M","H", "M", "M", "M", "M", "M", "M"},
		{"M", "M","H", "M", "M", "M", "H", "H", "H"},
		{"M", "M","M", "M", "M", "M", "M", "M", "M"},
		{"M", "M","M", "M", "M", "M", "M", "M", "M"},
		{"H", "M","M", "M", "M", "M", "M", "M", "M"},
		{"H", "M","M", "H", "H", "H", "H", "M", "M"},
		{"H", "M","M", "M", "M", "M", "M", "M", "M"},
		{"H", "M","M", "M", "M", "M", "M", "M", "M"},
		{"H", "M","M", "M", "M", "M", "M", "M", "M"}
		};
	
	static String [][] board2 = {
		{"H", "H", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "H"},
		{"H", "M", "M", "M", "M", "M", "M", "M", "H"},
		{"H", "M", "M", "M", "M", "M", "M", "M", "H"},
		{"H", "M", "M", "M", "M", "M", "M", "M", "H"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "H", "H", "H", "H", "H"}
		};
	static String [][] board3 = {
		{"M", "M", "M", "M", "H", "H", "H", "H", "H"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "M", "H", "H", "M", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "M", "M", "H", "H", "H", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "H", "H", "H", "H", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"}
		};
		
	static String [][] board4 = {
		{"M", "M", "H", "H", "H", "H", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"H", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"H", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"H", "M", "M", "M", "H", "H", "H", "H", "H"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "H", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "H", "M", "M", "M", "M", "M", "M", "M"}
		};
	
		static String [][] board5 = {
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"H", "H", "H", "H", "H", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "H", "H", "H", "H", "M"},
		{"M", "H", "M", "M", "H", "M", "M", "M", "M"},
		{"M", "H", "M", "M", "M", "M", "M", "M", "M"},
		{"M", "M", "M", "M", "M", "H", "H", "H", "M"}
		};
	
	public static void showComputerBoard() {
	
		System.out.println("		1		2		3		4		5		6		7		8");
		System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("A	| 	" + computerDisplay[0][0] + "	|	" + computerDisplay[0][1] + "	|	" + computerDisplay[0][2] + "	|	" + computerDisplay[0][3] + "	|	" + computerDisplay[0][4] + "	|	" + computerDisplay[0][5] + "	|	" + computerDisplay[0][6] + "	|	" + computerDisplay[0][7] + "	|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("B	| 	" + computerDisplay[1][0] + "	|	" + computerDisplay[1][1] + "	|	" + computerDisplay[1][2] + "	|	" + computerDisplay[1][3] + "	|	" + computerDisplay[1][4] + "	|	" + computerDisplay[1][5] + "	|	" + computerDisplay[1][6] + "	|	" + computerDisplay[1][7] + "	|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("C	| 	" + computerDisplay[2][0] + "	|	" + computerDisplay[2][1] + "	|	" + computerDisplay[2][2] + "	|	" + computerDisplay[2][3] + "	|	" + computerDisplay[2][4] + "	|	" + computerDisplay[2][5] + "	|	" + computerDisplay[2][6] + "	|	" + computerDisplay[2][7] + "	|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("D	| 	" + computerDisplay[3][0] + "	|	" + computerDisplay[3][1] + "	|	" + computerDisplay[3][2] + "	|	" + computerDisplay[3][3] + "	|	" + computerDisplay[3][4] + "	|	" + computerDisplay[3][5] + "	|	" + computerDisplay[3][6] + "	|	" + computerDisplay[3][7] + "	|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("E	| 	" + computerDisplay[4][0] + "	|	" + computerDisplay[4][1] + "	|	" + computerDisplay[4][2] + "	|	" + computerDisplay[4][3] + "	|	" + computerDisplay[4][4] + "	|	" + computerDisplay[4][5] + "	|	" + computerDisplay[4][6] + "	|	" + computerDisplay[4][7] + "	|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("F	| 	" + computerDisplay[5][0] + "	|	" + computerDisplay[5][1] + "	|	" + computerDisplay[5][2] + "	|	" + computerDisplay[5][3] + "	|	" + computerDisplay[5][4] + "	|	" + computerDisplay[5][5] + "	|	" + computerDisplay[5][6] + "	|	" + computerDisplay[2][7] + "	|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("G	| 	" + computerDisplay[6][0] + "	|	" + computerDisplay[6][1] + "	|	" + computerDisplay[6][2] + "	|	" + computerDisplay[6][3] + "	|	" + computerDisplay[6][4] + "	|	" + computerDisplay[6][5] + "	|	" + computerDisplay[6][6] + "	|	" + computerDisplay[2][7] + "	|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("	| 		|		|		|		|		|		|		|		|");
		System.out.println("H	| 	" + computerDisplay[7][0] + "	|	" + computerDisplay[7][1] + "	|	" + computerDisplay[7][2] + "	|	" + computerDisplay[7][3] + "	|	" + computerDisplay[7][4] + "	|	" + computerDisplay[7][5] + "	|	" + computerDisplay[7][6] + "	|	" + computerDisplay[7][7] + "	|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	|		|		|		|		|		|		|		|		|");
		System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	}
	
public static void userBoard(){
	System.out.println("		1		2		3		4		5		6		7		8");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("A	| 	" + userBoard[0][0] + "	|	" + userBoard[0][1] + "	|	" + userBoard[0][2] + "	|	" + userBoard[0][3] + "	|	" + userBoard[0][4] + "	|	" + userBoard[0][5] + "	|	" + userBoard[0][6] + "	|	" + userBoard[0][7] + "	|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("B	| 	" + userBoard[1][0] + "	|	" + userBoard[1][1] + "	|	" + userBoard[1][2] + "	|	" + userBoard[1][3] + "	|	" + userBoard[1][4] + "	|	" + userBoard[1][5] + "	|	" + userBoard[1][6] + "	|	" + userBoard[1][7] + "	|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("C	| 	" + userBoard[2][0] + "	|	" + userBoard[2][1] + "	|	" + userBoard[2][2] + "	|	" + userBoard[2][3] + "	|	" + userBoard[2][4] + "	|	" + userBoard[2][5] + "	|	" + userBoard[2][6] + "	|	" + userBoard[2][7] + "	|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("D	| 	" + userBoard[3][0] + "	|	" + userBoard[3][1] + "	|	" + userBoard[3][2] + "	|	" + userBoard[3][3] + "	|	" + userBoard[3][4] + "	|	" + userBoard[3][5] + "	|	" + userBoard[3][6] + "	|	" + userBoard[3][7] + "	|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("E	| 	" + userBoard[4][0] + "	|	" + userBoard[4][1] + "	|	" + userBoard[4][2] + "	|	" + userBoard[4][3] + "	|	" + userBoard[4][4] + "	|	" + userBoard[4][5] + "	|	" + userBoard[4][6] + "	|	" + userBoard[4][7] + "	|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("F	| 	" + userBoard[5][0] + "	|	" + userBoard[5][1] + "	|	" + userBoard[5][2] + "	|	" + userBoard[5][3] + "	|	" + userBoard[5][4] + "	|	" + userBoard[5][5] + "	|	" + userBoard[5][6] + "	|	" + userBoard[2][7] + "	|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("G	| 	" + userBoard[6][0] + "	|	" + userBoard[6][1] + "	|	" + userBoard[6][2] + "	|	" + userBoard[6][3] + "	|	" + userBoard[6][4] + "	|	" + userBoard[6][5] + "	|	" + userBoard[6][6] + "	|	" + userBoard[2][7] + "	|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("	| 		|		|		|		|		|		|		|		|");
	System.out.println("H	| 	" + userBoard[7][0] + "	|	" + userBoard[7][1] + "	|	" + userBoard[7][2] + "	|	" + userBoard[7][3] + "	|	" + userBoard[7][4] + "	|	" + userBoard[7][5] + "	|	" + userBoard[7][6] + "	|	" + userBoard[7][7] + "	|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	|		|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
}
	
public static void emptyBoard(){
	
	System.out.println("		1		2		3		4		5		6		7		8");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("A	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("B	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("C	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("D	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("E	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("F	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("G	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("H	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	|	 	|		|		|		|		|		|		|		|");
	System.out.println("	---------------------------------------------------------------------------------------------------------------------------------");
	}
}