package ch.hwz.bfas;

import java.util.ArrayList;
import java.util.List;

public class AnlageuniversumDefin {
	public enum Anlage {
		A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z

	}

	Anlage anlage;

	public AnlageuniversumDefin(Anlage anlage) {
		this.anlage = anlage;
		// TODO Auto-generated constructor stub
	}

	public void selection() {

		List<String> listA = new ArrayList<String>();
		listA.add("ABBN");
		listA.add("ATLN");
		listA.add("ADEN");
		listA.add("ASCN");
		

		switch (anlage) {
		case A:
			System.out.println(listA);
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

	}

	public static void main(String[] args) {
		AnlageuniversumDefin ebay = new AnlageuniversumDefin(Anlage.A);
		ebay.selection();
	}

}