package ch.hwz.bfas.test;
import java.io.IOException;
import java.util.Map;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class TestKurse extends YahooFinance {
 public static void main(String[] args) {
	

	String[] symbols = new String[] {"INTC", "AIR.PA", "NKE"};
	Map<String, Stock> stocks;
	try {
		stocks = YahooFinance.get(symbols);
		Stock intel = stocks.get("INTC");
		Stock airbus = stocks.get("AIR.PA");
		Stock nike = stocks.get("NKE");
		intel.print();
		airbus.print();
		nike.print();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} // single request
	
}    
}

