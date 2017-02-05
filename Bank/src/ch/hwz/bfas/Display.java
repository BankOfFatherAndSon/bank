package ch.hwz.bfas;

import ch.hwz.bfas.util.KundenIDCreator;

public class Display {
	public static void main(String[] args) {

		System.err.println("Dies ist ein Durchlauf, welcher alle eingabemöglichkeiten des Programms vorführen soll:");
		System.out.println();
		
		
		System.out.println("Guten Tag");
		
		// Test Kunde
		/*Kunde tKunde = new Kunde(1000, "Timi", "Osoko", "timimail", "timiadress", "0213023");
		Konto tKonto = new Konto(2001);
		Kapital tKapital = new Kapital("CHF", 4000.0, true);
			
		tKunde.addKonto(tKonto);
		tKunde.getKontoListe().get(0).addKapital(tKapital);
		
		Kunde.getKundenListe().add(tKunde);*/
		
		// Eingabe aller Informationen neu
		Kunde.kundenEingabe(); //OK!
		
		// Depot eröffnung
		Kunde.createDepot();

	

		
	}
}
