package ch.hwz.bfas;

import ch.hwz.bfas.util.KundenIDCreator;

public class Display {
	public static void main(String[] args) {

		System.err.println("Dies ist ein Durchlauf, welcher alle eingabem�glichkeiten des Programms vorf�hren soll:");
		System.out.println();
		
		
		System.out.println("Guten Tag");
		
		// Test Kunde
		
		
		// Eingabe aller Informationen neu
		Kunde.kundenEingabe(); //OK!
		
		// Depot er�ffnung
		Kunde.createDepot();

	

		
	}
}
