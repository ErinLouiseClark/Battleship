import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class BattleshipRunner {

	private static String boom = "Midterm/src/battleship.mp3";

	private static String uriString = new File(boom).toURI().toString();

	public static void main(String[] args) {
		new javafx.embed.swing.JFXPanel();

		System.out.println("Here is your game board.");
		Setup.putSpacesOnBoard();
		Board.userBoard();
		try {
			Thread.sleep(2000L);
		} catch (Exception e) {
		}

		Ship.fillUserBoard();
		System.out.println("Here is your game board with your ships.");
		Board.userBoard();
		Setup.generateComputerBoard();
		// I finally figured this thing out...
		try {
			Thread.sleep(2000L);
		} catch (Exception e) {
		}
		System.out.println("You will attack first.");
		System.out
				.println("Attack the computer. Enter which coordinate you would like to hit. Ex: A1.");
		try {
			Thread.sleep(2000L);
		} catch (Exception e) {
		}

		Move.attackComputer();
		try {
			Thread.sleep(2000L);
		} catch (Exception e) {
		}

	}

	public static void play() {
		try {
			new MediaPlayer(new Media(uriString)).play();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
