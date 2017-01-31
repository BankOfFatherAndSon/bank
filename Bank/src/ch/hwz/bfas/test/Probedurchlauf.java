package ch.hwz.bfas.test;

import java.util.ArrayList;

import ch.hwz.bfas.Aktie;
import ch.hwz.bfas.AnlageuniversumDefinitiv;
import ch.hwz.bfas.AnlageuniversumDefinitiv.Anlage;
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

		AnlageuniversumDefinitiv anlageuniversumDefinitiv;

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
		Kunde testKunde = new Kunde(99, "Max", "Muster", "max.muster@gmail.com", "Musterweg 20, 8001 Z�rich",
				"076/400/20/50");
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
		System.out.println("Kundennummer: " + testKunde.getKundennummer() + " hat folgende Kontonummer: "
				+ testKonto.getKontonummer());
		System.out.println();

		// Portfolio initialisieren
		Portfolio testPortfolio = new Portfolio();

		// Anlagevorschlag
		System.err.println("Anlagevorschlag wird erstellt");
		AnlageuniversumDefinitiv testVorschlag = new AnlageuniversumDefinitiv(Anlage.A, testKunde);
		testVorschlag.setPortfolio(testPortfolio);
		
		System.out.println("Der Betrag ist sein Kontoguthaben (F�rs erste)");
		System.out.println("Kunde entscheidet sich f�r Anlageplan 'A'");
		System.out.println("Text aus Methode selection() folgt unten:");
		System.out.println();
		System.err.println("Text selection():");
		testVorschlag.selection(Anlage.A);

		System.out.println();
		System.err.println("HELLO");

		

		testVorschlag.annahme((ArrayList<String>) testVorschlag.getListGewaehlt());
		// System.out.println(testVorschlag.getListGewaehlt());

		System.out.println();

	}
}
