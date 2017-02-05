import java.text.DecimalFormat;

public class StockTransaction {
	public static void main(String[] args)
	{
		final double COMMISSION_RATE = .02;
		
		int joeShares = 1000;
		double totalShare = joeShares*(32.87);
		double brokerPay1 = totalShare*COMMISSION_RATE;
		
		double sellPrice = joeShares*(33.92);
		double brokerPay2 = sellPrice*COMMISSION_RATE;
		double profit = (sellPrice + brokerPay2) - (brokerPay1 + totalShare);
		//This formula is not correct. First calculate the profit: sold - bought, then take off the commission to find the net profit.
		DecimalFormat formatter = new DecimalFormat("0.00");
		
		System.out.println("The ammount of money Joe paid for the stock was $"+formatter.format(totalShare));
		System.out.println("The ammount Joe paid his stockbroker after buying stock was $"+formatter.format(brokerPay1));
		System.out.println("The ammount that Joe sold for his stock was $"+formatter.format(sellPrice));
		System.out.println("The ammount that Joe paid his stockbroker when he sold his stock was $"+formatter.format(brokerPay2));
		System.out.println("The ammount of money Joe had for profit was $"+formatter.format(profit));
	}

}
