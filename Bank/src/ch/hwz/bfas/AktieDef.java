package ch.hwz.bfas;

import java.io.IOException;
import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;


public class AktieDef {
	private BigDecimal price;;
	
	private String name;

	//Konstruktor
	public AktieDef(String name) {
		Stock stock = null;
		try {
			stock = YahooFinance.get(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		price = stock.getQuote().getPrice();
		 
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
