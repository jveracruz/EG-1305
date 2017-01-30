
public class StockTransaction {
	public static void main(String[] args)
	{
		int JoeShares = 1000;
		double perShare = JoeShares*(32.87);
		double brokerCommision = perShare*(0.02);
		int soldShares = 1000;
		double sellPrice = soldShares*(33.92);
		double soldCommision = sellPrice*(0.02);
		double profit = perShare - brokerCommision - soldShares - sellPrice;
		
		System.out.println("The ammount of money Joe paid for the stock was "+perShare);
		System.out.println("The ammount Joe paid his stockbroker after buying stock was "+brokerCommision);
		System.out.println("The ammount that Joe sold for his stock was "+sellPrice);
		System.out.println("The ammount that Joe paid his stockbroker when he sold his stock was "+soldCommision);
		System.out.println("The ammount of money Joe had for profit was "+profit);
	}

}
