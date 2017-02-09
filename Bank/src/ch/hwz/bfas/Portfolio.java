package ch.hwz.bfas;

import java.util.ArrayList;
import java.util.List;

public class Portfolio extends abstractPortfolio {
	
	private int portfolioID = 1;
	private List<Aktie> portfolioList = new ArrayList<>();	
	
	// Get und Set
	public int getPortfolioID() {
		return portfolioID;
	}

	public void setPortfolioID(int portfolioID) {
		this.portfolioID = portfolioID;
	}

	public List<Aktie> getPortfolioList() {
		return portfolioList;
	}

	public void setPortfolioList(List<Aktie> listGewaehlt) {
		this.portfolioList = listGewaehlt;
	}
	
	// Portfolio dem Depot zuweisen Methode ist in Depot.
	
	
	
	


}
