package ch.hwz.bfas;


public class Kapital {

	private double wertKapital;
	private String waehrung;
	private boolean einzahlungErfolgt;
	
	
	
	// Konstruktor

	public Kapital(String waehrung, double wertKapital, boolean einzahlungErfolgt) {
		this.wertKapital = wertKapital;
		this.waehrung = waehrung;
		this.einzahlungErfolgt = einzahlungErfolgt;

	}

	//Methoden
	

	
	
	// GET & SET
	public double getWertKapital() {
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
	
	
