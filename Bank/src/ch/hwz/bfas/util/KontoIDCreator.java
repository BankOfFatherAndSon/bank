package ch.hwz.bfas.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KontoIDCreator {
	/*
	 * text öffnen id kunde zuweisen kontonr + 1 speichern chliessen
	 */

	// Konstruktor
	private int nummer = 0;
	private String txt = "KontoIDNr.txt";

	//Generiert eine KontoIDNr die fortlaufend ist
	public KontoIDCreator() {
		try {
			FileReader fr = new FileReader(txt);
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			fr.close();
			nummer = Integer.parseInt(s.toString());
			nummer++;
			
			FileWriter wr = new FileWriter(txt);
			wr.write(String.valueOf(nummer));
			wr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Get/Set
	public int getNr() {
		return nummer;
	}

}
