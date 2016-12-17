import ch.hwz.bfas.util.KontoIDCreator;

public class Konto {
	/* Inhaber / Kontonummer / BookungNr
	 * 
	 * TODO
	 * Inhaber, Konto & Booking nummer in eine Datenbank oder Array speichern
	 * BookingNr, was ist das? Für was brauchen wir diese?
	 * 
	 * 
	 * Done:
	 * Kontonummer:
	 * 	- Txt Datei erstellt für Zählen der Kontonummer
	 * 	- Zählerfunktion eingebaut
	 */

	String vorname, nachname;
	int kontoNr, bookingNr;

	// Konstruktor
	public Konto(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.kontoNr = generateKonID();
	}

	/*public Konto(String vorname, String nachname, int kontoNr, int bookingNr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.kontoNr = generateKonID();
		this.bookingNr = bookingNr;
	}*/

	// Methode
	private int generateKonID() {
		return new KontoIDCreator().getNr();
	}

	// Get/Set
	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getKontoNr() {
		return kontoNr;
	}

	public int getBookingNr() {
		return bookingNr;
	}
}
