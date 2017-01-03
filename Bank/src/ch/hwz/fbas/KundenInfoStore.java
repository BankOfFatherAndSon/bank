package ch.hwz.fbas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ch.hwz.bfas.util.KontoIDCreator;

public class KundenInfoStore extends Konto {

	/*
	 * Ich will grunds�tzlich dem System Sagen, dass ich f�r die anschliessende
	 * Methode alle Informationen von Konto ben�tige, diese werden dann hier in
	 * ddem Text file Kundeninfo abgespeichert als Kudnenprofil. Grund f�r dies
	 * ist es, sozusagen eine Datenbank in ein txt file zu erstellen
	 * 
	 * Wenn es eine bessere m�glichkeit f�r ein internes Datensystem gibt, soll
	 * diese benutzt werden.
	 */

	public String getVorname, getNachname;
	public int getBookingNr, getKontoNr;

	public KundenInfoStore(String vorname, String nachname) {
		super(vorname, nachname);
		// TODO Auto-generated constructor stub
	}

	/*
	 * // create a new file with an ObjectOutputStream FileOutputStream fos =
	 * new FileOutputStream("KundenInfo.txt"); ObjectOutputStream oos = new
	 * ObjectOutputStream(fos);
	 * 
	 * // write something in the file oos.writeObject(); oos.writeObject(i);
	 * oos.writeObject(c);
	 * 
	 * // close the stream oout.close();
	 * 
	 * // create an ObjectInputStream for the file we created before
	 * ObjectInputStream ois = new ObjectInputStream(new
	 * FileInputStream("test.txt"));
	 * 
	 * 
	 * 
	 * // read and print what we wrote before System.out.println("" + (String)
	 * ois.readObject()); System.out.println("" + ois.readObject());
	 * System.out.println("" + ((Car) ois.readObject()).getMarke());
	 * 
	 * ois.close();
	 * 
	 * } catch (Exception ex) { ex.printStackTrace(); }
	 * 
	 * }}
	 */}
