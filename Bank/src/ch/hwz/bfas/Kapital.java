package ch.hwz.bfas;


public class Kapital {

	int wertKapital;
	String waehrung;
	boolean einzahlungErfolgt;

	// Konstruktor

	public Kapital(String waehrung, boolean einzahlungErfolgt) {
		wertKapital = 0;
		this.waehrung = waehrung;
		this.einzahlungErfolgt = einzahlungErfolgt;

	}

	
	// GET & SET
	public int getWertKapital() {
		return wertKapital;
	}

	public void setWertKapital(int wertKapital) {
		this.wertKapital = wertKapital;
	}

	public String getWaehrung() {
		return waehrung;
	}

	public void setWaehrung(String waehrung) {
		this.waehrung = waehrung;
	}

	public boolean isEinzahlungErfolgt() {
		return einzahlungErfolgt;
	}

	public void setEinzahlungErfolgt(boolean einzahlungErfolgt) {
		this.einzahlungErfolgt = einzahlungErfolgt;
	}
	
	
}
