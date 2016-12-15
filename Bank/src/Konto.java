import ch.hwz.bfas.util.KontoIDCreator;

public class Konto {
	/*
	 * Inhaber : String
	 * Kontonummer:Int
	 * BookingNr: Int
	 */

	String vorname, nachname;
	int kontoNr, bookingNr;

	// Konstruktor
	public Konto(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.kontoNr = generateKonID();
	}

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
