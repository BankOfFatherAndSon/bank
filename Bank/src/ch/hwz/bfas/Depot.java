package ch.hwz.bfas;


public class Depot {

	int depotnummer;
	String anlagestrategie; // Instanzvariabel provisorisch, bis Rossi shit
							// kommt

	// Konstruktor
	public Depot(String anlagestrategie, int depotnummer) {
		this.anlagestrategie = anlagestrategie;
		this.depotnummer = depotnummer; // DepotnummerCreator erstellen
	}

}
