package ch.hwz.bfas;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Anlageuniversum extends abstractPortfolio {

	public enum Anlage {
		A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z

	}

	private List<Aktie> listGewaehlt = new ArrayList<>();
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
		
	private void annahme(ArrayList<Aktie> listGewaehlt2) {
		// TODO Auto-generated method stub
		
	}

	public void selection(Anlage anlage) {
		
		// Jedse Mal bei methode zuerst zurückgesetzt
		listGewaehlt = new ArrayList<>();

		switch (anlage) {
		case A:

			listGewaehlt.add(new Aktie("AI.PA"));
			listGewaehlt.add(new Aktie("AIR.PA"));
			listGewaehlt.add(new Aktie("ALV.DE"));
			listGewaehlt.add(new Aktie("ABI.BR"));

			buchstabe = 'A';

			break;


		case B:

			listGewaehlt.add(new Aktie("BMW.DE"));
			listGewaehlt.add(new Aktie("BAYN.DE"));
			listGewaehlt.add(new Aktie("BNP.PA"));
			listGewaehlt.add(new Aktie("BBVA.MC"));

			buchstabe = 'B';

			break;

		case C:
			listGewaehlt.add(new Aktie("CA.PA"));
			listGewaehlt.add(new Aktie("CSCO"));
			listGewaehlt.add(new Aktie("CVX"));
			listGewaehlt.add(new Aktie("CS"));

			buchstabe = 'C';
			break;

		case D:
			listGewaehlt.add(new Aktie("DPW.DE"));
			listGewaehlt.add(new Aktie("DTE.DE"));
			listGewaehlt.add(new Aktie("DBK.DE"));
			listGewaehlt.add(new Aktie("DD"));

			buchstabe = 'D';
			break;

		case E:
			listGewaehlt.add(new Aktie("EI.PA"));
			listGewaehlt.add(new Aktie("ENGI.PA"));
			listGewaehlt.add(new Aktie("ENEL.MI"));
			listGewaehlt.add(new Aktie("ENI.MI"));

			buchstabe = 'E';
			break;

		case F:
			listGewaehlt.add(new Aktie("FRE.DE"));
			listGewaehlt.add(new Aktie("FRTA"));
			listGewaehlt.add(new Aktie("FARO"));
			listGewaehlt.add(new Aktie("FRE.DE"));

			buchstabe = 'F';
			break;

		case G:
			listGewaehlt.add(new Aktie("G.MI"));
			listGewaehlt.add(new Aktie("GS"));
			listGewaehlt.add(new Aktie("GBRA.F"));
			listGewaehlt.add(new Aktie("8GC.F"));

			buchstabe = 'G';
			break;

		case H:
			listGewaehlt.add(new Aktie("ABBN"));
			listGewaehlt.add(new Aktie("ATLN"));
			listGewaehlt.add(new Aktie("ADEN"));
			listGewaehlt.add(new Aktie("ASCN"));;

			buchstabe = 'H';
			break;

		case I:
			listGewaehlt.add(new Aktie("IBKC"));
			listGewaehlt.add(new Aktie("ISLE"));
			listGewaehlt.add(new Aktie("INTC"));
			listGewaehlt.add(new Aktie("IBM"));
			buchstabe = 'I';
			break;

		case J:
			listGewaehlt.add(new Aktie("JNJ"));
			listGewaehlt.add(new Aktie("JIVE"));
			listGewaehlt.add(new Aktie("BAER.VX"));

			buchstabe = 'J';
			break;

		case K:
			listGewaehlt.add(new Aktie("KO"));
			listGewaehlt.add(new Aktie("KLXI"));
			listGewaehlt.add(new Aktie("KELYA"));
			listGewaehlt.add(new Aktie("K"));

			buchstabe = 'K';
			break;

		case L:
			listGewaehlt.add(new Aktie("HCMLY"));
			listGewaehlt.add(new Aktie("LIN.DE"));
			listGewaehlt.add(new Aktie("LHA.DE"));
			listGewaehlt.add(new Aktie("LINN.SW"));

			buchstabe = 'L';
			break;

		case M:
			listGewaehlt.add(new Aktie("MUV2.DE"));
			listGewaehlt.add(new Aktie("MMM"));
			listGewaehlt.add(new Aktie("MDC.L"));
			
			buchstabe = 'M';
			break;

		case N:
			listGewaehlt.add(new Aktie("NVS"));
			listGewaehlt.add(new Aktie("NSRGY"));
			listGewaehlt.add(new Aktie("NKE"));
			listGewaehlt.add(new Aktie("NOKIA.HE"));

			buchstabe = 'N';
			break;

		case O:
			listGewaehlt.add(new Aktie("OR.PA"));
			listGewaehlt.add(new Aktie("OPTT"));
			listGewaehlt.add(new Aktie("ORBK"));
			
			buchstabe = 'O';
			break;

		case P:
			listGewaehlt.add(new Aktie("PFE"));
			listGewaehlt.add(new Aktie("PEP"));
			listGewaehlt.add(new Aktie("PG"));

			buchstabe = 'P';
			break;

		case Q:
			listGewaehlt.add(new Aktie("QTNA"));
			listGewaehlt.add(new Aktie("QUAD"));
			listGewaehlt.add(new Aktie("QST.V"));

			buchstabe = 'Q';
			break;

		case R:
			listGewaehlt.add(new Aktie("ROG.VX"));
			listGewaehlt.add(new Aktie("CFR.VX"));
			listGewaehlt.add(new Aktie("RWE.DE"));
			

			buchstabe = 'R';
			break;

		case S:
			listGewaehlt.add(new Aktie("SCMN.VX"));
			listGewaehlt.add(new Aktie("SLHN.VX"));
			listGewaehlt.add(new Aktie("SYT"));
			listGewaehlt.add(new Aktie("UHR.VX"));

			buchstabe = 'S';
			break;

		case T:
			listGewaehlt.add(new Aktie("TSLA"));
			listGewaehlt.add(new Aktie("TSCO.L"));
			listGewaehlt.add(new Aktie("TUI.L"));
			listGewaehlt.add(new Aktie("TKA.DE"));

			buchstabe = 'T';
			break;

		case U:
			listGewaehlt.add(new Aktie("UNH"));
			listGewaehlt.add(new Aktie("UTX"));
			listGewaehlt.add(new Aktie("UBS"));
			listGewaehlt.add(new Aktie("ULTA"));

			buchstabe = 'U';
			break;

		case V:
			listGewaehlt.add(new Aktie("VOW.F"));
			listGewaehlt.add(new Aktie("VOD.L"));
			listGewaehlt.add(new Aktie("VZ"));

			buchstabe = 'V';
			break;

		case W:
			listGewaehlt.add(new Aktie("WPG.L"));
			listGewaehlt.add(new Aktie("WFC"));
			listGewaehlt.add(new Aktie("WWE"));

			buchstabe = 'W';
			break;

		case X:
			listGewaehlt.add(new Aktie("X"));
			listGewaehlt.add(new Aktie("XOM"));
			listGewaehlt.add(new Aktie("XXL.OL"));

			buchstabe = 'X';
			break;

		case Y:
			listGewaehlt.add(new Aktie("YELP"));
			listGewaehlt.add(new Aktie("YHOO"));
			listGewaehlt.add(new Aktie("YELP"));
			listGewaehlt.add(new Aktie("YRCW"));

			buchstabe = 'Y';
			break;

		case Z:
			listGewaehlt.add(new Aktie("ZURN.VX"));
			listGewaehlt.add(new Aktie("ZNGA"));
			listGewaehlt.add(new Aktie("ZAL.OL"));
			buchstabe = 'Z';
			break;
		default:
			break;


		}
		
		// Summe von aktien die gewählt wurde = Summe
		BigDecimal summe = new BigDecimal("0");
		
		for (Aktie item : listGewaehlt) {
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

	}

	public void annahme(List<Aktie> listGewaehlt){
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

	public List<Aktie> getListGewaehlt() {
		return listGewaehlt;
	}

	public void setListGewaehlt(ArrayList<Aktie> listGewaehlt) {
		this.listGewaehlt = listGewaehlt;
	}

}