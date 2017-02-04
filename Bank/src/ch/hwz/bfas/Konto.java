package ch.hwz.bfas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ch.hwz.bfas.util.KontoIDCreator;
import ch.hwz.bfas.util.KundenIDCreator;

public class Konto {

	KontoIDCreator ID = new KontoIDCreator();
	private static int kontoNr;
	private List<Kapital> kapitalListe = new ArrayList<Kapital>();
	static Konto Konto1 = new Konto(0);

	static Scanner eingabe = new Scanner(System.in);
	private static char kontoEntry;

	// Konstruktor
	public Konto(int kontoNr) {
		this.kontoNr = kontoNr;
	}

	// Methoden
	public void addKapital(Kapital kapital1) {
		kapitalListe.add(kapital1);
	}

	public static void kontoEingabe() {

		// Vortext
		System.out.println("Kontonummer auswählen:");
		System.out.println("a = Auswahl | n = Neue Kontonummer");
		System.out.println();
		System.out.print("Hier eingeben: ");

		kontoEntry = eingabe.next().charAt(0);
		boolean b = kontoEntry == 'a' || kontoEntry == 'n';

		// Kontonummer Eingabe
		while (b == false) {
			System.out.println();
			System.err.println("Falsche Eingabe!");
			System.out.println("'a' für Kontonummer Auswahl");
			System.out.println("'n' um neue Kontonummer anzulegen");
			System.out.println();
			System.out.print("Hier eingeben: ");
			kontoEntry = eingabe.next().charAt(0);
			b = kontoEntry == 'a' || kontoEntry == 'n';
		}

		// Auswahl Kontonummer
		if (kontoEntry == 'a') {
			System.out.print("Geben Sie die Kontonummer ein: ");
			System.err.println("Fehler: Keine Kontonummern vorhanden.");

			// TODO Kundennummer auwahl einfügen
			// int i = eingabe.nextInt();
			// int auswahlKonto = new Konto(i).getKontonummer();
			// TODO wiederholte eingabe fals falsche Kontonummer
			// kontoNr = auswahlKonto;

			// Neue Kontonummer
		} else {
			System.out.println();
			System.out.println("Erstelle neue Kontonummer..");
			KontoIDCreator.kontoIDCreator();
			int Kontonummer1 = KontoIDCreator.getKontoNummer();
			
			Konto neuKonto = new Konto(Kontonummer1);
			Konto1 = neuKonto;
			System.out.println("Neue Kontonummer: " + Kontonummer1);
			System.out.println();
			
			// Zuweisung von Konto an Kunde
			Kunde.Kunde1.addKonto(Konto1);
			
			System.out.println("Möchten Sie gleich ein Kapital dieser Kontonummer hinzufügen?");
			Konto.frageKapital();
			
		}}

		public static void frageKapital(){

			System.out.println("j = Ja | n = Nein");
			System.out.println();
			System.out.print("Hier eingeben: ");
			char eingabeWahl = eingabe.next().charAt(0);
			boolean b2 = eingabeWahl == 'j' || eingabeWahl == 'n';

			while (b2 == false) {
				System.out.println();
				System.err.println("Falsche Eingabe!");
				System.out.println("'j' für Ja");
				System.out.println("'n' für Nein");
				System.out.println();
				System.out.print("Hier eingeben: ");
				eingabeWahl = eingabe.next().charAt(0);
				b2 = eingabeWahl == 'j' || eingabeWahl == 'n';
			}
			
			if (eingabeWahl == 'j') {
				System.out.println();
				System.err.println("Wechsle zu Kapitaleingabe..");
				
				//Währung Eingabe
				System.out.print("Währung eingeben: ");
				String inWaehrung = eingabe.next();
				
				//Kapital Eingabe
				System.out.println();
				System.out.println("Kapital eingeben (Mit Punkt)");
				System.out.println("Beispiel: 1000.0");
				System.out.print("Hier eingeben: ");
				double inKapital = eingabe.nextDouble();
				System.out.println();
				//TODO wenn nicht double nochmal eingabe anstatt fehler
				
				//Einzahlung erfolgt Eingabe
				System.out.println("Einzahlung definitiv erfolgt?");
				boolean inEinzahlung = false;
				System.out.println("j = Ja | n = Nein");
				System.out.println();
				System.out.print("Hier eingeben: ");
				char einzahlungWahl = eingabe.next().charAt(0);
				boolean b3 = einzahlungWahl == 'j' || einzahlungWahl == 'n';

				while (b3 == false) {
					System.out.println();
					System.err.println("Falsche Eingabe!");
					System.out.println("'j' für Ja");
					System.out.println("'n' für Nein");
					System.out.println();
					System.out.print("Hier eingeben: ");
					einzahlungWahl = eingabe.next().charAt(0);
					b3 = einzahlungWahl == 'j' || eingabeWahl == 'n';
				}
				
				if (einzahlungWahl == 'j' ) {
					inEinzahlung = true;
					
				}
				// Kapital wird Instanziert und dem Konto hinzugefügt
				Kapital Kapital1 = new Kapital(inWaehrung, inKapital, inEinzahlung);
				Konto1.addKapital(Kapital1);
				
				System.out.println("Kapital wurde erfasst.");
				
			} else {
				System.err.println("Programm beendet.");
			}
		}
		
	

	// SET GET
	public int getKontonummer() {
		return kontoNr;
	}

	public void setKontonummer(int kontonummer) {
		this.kontoNr = kontonummer;
	}

	public List<Kapital> getKapitalListe() {
		return kapitalListe;
	}

	public void setKapitalListe(List<Kapital> kapitalListe) {
		this.kapitalListe = kapitalListe;
	}

}
