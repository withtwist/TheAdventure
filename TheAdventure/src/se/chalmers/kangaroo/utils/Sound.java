package se.chalmers.kangaroo.utils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import se.chalmers.kangaroo.io.OptionsIO;

/**
 * 
 * @author ExampleDepot
 * @modifiedby pavlov
 *
 */
public class Sound{
	String fileLocation;
	Clip clip;
	private static OptionsIO io;
	private static double bgDecibel = 0.6;			// number between 0 and 1 (loudest)
	private static double sfxDecibel = 1.0;		// number between 0 and 1 (loudest)
	
	public Sound(){
		io = OptionsIO.getInstance();
		loadFromFile();
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
//		        format = new AudioFormat(
//		                AudioFormat.Encoding.PCM_SIGNED,
//		                format.getSampleRate(),
//		                format.getSampleSizeInBits()*2,
//		                format.getChannels(),
//		                format.getFrameSize()*2,
//		                format.getFrameRate(),
//		                true);        // big endian
//		        stream = AudioSystem.getAudioInputStream(format, stream);
		    }
		    // Create the clip
		    DataLine.Info info = new DataLine.Info(
		        Clip.class, stream.getFormat(), ((int)stream.getFrameLength()*format.getFrameSize()));
		    if(AudioSystem.isLineSupported(info)){
		    	clip = (Clip) AudioSystem.getLine(info);

		    // This method does not return until the audio file is completely loaded
		    clip.open(stream);
		    }
		} catch (MalformedURLException e) {
		} catch (IOException e) {
		} catch (LineUnavailableException e) {
		} catch (UnsupportedAudioFileException e) {
		}
		
		if(isBgMusic == true){
		    // Start looping
			if(clip != null)
				clip.loop(Clip.LOOP_CONTINUOUSLY);
		}else{
			if(clip != null)
				clip.start();
		}
		
		setVolume(isBgMusic);
		
	}
	
	public void stop(){
		if(clip != null)
			clip.stop();
	}
	
	public void setVolume(boolean isBgMusic){
		// Set Volume
		if(clip != null){
			FloatControl gainControl = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
		if(isBgMusic == true){
			gainControl.setValue((float)(Math.log(bgDecibel)/Math.log(10.0)*20.0));
		}else{
			gainControl.setValue((float)(Math.log(sfxDecibel)/Math.log(10.0)*20.0));
		}
		}
	}
	
	public static void setBgVolume(double decibel){
		bgDecibel = decibel;
		writeToFile();
	}

	public static void setSfxVolume(double decibel){
		sfxDecibel = decibel;
		writeToFile();
	}

	public double getBgVolume(){
		return bgDecibel;
	}

	public double getSfxVolume(){
		return sfxDecibel;
	}
	
	private static void writeToFile() {
		io.saveVolume(bgDecibel, sfxDecibel);
		loadFromFile();
	}
	
	private static void loadFromFile() {
		bgDecibel = io.getBgVolume();
		sfxDecibel = io.getSfxVolume();
	}
	
}
