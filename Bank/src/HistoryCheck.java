import java.io.IOException;
import java.util.Map;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class HistoryCheck extends YahooFinance {
public static void main(String[] args) {
	Stock nike;
	try {
		nike = YahooFinance.get("NKE", true);
		System.out.println(nike.getHistory());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	

}


}
