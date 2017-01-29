package ch.hwz.bfas;

import java.util.ArrayList;
import java.util.List;

public class Kunde {

	private String name, vorname, email, adresse, telefonnummer;
	private int kundennummer;

	private List<Konto> kontoListe = new ArrayList<Konto>();
	private List<Depot> depotListe = new ArrayList<Depot>();

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
	public void addKonto(Konto konto) {
		kontoListe.add(konto);

	}

	public void addDepot(Depot depot) {
		/* Muss programmiert werden:  Programm soll folgende Attribute auf ihre Korrektheit kontrollieren:
		 * email, adresse, telefonnummer
		 */
		
		// (OK) 2. hinzufügen des Depots
		depotListe.add(depot);

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

	
}
