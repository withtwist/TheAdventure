package se.chalmers.kangaroo.utils;

import java.io.File;
import java.util.HashMap;

import kuusisto.tinysound.Music;
import kuusisto.tinysound.Sound;
import kuusisto.tinysound.TinySound;
import se.chalmers.kangaroo.io.OptionsIO;


public class Sound2 {

	private HashMap<String, Music> musicMap;
	private HashMap<String, Sound> soundMap;
	private Music lastPlayed;
	private double bgDecibel;
	private double sfxDecibel;
	private OptionsIO io;
	private static Sound2 soundInstance;
	
	public Sound2(){
		TinySound.init();
		musicMap = new HashMap<String, Music>();
		musicMap.put("gamemusic", TinySound.loadMusic(new File("resources/music/gamemusic.WAV")));
		musicMap.put("menumusic", TinySound.loadMusic(new File("resources/music/menumusic.wav")));
		soundMap = new HashMap<String, Sound>();
		soundMap.put("jump", TinySound.loadSound(new File("resources/sfx/kangaroo_jump.WAV")));
		soundMap.put("death", TinySound.loadSound(new File("resources/sfx/kangaroo_death.WAV")));
		soundMap.put("red", TinySound.loadSound(new File("resources/sfx/redblue_red.WAV")));
		soundMap.put("blue", TinySound.loadSound(new File("resources/sfx/redblue_blue.WAV")));
		soundMap.put("creaturedeath", TinySound.loadSound(new File("resources/sfx/creature_death.WAV")));
		
		io = OptionsIO.getInstance();
		loadFromFile();
	}
	
	public static synchronized Sound2 getInstance(){
		if(soundInstance == null)
			soundInstance = new Sound2();
		return soundInstance;
	}
	
	public void playSfx(String name){
		soundMap.get(name).play(sfxDecibel);
	}
	
	public void playBgMusic(String name){
		if(lastPlayed != null)
			lastPlayed.stop();
		lastPlayed = musicMap.get(name);
		if(musicMap.containsKey(name))
			musicMap.get(name).play(true, bgDecibel);
	}
	
	public void setBgVolume(double decibel){
		bgDecibel = decibel;
		writeToFile();
	}

	public void setSfxVolume(double decibel){
		sfxDecibel = decibel;
		writeToFile();
	}

	public double getBgVolume(){
		return bgDecibel;
	}

	public double getSfxVolume(){
		return sfxDecibel;
	}
	
	private void writeToFile() {
		io.saveVolume(bgDecibel, sfxDecibel);
		loadFromFile();
	}
	
	private void loadFromFile() {
		bgDecibel = io.getBgVolume();
		sfxDecibel = io.getSfxVolume();
	}
}
