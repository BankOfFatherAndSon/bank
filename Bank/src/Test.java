
public class Test {
	public static void main(String[] args) {

		
		// Möglichkeit Konto und Kunde zu verbinden??
		// Damit ich die Infos aus Konto auf Kunde übertragen kann..args.
		Konto k1 = new Konto("Timi", "Osoko");
		Kunde ku1 = new Kunde(k1.vorname, k1.nachname, k1.kontoNr, "Rietschenweg 49", "timiosoko@hotmail.com", 1, 1, /* wieso ist dies kein double?*/ 0799609999);
		System.out.println(k1.getKontoNr());
		System.out.println(ku1.adresse);
		
		

		Konto k2 = new Konto("Reto", "Hegi");
		System.out.println(k2.getKontoNr());
		
		Konto k3 = new Konto("Michael", "Rossi");
		System.out.println(k3.getKontoNr());
		
		Konto k4 = new Konto("Fabio", "Mandanici");
		System.out.println(k4.getKontoNr());
		
	
	}
}
