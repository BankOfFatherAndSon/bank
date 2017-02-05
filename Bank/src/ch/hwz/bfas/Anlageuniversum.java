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
	
	// TODO einstellen dass der Klient ausw�hlen kann aber im Moment immer einverstanden
	einverstanden = true;
	
	
	if (einverstanden = true) {
		annahme(listGewaehlt);
		
	} else {
		// TODO Hier m�sste nicht direkt auf anlage sonder auf auswahl des Kapitals f�r selection verwiesen werden
		selection(anlage);
	}
	
	}
	
	
	private void annahme(ArrayList<AktieDef> listGewaehlt2) {
		// TODO Auto-generated method stub
		
	}

	public void selection(Anlage anlage) {
		
		// Jedse Mal bei methode zuerst zur�ckgesetzt
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
			listGewaehlt.add(new AktieDef("FRTA"));
			listGewaehlt.add(new AktieDef("FARO"));
			listGewaehlt.add(new AktieDef("FRE.DE"));

			buchstabe = 'F';
			break;

		case G:
			listGewaehlt.add(new AktieDef("G.MI"));
			listGewaehlt.add(new AktieDef("GS"));
			listGewaehlt.add(new AktieDef("GBRA.F"));
			listGewaehlt.add(new AktieDef("8GC.F"));

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
			listGewaehlt.add(new AktieDef("IBKC"));
			listGewaehlt.add(new AktieDef("ISLE"));
			listGewaehlt.add(new AktieDef("INTC"));
			listGewaehlt.add(new AktieDef("IBM"));
			buchstabe = 'I';
			break;

		case J:
			listGewaehlt.add(new AktieDef("JNJ"));
			listGewaehlt.add(new AktieDef("JIVE"));
			listGewaehlt.add(new AktieDef("BAER.VX"));

			buchstabe = 'J';
			break;

		case K:
			listGewaehlt.add(new AktieDef("KO"));
			listGewaehlt.add(new AktieDef("KLXI"));
			listGewaehlt.add(new AktieDef("KELYA"));
			listGewaehlt.add(new AktieDef("K"));

			buchstabe = 'K';
			break;

		case L:
			listGewaehlt.add(new AktieDef("HCMLY"));
			listGewaehlt.add(new AktieDef("LIN.DE"));
			listGewaehlt.add(new AktieDef("LHA.DE"));
			listGewaehlt.add(new AktieDef("LINN.SW"));

			buchstabe = 'L';
			break;

		case M:
			listGewaehlt.add(new AktieDef("MUV2.DE"));
			listGewaehlt.add(new AktieDef("MMM"));
			listGewaehlt.add(new AktieDef("MDC.L"));
			
			buchstabe = 'M';
			break;

		case N:
			listGewaehlt.add(new AktieDef("NVS"));
			listGewaehlt.add(new AktieDef("NSRGY"));
			listGewaehlt.add(new AktieDef("NKE"));
			listGewaehlt.add(new AktieDef("NOKIA.HE"));

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
		
		// Summe von aktien die gew�hlt wurde = Summe
		BigDecimal summe = new BigDecimal("0");
		
		for (AktieDef item : listGewaehlt) {
			//System.out.println(item. + item.getPrice());
			
		summe = summe.add(item.getPrice());
		
		
		}
		
		// Neu ben�tigte Variabeln
		String kuWaehrung = kunde.getKontoListe().get(0).getKapitalListe().get(0).getWaehrung();
		double kuKapital = kunde.getKontoListe().get(0).getKapitalListe().get(0).getWertKapital();
		int anzPakete = (int) (kuKapital / summe.doubleValue());
		double totKostenAktien = anzPakete * summe.doubleValue();
		double restKonto = kuKapital - totKostenAktien;
		
		
		// Console Output
		System.out.println();
		System.out.println("Sie haben sich f�r Anlagestrategie '" + buchstabe + "' entschieden");
		System.out.println("Der Betrag f�r 1 Aktienpaket '" + buchstabe + "' ist: " + kuWaehrung + " " + summe);
		System.out.println();
		System.out.println("Unser Vorschlag:");
		System.out.println(anzPakete + " Mal das Aktienpaket '" + buchstabe + "'");

		
		
		System.out.println();
		System.out.println("Total Kosten Aktien: " + totKostenAktien);
		System.out.println("Ihr zur verf�gung stehendes Kapital: " + kuWaehrung + " " + kuKapital);
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