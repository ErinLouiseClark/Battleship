import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Setup {

		static boolean hit = true;
		static boolean miss = false;
        static int rowChoice = 0;

        public static void putSpacesOnBoard(){
        	for(int i = 0; i < 8; i++){
        		for(int j = 0; j < 8; j++){
        			Board.userBoard[i][j] = " ";	
        		}
        	}
        }
        
        public static void generateComputerBoard(){
            int computerBoard = (int)(Math.random()*4)+1;
         switch(computerBoard){
         case 1:
                 Board.runBoard1();
         case 2:
                 Board.runBoard2();
         case 3:
                 Board.runBoard3();
         case 4:
                 Board.runBoard4();
         case 5:
                 Board.runBoard5();
         }
    }
}