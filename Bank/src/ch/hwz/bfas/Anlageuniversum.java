package ch.hwz.bfas;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Anlageuniversum {

	public enum Anlage {
		A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z

	}

	private List<AktieDef> listGewaehlt = new ArrayList<>();
	char buchstabe;
	private Portfolio portfolio;
	Anlage anlage;
	Kunde kunde;
	boolean einverstanden = false;

	// Konstruktor
	public Anlageuniversum(Anlage anlage, Kunde kunde) {
		this.anlage = anlage;
		this.kunde = kunde;
	}

	// Methoden	
	public void einverstanden(boolean einverstanden){
	this.einverstanden = einverstanden;
	
	// TODO einstellen dass der Klient auswählen kann aber im Moment immer einverstanden
	einverstanden = true;
	
	
	if (einverstanden = true) {
		annahme(listGewaehlt);
		
	} else {
		// TODO Hier müsste nicht direkt auf anlage sonder auf auswahl des Kapitals für selection verwiesen werden
		selection(anlage);
	}
	
	}
	
	
	private void annahme(ArrayList<AktieDef> listGewaehlt2) {
		// TODO Auto-generated method stub
		
	}

	public void selection(Anlage anlage) {
		
		// Jedse Mal bei methode zuerst zurückgesetzt
		listGewaehlt = new ArrayList<>();

		switch (anlage) {
		case A:

			listGewaehlt.add(new AktieDef("AI.PA"));
			listGewaehlt.add(new AktieDef("AIR.PA"));
			listGewaehlt.add(new AktieDef("ALV.DE"));
			listGewaehlt.add(new AktieDef("ABI.BR"));

			buchstabe = 'A';

			break;


		case B:

			listGewaehlt.add(new AktieDef("BMW.DE"));
			listGewaehlt.add(new AktieDef("BAYN.DE"));
			listGewaehlt.add(new AktieDef("BNP.PA"));
			listGewaehlt.add(new AktieDef("BBVA.MC"));

			buchstabe = 'B';

			break;

		case C:
			listGewaehlt.add(new AktieDef("CA.PA"));
			listGewaehlt.add(new AktieDef("CSCO"));
			listGewaehlt.add(new AktieDef("CVX"));
			listGewaehlt.add(new AktieDef("CS"));

			buchstabe = 'C';
			break;

		case D:
			listGewaehlt.add(new AktieDef("DPW.DE"));
			listGewaehlt.add(new AktieDef("DTE.DE"));
			listGewaehlt.add(new AktieDef("DBK.DE"));
			listGewaehlt.add(new AktieDef("DD"));

			buchstabe = 'D';
			break;

		case E:
			listGewaehlt.add(new AktieDef("EI.PA"));
			listGewaehlt.add(new AktieDef("ENGI.PA"));
			listGewaehlt.add(new AktieDef("ENEL.MI"));
			listGewaehlt.add(new AktieDef("ENI.MI"));

			buchstabe = 'E';
			break;

		case F:
			listGewaehlt.add(new AktieDef("FRE.DE"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'F';
			break;

		case G:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'G';
			break;

		case H:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));;

			buchstabe = 'H';
			break;

		case I:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));
			buchstabe = 'I';
			break;

		case J:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'J';
			break;

		case K:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'K';
			break;

		case L:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'L';
			break;

		case M:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'M';
			break;

		case N:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'N';
			break;

		case O:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'O';
			break;

		case P:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'P';
			break;

		case Q:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'Q';
			break;

		case R:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'R';
			break;

		case S:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'S';
			break;

		case T:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'T';
			break;

		case U:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'U';
			break;

		case V:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'V';
			break;

		case W:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'W';
			break;

		case X:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'X';
			break;

		case Y:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'Y';
			break;

		case Z:
			listGewaehlt.add(new AktieDef("ABBN"));
			listGewaehlt.add(new AktieDef("ATLN"));
			listGewaehlt.add(new AktieDef("ADEN"));
			listGewaehlt.add(new AktieDef("ASCN"));

			buchstabe = 'Z';
			break;
		default:
			break;
		}
		
		// Summe von aktien die gewählt wurde = Summe
		BigDecimal summe = new BigDecimal("0");
		
		for (AktieDef item : listGewaehlt) {
			//System.out.println(item. + item.getPrice());
			
		summe = summe.add(item.getPrice());
		
		
		}
		
		// Neu benötigte Variabeln
		String kuWaehrung = kunde.getKontoListe().get(0).getKapitalListe().get(0).getWaehrung();
		double kuKapital = kunde.getKontoListe().get(0).getKapitalListe().get(0).getWertKapital();
		int anzPakete = (int) (kuKapital / summe.doubleValue());
		double totKostenAktien = anzPakete * summe.doubleValue();
		double restKonto = kuKapital - totKostenAktien;
		
		
		// Console Output
		System.out.println();
		System.out.println("Sie haben sich für Anlagestrategie '" + buchstabe + "' entschieden");
		System.out.println("Der Betrag für 1 Aktienpaket '" + buchstabe + "' ist: " + kuWaehrung + " " + summe);
		System.out.println();
		System.out.println("Unser Vorschlag:");
		System.out.println(anzPakete + " Mal das Aktienpaket '" + buchstabe + "'");

		
		
		System.out.println();
		System.out.println("Total Kosten Aktien: " + totKostenAktien);
		System.out.println("Ihr zur verfügung stehendes Kapital: " + kuWaehrung + " " + kuKapital);
		System.out.println("Restbetrag auf Ihrem Konto nach Transaktion: " + kuWaehrung + " " + restKonto);
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

	public void annahme(List<AktieDef> listGewaehlt){
		this.listGewaehlt = listGewaehlt;
		
		portfolio.setPortfolioList(listGewaehlt);
		System.err.println("Annahme funktioniert!");
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

	public List<AktieDef> getListGewaehlt() {
		return listGewaehlt;
	}

	public void setListGewaehlt(ArrayList<AktieDef> listGewaehlt) {
		this.listGewaehlt = listGewaehlt;
	}

}