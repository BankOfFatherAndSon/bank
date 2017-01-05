package ch.hwz.fbas;

import java.util.ArrayList;
import java.util.List;

public class Konto {

	private int kontoNr;

	private List<Kapital> kapitalListe = new ArrayList<Kapital>();
	
	
	// Methoden
	public void addKapital(Kapital kapital1) {
		kapitalListe.add(kapital1);

	}

	// SET GET
	public int getKontonummer() {
		return kontoNr;
	}

	public void setKontonummer(int kontonummer) {
		this.kontoNr = kontonummer;
	}

}
