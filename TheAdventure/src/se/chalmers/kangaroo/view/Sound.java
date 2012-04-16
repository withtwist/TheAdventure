package se.chalmers.kangaroo.view;

import java.io.*;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;
/**
 * A class for playing sound in the background.
 * @author LouwHopley
 * @modified simonal
 */
public class Sound implements Runnable
{
        String fileLocation;
        public Sound(String fileLocation) {
        	this.fileLocation = fileLocation;
        }
        public void play()
        {
                Thread t = new Thread(this);
                t.start();
        }
    public void run ()
    {
    	while(true) {
            playSound(fileLocation);
    	}

    }
        private void playSound(String fileName)
        {
                File    soundFile = new File(fileName);
                AudioInputStream        audioInputStream = null;
                try
                {
                        audioInputStream = AudioSystem.getAudioInputStream(soundFile);
                }
                catch (Exception e)
                {
                        e.printStackTrace();
                }
                AudioFormat     audioFormat = audioInputStream.getFormat();
                SourceDataLine  line = null;
                DataLine.Info   info = new DataLine.Info(SourceDataLine.class,audioFormat);
                try
                {
                        line = (SourceDataLine) AudioSystem.getLine(info);
                        line.open(audioFormat);
                }
                catch (LineUnavailableException e)
                {
                        e.printStackTrace();
                }
                catch (Exception e)
                {
                        e.printStackTrace();
                }
                if (line != null) {
                    line.start();                	
                } else {
                	JOptionPane.showMessageDialog(null, "Error in sound, call Grubla");
                }

                int     nBytesRead = 0;
                byte[]  abData = new byte[128000];
                while (nBytesRead != -1)
                {
                        try
                        {
                                nBytesRead = audioInputStream.read(abData, 0, abData.length);
                        }
                        catch (IOException e)
                        {
                                e.printStackTrace();
                        }
                        if (nBytesRead >= 0)
                        {
                                int     nBytesWritten = line.write(abData, 0, nBytesRead);
                        }
                }
                line.drain();
                line.close();
        }
}
