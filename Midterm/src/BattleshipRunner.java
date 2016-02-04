import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
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
		System.out.println("Attack the computer. Enter which coordinate you would like to hit. Ex: A1.");
		try {
			Thread.sleep(2000L);
		} catch (Exception e){}	

		Move.attackComputer();
		try {
			Thread.sleep(2000L);
		} catch (Exception e){}	

	}
	
	public static void playSound(){
		try{
			AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(this.getClass().getResource("/resources/ExplosionSound.mp3"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start( );
     }
    catch(Exception ex)
    {  }
	
	}
		}
	}
}

