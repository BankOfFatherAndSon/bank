package ch.hwz.bfas;

import java.util.ArrayList;
import java.util.List;

public class Anlagevorschlag extends abstractPortfolio {

	//get List from AnlageuniversumDef
	Anlageuniversum anlageuniversum;
	
	// Kapital abrufen
	int getWertKapitalTest = 100; // - get Wert Kapital
	int modulo;

	public void selection(Kunde kunde) {
		// Sich für ein Paket enscheiden
		
		List listeATimi = new ArrayList();

		
		listeATimi.add("ABBN");
		listeATimi.add("ATLN");
		listeATimi.add("ADEN");
		listeATimi.add("ASCN");
		
		anlageuniversum.getGewaehlteListe();
		
		//Summe des Preises der Aktien in diesem Array ausrechnen
		// TODO vielleicht String to Int
		
		// Ausrechnen wieviel mal ein GANZES Paket in unserem Kapital Platz hat // Modulo %
		// TODO modulo = getWertKapitalTest % anlageuniversumDefin.getGewaehlteListe(); // <- getWert int | anla stringlist
		
		// Die GANZE anzahl vorschlagen
		 System.out.println("Unser Vorschlag");
		 System.out.println(modulo + " Mal das Aktienpaket " + "|Listenname, Bsp: A");
		 System.out.println();
		 System.out.println("Total Kosten Aktien: " + "|Summe der Preise" );
		 System.out.println("Ihr zur verfügung stehendes Kapital: " + getWertKapitalTest);
		 System.out.println("Restbetrag auf Ihrem Konto: " + getWertKapitalTest + "- |Summe der Preise");
	}
	
	public void annahme() {
		// TODO Siehe von oben
		
	}
	
	public void abgelehnt() {
		// TODO Neue Anlagestrategie wählen --> Neuer Buchstabe
		
		//Anschliessend erneut selektion
	//	selection();
		
	}
	
}
