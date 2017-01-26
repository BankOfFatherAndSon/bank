package ch.hwz.bfas;

import java.util.ArrayList;
import java.util.List;

public class Depot {

	int depotnummer;
	String anlagestrategie; // Instanzvariabel provisorisch, bis Rossi shit
							// kommt
	
	private List<Portfolio> portfolioListe = new ArrayList<Portfolio>();

	// Konstruktor
	public Depot(String anlagestrategie, int depotnummer) {
		this.anlagestrategie = anlagestrategie;
		this.depotnummer = depotnummer; // DepotnummerCreator erstellen
	}

	
	// Methoden
		public void addPortfolio(Portfolio portfolio) {
			portfolioListe.add(portfolio);
}
}
