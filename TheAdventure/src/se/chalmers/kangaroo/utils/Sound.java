package se.chalmers.kangaroo.utils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.sound.sampled.*;

/**
 * 
 * @author ExampleDepot
 * @modifiedby pavlov
 *
 */
public class Sound{
	String fileLocation;
	Clip clip;
	private static double bgDecibel = 0.6;			// number between 0 and 1 (loudest)
	private static double sfxDecibel = 1.0;		// number between 0 and 1 (loudest)
	public Sound(){
	}
	
	
	public void play(String fileLocation, boolean isBgMusic){
		this.fileLocation = fileLocation;
		try {
		    // From file
		    AudioInputStream stream = AudioSystem.getAudioInputStream(new File(fileLocation));

		    // At present, ALAW and ULAW encodings must be converted
		    // to PCM_SIGNED before it can be played
		    AudioFormat format = stream.getFormat();
		    if (format.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
		        format = new AudioFormat(
		                AudioFormat.Encoding.PCM_SIGNED,
		                format.getSampleRate(),
		                format.getSampleSizeInBits()*2,
		                format.getChannels(),
		                format.getFrameSize()*2,
		                format.getFrameRate(),
		                true);        // big endian
		        stream = AudioSystem.getAudioInputStream(format, stream);
		    }

		    // Create the clip
		    DataLine.Info info = new DataLine.Info(
		        Clip.class, stream.getFormat(), ((int)stream.getFrameLength()*format.getFrameSize()));
		    clip = (Clip) AudioSystem.getLine(info);

		    // This method does not return until the audio file is completely loaded
		    clip.open(stream);

		} catch (MalformedURLException e) {
		} catch (IOException e) {
		} catch (LineUnavailableException e) {
		} catch (UnsupportedAudioFileException e) {
		}
		
		if(isBgMusic == true){
		    // Start looping
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		}else{
			clip.start();
		}
		
		setVolume(isBgMusic);
		
	}
	
	public void setVolume(boolean isBgMusic){
		// Set Volume
		FloatControl gainControl = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
		if(isBgMusic == true){
			gainControl.setValue((float)(Math.log(bgDecibel)/Math.log(10.0)*20.0));
		}else{
			gainControl.setValue((float)(Math.log(sfxDecibel)/Math.log(10.0)*20.0));
		}
		
	}
	
	public void setBgVolume(double decibel){
		bgDecibel = decibel;
	}

	public void setSfxVolume(double decibel){
		sfxDecibel = decibel;
	}

	public double getBgVolume(){
		return bgDecibel;
	}

	public double getSfxVolume(){
		return sfxDecibel;
	}
	
}
