import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Setup {

		static boolean hit = true;
		static boolean miss = false;
        static int rowChoice = 0;
        static String computerBoard;

        public static void putSpacesOnBoard(){
        	for(int i = 0; i < 8; i++){
        		for(int j = 0; j < 8; j++){
        			Board.userBoard[i][j] = " ";	
        		}
        	}
        }
        
        public static String generateComputerBoard(){
            int random = (int)(Math.random()*4)+1;
         switch(random){
         case 1:
                 Board.runBoard1();
                 computerBoard = Board.board1;
                 break;
         case 2:
                 Board.runBoard2();
                 computerBoard = Board.board2;
                 break;
         case 3:
                 Board.runBoard3();
                 computerBoard = Board.board3;
                 break;
         case 4:
                 Board.runBoard4();
                 computerBoard = Board.board4;
                 break;
         case 5:
                 Board.runBoard5();
                 computerBoard = Board.board5;
                 break;
         }
        
         public static void testIdea(){
        	 for(int i = 0; i < 8; i++){
        		 for(int j = 0; j < 8; j++){
        			 System.out.println(Board.board1[i][j]);
        		 }
        		 System.out.println();
        	 }
         }
      
    }
}