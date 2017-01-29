package ch.hwz.bfas.test;

import ch.hwz.bfas.Aktie;
import ch.hwz.bfas.AnlageuniversumDefin;
import ch.hwz.bfas.Anlagevorschlag;
import ch.hwz.bfas.Depot;
import ch.hwz.bfas.Kapital;
import ch.hwz.bfas.Konto;
import ch.hwz.bfas.Kunde;
import ch.hwz.bfas.Portfolio;
import ch.hwz.bfas.abstractPortfolio;

public class Probedurchlauf {
	public static void main(String[] args) {

		Kunde kunde;
		Konto konto;
		Kapital kapital;

		abstractPortfolio abstractPortfolio;
		Anlagevorschlag anlagevorschlag;
		Portfolio portfolio;

		Aktie aktie;

		Depot depot;

		AnlageuniversumDefin anlageuniversumDefin;

		// Kapital wird definiert
		Kapital testKapital = new Kapital("CHF", 1000.0, true);
		System.err.println(testKapital.getClass().getSimpleName() + " definiert:");
		System.out.println(testKapital.getWertKapital() + " " + testKapital.getWaehrung());
		System.out.println("Eingezahlt: " + testKapital.isEinzahlungErfolgt());
		System.out.println();

		// Konto wird definiert
		Konto testKonto = new Konto(10);
		System.err.println(testKonto.getClass().getSimpleName() + " definiert:");
		System.out.println("Kontonummer: " + testKonto.getKontonummer());
		System.out.println();

	
		// Kunde wird definiert
		Kunde testKunde = new Kunde(99, "Max", "Muster", "max.muster@gmail.com", "Musterweg 20, 8001 Zürich", "076/400/20/50");
		System.err.println("Die Infos des " + testKunde.getClass().getSimpleName() + "ns:");
		System.out.println("Kundennummer: " + testKunde.getKundennummer());
		System.out.println("Vorname: " + testKunde.getVorname());
		System.out.println("Name: " + testKunde.getName());
		System.out.println("Adresse: " + testKunde.getAdresse());
		System.out.println("Telefon: " + testKunde.getTelefonnummer());
		System.out.println("Email: " + testKunde.getEmail());
		System.out.println();
				
		
		// Kapital wird Konto zugewiesen
		testKonto.addKapital(testKapital);
		System.err.println("testKapital wird testKonto zugewiesen:");
		System.out.println("Kontonummer: " + testKonto.getKontonummer() + " hat folgenden Kontostand: "
				+ testKapital.getWertKapital() + " " + testKapital.getWaehrung());
		System.out.println();
		
		// Konto wird Kunde zugewiesen
		testKunde.addKonto(testKonto);
		System.err.println("testKonto wird testKunde zugewiesen:");
		System.out.println("Kundennummer: " + testKunde.getKundennummer() + " hat folgende Kontonummer: " + testKonto.getKontonummer());
	}
}
