package ch.hwz.bfas;

import java.util.ArrayList;
import java.util.List;

public class AnlageuniversumDefinitiv {

	public enum Anlage {
		A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z

	}

	private ArrayList<String> listGewaehlt = new ArrayList<String>();
	char buchstabe;
	Portfolio portfolio;
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
	
	// TODO einstellen dass der Klient auswählen kann aber im Moment immer einverstanden
	einverstanden = true;
	
	
	if (einverstanden = true) {
		System.out.println("Annahme");
		//annahme(listGewaehlt);
		
	} else {
		// TODO Hier müsste nicht direkt auf anlage sonder auf auswahl des Kapitals für selection verwiesen werden
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
			System.out.println("BARN " + "BBN " + "BOBNN " + "BVZN ");
			break;
		case C:
			System.out.println("CMBN " + "CLN " + "CPHN " + "CSGN ");
			break;
		case D:
			System.out.println("DAE" + "KABN " + "DUFN ");
			break;
		case E:
			System.out.println("ESUN " + "EFGN " + "EMMN " + "EMSN");
			break;
		case F:
			System.out.println("F" + "" + "" + "");
			break;
		case G:
			System.out.println("G" + "" + "" + "");
			break;
		case H:
			System.out.println("H" + "" + "" + "");
			break;
		case I:
			System.out.println("I" + "" + "" + "");
			break;
		case J:
			System.out.println("J" + "" + "" + "");
			break;
		case K:
			System.out.println("K" + "" + "" + "");
			break;
		case L:
			System.out.println("L" + "" + "" + "");
			break;
		case M:
			System.out.println("M" + "" + "" + "");
			break;
		case N:
			System.out.println("N" + "" + "" + "");
			break;
		case O:
			System.out.println("O" + "" + "" + "");
			break;
		case P:
			System.out.println("P" + "" + "" + "");
			break;
		case Q:
			System.out.println("Q" + "" + "" + "");
			break;
		case R:
			System.out.println("R" + "" + "" + "");
			break;
		case S:
			System.out.println("S" + "" + "" + "");
			break;
		case T:
			System.out.println("T" + "" + "" + "");
			break;
		case U:
			System.out.println("U" + "" + "" + "");
			break;
		case V:
			System.out.println("V" + "" + "" + "");
			break;
		case W:
			System.out.println("W" + "" + "" + "");
			break;
		case X:
			System.out.println("X" + "" + "" + "");
			break;
		case Y:
			System.out.println("Y" + "" + "" + "");
			break;
		case Z:
			System.out.println("Z" + "" + "" + "");
			break;
		default:
			break;
		}

		System.out.println("Sie haben sich für Anlagestrategie '" + buchstabe + "' entschieden");
		System.out.println("Dies beinhaltet folgende Aktien: " + listGewaehlt);
		System.out.println("Der Betrag für 1 Aktienpaket ist: [KOSTEN]");
		System.out.println();
		System.out.println("Unser Vorschlag:");
		System.out.println("[MODULO] Mal das Aktienpaket '" + buchstabe + "'");

		System.out.println();
		System.out.println("Total Kosten Aktien: " + "[KOSTEN]*[MODULO]");
		System.out.println("Ihr zur verfügung stehendes Kapital: "
				+ kunde.getKontoListe().get(0).getKapitalListe().get(0).getWaehrung() + " "
				+ kunde.getKontoListe().get(0).getKapitalListe().get(0).getWertKapital());
		System.out.println(
				"Restbetrag auf Ihrem Konto nach Transaktion: " + "[getWährung + getKontostand] - [KOSTEN]*[MODULO]");

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
		
	}
	
	
	
	public void getGewaehlteListe() {
		// TODO Auto-generated method stub

	}

	// GET UND SET

	public List<String> getListGewaehlt() {
		return listGewaehlt;
	}

	public void setListGewaehlt(ArrayList<String> listGewaehlt) {
		this.listGewaehlt = listGewaehlt;
	}

}