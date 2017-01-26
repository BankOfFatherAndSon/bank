package ch.hwz.bfas;

import yahoofinance.Stock;

public class Aktie extends abstractPortfolio {

	String isin, titelName, currency;
	int valor;
	double price, dividendPayment;
	// date dividendDate;

	private Kunde kunde;

	public Aktie(Stock stock) {
	this.isin = stock.getSymbol();
	

	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getTitelName() {
		return titelName;
	}

	public void setTitelName(String titelName) {
		this.titelName = titelName;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDividendPayment() {
		return dividendPayment;
	}

	public void setDividendPayment(double dividendPayment) {
		this.dividendPayment = dividendPayment;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}
	
}