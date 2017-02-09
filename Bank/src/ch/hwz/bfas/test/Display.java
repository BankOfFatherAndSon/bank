package ch.hwz.bfas.test;

import ch.hwz.bfas.Kunde;
import ch.hwz.bfas.util.KundenIDCreator;

public class Display {
	public static void main(String[] args) {

		System.err.println("Dies ist ein Durchlauf, welcher alle eingabemöglichkeiten des Programms vorführen soll:");
		System.out.println();
		
		
		System.out.println("Guten Tag");
		
		// Test Kunde
		
		
		// Eingabe aller Informationen neu
		Kunde.kundenEingabe(); //OK!
		
		// Depot eröffnung
		Kunde.createDepot();

	

		
	}
}
