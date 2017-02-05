package ch.hwz.bfas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ch.hwz.bfas.util.KontoIDCreator;
import ch.hwz.bfas.util.KundenIDCreator;

public class Kunde {

	private static String name, vorname, email, adresse, telefonnummer;
	private static int kundennummer;
	static Kunde Kunde1 = new Kunde(0, null, null, null, null, null);

	private static List<Kunde> kundenListe = new ArrayList<Kunde>();
	private List<Konto> kontoListe = new ArrayList<Konto>();
	private static List<Depot> depotListe = new ArrayList<Depot>();

	static Scanner eingabe = new Scanner(System.in);
	private static char kundenEntry;

	// Benötige Konstruktor mit allen Infos
	public Kunde(int kundennummer, String vorname, String name, String email, String adresse, String telefonnummer) {
		this.kundennummer = kundennummer;
		this.vorname = vorname;
		this.name = name;
		this.email = email;
		this.adresse = adresse;
		this.telefonnummer = telefonnummer;
	}

	// Methoden
	public void addKunde(Kunde kunde) {
		kundenListe.add(kunde);
	}
	
	public void addKonto(Konto konto) {
		kontoListe.add(konto);
	}

	public static void createDepot() {
		/*
		 * Muss programmiert werden: Programm soll folgende Attribute auf ihre
		 * Korrektheit kontrollieren: email, adresse, telefonnummer
		 */

		System.out.print("Geben Sie die Kundennummer ein: ");
		int i = eingabe.nextInt();
		
		if (kundenListe.contains(i)) {
		    System.out.println("Account found");
		} else {
		    System.out.println("Account not found");
		}
	
		
		System.out.println("Kundendatenüberprüfen");
	}
		
	public static void addDepot(Depot depot) {
		/*
		 * Muss programmiert werden: Programm soll folgende Attribute auf ihre
		 * Korrektheit kontrollieren: email, adresse, telefonnummer
		 */

		System.out.print("Geben Sie die Kundennummer ein: ");
		int i = eingabe.nextInt();
		
		if (kundenListe.contains(i)) {
		    System.out.println("Account found");
		} else {
		    System.out.println("Account not found");
		}
		
		
		System.out.println("Kundendatenüberprüfen");
		
		
		
		// (OK) 2. hinzufügen des Depots
		depotListe.add(depot);
	}

	public static void kundenEingabe() {

		// Vortext
		System.out.println("Kundennummer auswählen:");
		System.out.println("a = Auswahl | n = Neuer Kunde");
		System.out.println();
		System.out.print("Hier eingeben: ");

		// Scanner Eingabe
		kundenEntry = eingabe.next().charAt(0);
		boolean b = kundenEntry == 'a' || kundenEntry == 'n';

		// Kundennummer Eingabe
		while (b == false) {
			System.out.println();
			System.err.println("Falsche Eingabe!");
			System.out.println("'a' für Kundennummer Auswahl");
			System.out.println("'n' um neue Kundennummer anzulegen");
			System.out.println();
			System.out.print("Hier eingeben: ");
			kundenEntry = eingabe.next().charAt(0);
			b = kundenEntry == 'a' || kundenEntry == 'n';
		}

		// Auswahl Kundennummer
		if (kundenEntry == 'a') {
			// System.out.print("Geben Sie die Kundennummer ein: ");
			// int i = eingabe.next().charAt(0);
			System.err.println("Fehler: Keine Kundenummern vorhanden.");

			// TODO Kundennummer auwahl einfügen
			// int auswahlKunde = Kunde(i).getKundennummer();
			// TODO wiederholte eingabe falls falsche Kontonummer
			// kundennummer = auswahlKunde;

			// Neuer Kundennummer
		} else {
			System.out.println();
			System.out.println("Erstelle neue Kundennummer..");
			KundenIDCreator.kundenIDCreator();
			int Kundennummer1 = KundenIDCreator.getKundenNummer();
			System.out.println("Neue Kundennummer: " + Kundennummer1);
			System.out.println();

			System.out.println("Geben Sie weitere Infos ein:");
			System.out.print("Vorname: ");
			String inVorname = eingabe.next();
			System.out.print("Name: ");
			String inName = eingabe.next();
			System.out.print("Email: ");
			String inEmail = eingabe.next();
			System.out.print("Adresse: ");
			String inAdresse = eingabe.next();
			System.out.print("Telefon: ");
			String inTelefon = eingabe.next();
			System.out.println("Vielen Dank.");
			System.out.println();
			Kunde neuKunde = new Kunde(Kundennummer1, inVorname, inName, inEmail, inAdresse, inTelefon);
			Kunde1 = neuKunde;
			kundenListe.add(Kunde1);

			System.out.println("Möchten Sie gleich ein Konto dieser Kundennummer hinzufügen?");
			Kunde.frageKonto();
			
		}

	}

	public static void frageKonto(){

		System.out.println("j = Ja | n = Nein");
		System.out.println();
		System.out.print("Hier eingeben: ");
		char eingabeWahl = eingabe.next().charAt(0);
		boolean b = eingabeWahl == 'j' || eingabeWahl == 'n';

		while (b == false) {
			System.out.println();
			System.err.println("Falsche Eingabe!");
			System.out.println("'j' für Ja");
			System.out.println("'n' für Nein");
			System.out.println();
			System.out.print("Hier eingeben: ");
			eingabeWahl = eingabe.next().charAt(0);
			b = eingabeWahl == 'j' || eingabeWahl == 'n';
		}
		
		if (eingabeWahl == 'j') {
			System.out.println();
			System.err.println("Wechsle zu Kontonummerwahl..");
			Konto.kontoEingabe();
			
		} else {
			System.err.println("Programm beendet.");
		}
	}
	
	// GET UND SET

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public int getKundennummer() {
		return kundennummer;
	}

	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}

	public List<Konto> getKontoListe() {
		return kontoListe;
	}

	public void setKontoListe(List<Konto> kontoListe) {
		this.kontoListe = kontoListe;
	}

	public List<Depot> getDepotListe() {
		return depotListe;
	}

	public void setDepotListe(List<Depot> depotListe) {
		this.depotListe = depotListe;
	}

	public static List<Kunde> getKundenListe() {
		return kundenListe;
	}

	public static void setKundenListe(List<Kunde> kundenListe) {
		Kunde.kundenListe = kundenListe;
	}

	
}
