import javax.sound.sampled.*;
import java.net.*;

public class Sound
{
 URL url;
 AudioInputStream ais;
 Clip clip;
 // simple audio file name like snick7.wav works if in same folder as this.class
 // but full filenames like /Volumes/PENDRIVE/groovy/snick7.wav don't 
 public Sound(String fn)
 {
   try
   {
    url = Sound.class.getResource(fn);
    ais = AudioSystem.getAudioInputStream(url);
    clip = AudioSystem.getClip();
    clip.open(ais);
    clip.start(); 
   } 
   catch(Exception e){e.printStackTrace();}
 }

 // one command line argument must be simple audio file name in one of the formats noted above (mp3 NOT supported)
 public static void main(String args[]) throws Exception
 {
 Sound se = new Sound(args[0]);
 }
}