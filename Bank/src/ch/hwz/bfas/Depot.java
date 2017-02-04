package ch.hwz.bfas;

import java.util.ArrayList;
import java.util.List;

public class Depot {

	int depotnummer;
	private List<Portfolio> portfolioListe = new ArrayList<Portfolio>();

	// Konstruktor
	public Depot(int depotnummer) {
		this.depotnummer = depotnummer; // TODO DepotnummerCreator erstellen
	}

	// Methoden
	public void addPortfolio(Portfolio portfolio) {
		portfolioListe.add(portfolio);

	}

	// Get & Set
	public int getDepotnummer() {
		return depotnummer;
	}

	public void setDepotnummer(int depotnummer) {
		this.depotnummer = depotnummer;
	}

	public List<Portfolio> getPortfolioListe() {
		return portfolioListe;
	}

	public void setPortfolioListe(List<Portfolio> portfolioListe) {
		this.portfolioListe = portfolioListe;
	}
}
