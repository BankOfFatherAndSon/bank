package ch.hwz.bfas.test;
import ch.hwz.fbas.Kapital;
import ch.hwz.fbas.Konto;
import ch.hwz.fbas.Kunde;

public class Test {
	public static void main(String[] args) {

		// Create Kunde and Set Variables
		Kunde k1 = new Kunde(1); // 1 = Kundenummer
		k1.setName("M�ller");
		k1.setVorname("Max");

		// Add Konto to Kunde
		Konto konto1 = new Konto();
		k1.addKonto(konto1);

		// Add Kapital to Konto
		Kapital kapital1 = new Kapital("CHF", false);
		konto1.addKapital(kapital1);

		// Dieser Teil wird aufs Eis gelegt bis wir die Infos von Rossi erhalten
		/*
		 * [] Ich brauche eine Anlagestrategie damit ich ein Depot er�ffnen kann
		 * [] Kontrolle der Adresse in Methode addDepot
		 * (OK) Anlagestrategie ist eine Klasse und muss erstellt werden
		 */

		/*
		 * Depot depot = new Depot(Anlagestrategie); // --> Muss instanziert
		 * werden gem�ss Rossi k1.addDepot(depot);
		 */

	}
}
