import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Mixer;
import java.io.*;
import sun.audio.*;

public class BattleshipRunner {

	private Clip line;
	
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

public static void play(){
	try {
		java.applet.AudioClip clip =
		java.applet.Applet.newAudioClip(
		new java.net.URL("www.youtube.com/watch?v=mJAX16YVQ3U"));
		clip.play();
		} catch (java.net.MalformedURLException murle) {
		System.out.println(murle);
		}
			
	}
}
	
		


