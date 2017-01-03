package ch.hwz.fbas;

public class Kunde {
	/* 
	 * getVorname, getNachname, getKontonummer
	 * kundenID, adresse, telefonnummer, email
	 */

	String adresse, email, getVorname, getNachname;
	int kundennummer, kundenID, Kontonummer;
	double telefonnummer;

	// Konstruktor
		public Kunde(String vorname, String nachname, int kontonummer, String adresse, String email, int kundennummer, int kundenID, double telefonnummer) {
			super ();
			this.adresse = adresse;
			this.email = email;
			this.kundennummer = kundennummer;
			this.kundenID = kundenID;
			this.telefonnummer = telefonnummer;
		}
	
	// Methoden
	/*
	 * - Depot eröffnen ()
	 * - Kriterien anpassen ()
	 * - Kriterien festlegen ()
	 * - Kapital anpassen ()
	 */

}
