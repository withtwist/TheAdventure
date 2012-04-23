package se.chalmers.kangaroo.io;

import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

import se.chalmers.kangaroo.controller.CustomKeys;

public class CustomKeysIO {
	private static CustomKeysIO instance;
	private static CustomKeys ck;
	private static int[] keys = new int[4];
	private static final String FILE_NAME = "/resources/customkeys.txt";

	private CustomKeysIO() {
		try {
			InputStream in = new FileInputStream(FILE_NAME);
			Scanner sc = new Scanner(in);
			ck = CustomKeys.getInstance();
			while (sc.hasNext()) {
				int i = 0;
				keys[i] = Integer.parseInt(sc.nextLine());
				i++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("No such file exists xD");
		}
	}

	public static CustomKeysIO getInstance() {
		return instance;
	}

	public static int[] getKeys() {
		return keys;
	}

	public static void setKeys(int[] key) {
		try {
			Writer w = new FileWriter(FILE_NAME);
			for (int i = 0; i < key.length + 3; i += 2) {
				w.write(key[i]+"\\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("There is no such file o_O");
		} catch (IOException e) {
			System.out.println("Something went wrong with the io");
		}
	}

}
