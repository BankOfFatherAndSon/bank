package ch.hwz.bfas;

import java.io.IOException;
import java.util.Map;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class YahooBeispiel {
	public static void main(String[] args) {

		String[] symbols = new String[] { "INTC", "BABA", "TSLA", "AIR.PA", "YHOO" };
		Map<String, Stock> stocks = null;
		try {
			stocks = YahooFinance.get(symbols);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // single request
		Stock intel = stocks.get("INTC");
		Stock airbus = stocks.get("AIR.PA");
		
		
		Aktie aktie = new Aktie(intel);
		
		Anlagevorschlag ala = new Anlagevorschlag();

		System.out.println(aktie.getIsin());
	}
	
	
}