import java.text.DecimalFormat;

public class StockTransaction {
	public static void main(String[] args)
	{
		int JoeShares = 1000;
		double perShare = JoeShares*(32.87);
		final double COMMISION_RATE = perShare*(0.02);
		int soldShares = 1000;
		double sellPrice = soldShares*(33.92);
		final double soldCommision = sellPrice*(0.02);
		double profit = sellPrice - COMMISION_RATE - soldCommision - perShare;
		DecimalFormat formatter = new DecimalFormat("0.00");
		
		System.out.println("The ammount of money Joe paid for the stock was $"+formatter.format(perShare));
		System.out.println("The ammount Joe paid his stockbroker after buying stock was $"+formatter.format(COMMISION_RATE));
		System.out.println("The ammount that Joe sold for his stock was $"+formatter.format(sellPrice));
		System.out.println("The ammount that Joe paid his stockbroker when he sold his stock was $"+formatter.format(soldCommision));
		System.out.println("The ammount of money Joe had for profit was $"+formatter.format(profit));
	}

}
