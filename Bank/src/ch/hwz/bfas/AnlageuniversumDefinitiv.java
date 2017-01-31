package ch.hwz.bfas;

import java.util.ArrayList;
import java.util.List;

public class AnlageuniversumDefinitiv {

	public enum Anlage {
		A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z

	}

	private ArrayList<String> listGewaehlt = new ArrayList<String>();
	char buchstabe;
	private Portfolio portfolio;
	Anlage anlage;
	Kunde kunde;
	boolean einverstanden = false;

	// Konstruktor
	public AnlageuniversumDefinitiv(Anlage anlage, Kunde kunde) {
		this.anlage = anlage;
		this.kunde = kunde;
	}

	public void einverstanden(boolean einverstanden){
	this.einverstanden = einverstanden;
	
	// TODO einstellen dass der Klient ausw�hlen kann aber im Moment immer einverstanden
	einverstanden = true;
	
	
	if (einverstanden = true) {
		System.out.println("braucht es diese Methode noch? einverstanden()");
		annahme(listGewaehlt);
		
	} else {
		// TODO Hier m�sste nicht direkt auf anlage sonder auf auswahl des Kapitals f�r selection verwiesen werden
		selection(anlage);
	}
	
	}
	
	
	public void selection(Anlage anlage) {

		switch (anlage) {
		case A:

			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'A';

			break;


		case B:

			listGewaehlt.add("BAYN");
			listGewaehlt.add("BNP");
			listGewaehlt.add("BSD2");
			listGewaehlt.add("BMW");

			buchstabe = 'B';

			break;

		case C:
			listGewaehlt.add("CSGN");
			listGewaehlt.add("CRG");
			listGewaehlt.add("ADEN"); // To add
			listGewaehlt.add("ASCN"); // to ad

			buchstabe = 'C';
			break;

		case D:
			listGewaehlt.add("DAI");
			listGewaehlt.add("DBK");
			listGewaehlt.add("BSN");
			listGewaehlt.add("DTE");

			buchstabe = 'D';
			break;

		case E:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'E';
			break;

		case F:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'F';
			break;

		case G:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'G';
			break;

		case H:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'H';
			break;

		case I:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'I';
			break;

		case J:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'J';
			break;

		case K:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'K';
			break;

		case L:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'L';
			break;

		case M:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'M';
			break;

		case N:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'N';
			break;

		case O:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'O';
			break;

		case P:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'P';
			break;

		case Q:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'Q';
			break;

		case R:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'R';
			break;

		case S:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'S';
			break;

		case T:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'T';
			break;

		case U:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'U';
			break;

		case V:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'V';
			break;

		case W:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'W';
			break;

		case X:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'X';
			break;

		case Y:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'Y';
			break;

		case Z:
			listGewaehlt.add("ABBN");
			listGewaehlt.add("ATLN");
			listGewaehlt.add("ADEN");
			listGewaehlt.add("ASCN");

			buchstabe = 'Z';
			break;
		default:
			break;
		}

		System.out.println("Sie haben sich f�r Anlagestrategie '" + buchstabe + "' entschieden");
		System.out.println("Dies beinhaltet folgende Aktien: " + listGewaehlt);
		System.out.println("Der Betrag f�r 1 Aktienpaket ist: [KOSTEN]");
		System.out.println();
		System.out.println("Unser Vorschlag:");
		System.out.println("[MODULO] Mal das Aktienpaket '" + buchstabe + "'");

		System.out.println();
		System.out.println("Total Kosten Aktien: " + "[KOSTEN]*[MODULO]");
		System.out.println("Ihr zur verf�gung stehendes Kapital: "
				+ kunde.getKontoListe().get(0).getKapitalListe().get(0).getWaehrung() + " "
				+ kunde.getKontoListe().get(0).getKapitalListe().get(0).getWertKapital());
		System.out.println(
				"Restbetrag auf Ihrem Konto nach Transaktion: " + "[getW�hrung + getKontostand] - [KOSTEN]*[MODULO]");

		System.out.println();
		System.out.println("Einverstanden?");
		einverstanden(einverstanden);
		
		
		
		// Summe des Preises der Aktien in diesem Array ausrechnen
		// TODO vielleicht String to Int

		// Ausrechnen wieviel mal ein GANZES Paket in unserem Kapital Platz hat
		// // Modulo %
		// TODO modulo = getWertKapitalTest %
		// anlageuniversumDefin.getGewaehlteListe(); // <- getWert int | anla
		// stringlist

	}

	public void annahme(ArrayList<String> listGewaehlt){
		this.listGewaehlt = listGewaehlt;
		
		portfolio.setPortfolioList(listGewaehlt);
		System.out.println("Annahme funktioniert!");
	}
	
	
	
	public void getGewaehlteListe() {
		// TODO Auto-generated method stub

	}

	// GET UND SET
	
	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public List<String> getListGewaehlt() {
		return listGewaehlt;
	}

	public void setListGewaehlt(ArrayList<String> listGewaehlt) {
		this.listGewaehlt = listGewaehlt;
	}

}