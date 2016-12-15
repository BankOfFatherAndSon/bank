// To Change



public class Konto {
	/*
	 * Inhaber : String Kontonummer: Int BookingNr: Int
	 */

	String vorname, nachname;
	int kontoNr, bookingNr;

	// Konstruktor
	public Konto(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.kontoNr = genKonID();
	}

	// Methode
	private int genKonID() {
		return 2;
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
