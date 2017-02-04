package ch.hwz.bfas.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KundenIDCreator {
	
	// Konstruktor
	private static int nummer = 0;
	private static String txt = "KundenIDNr.txt";

	//Generiert eine KontoIDNr die fortlaufend ist
	public static void kundenIDCreator() {
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
	public static int getKundenNummer() {
		return nummer;
	}
}
