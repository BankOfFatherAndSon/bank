
public class Test {
	public static void main(String[] args) {

		Konto k1 = new Konto("Timi", "Osoko");
		System.out.println(k1.getKontoNr());

		Konto k2 = new Konto("Reto", "Hegi");
		System.out.println(k2.getKontoNr());
		
		Konto k3 = new Konto("Michael", "Rossi");
		System.out.println(k3.getKontoNr());
		
		Konto k4 = new Konto("Fabio", "Mandanici");
		System.out.println(k4.getKontoNr());
	}
}
