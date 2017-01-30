import java.text.DecimalFormat;

public class Drink {
	public static void main(String[] args)
	{
		int customers = 12467;
		double totalPurchased = customers*(.14);
		double citrusPurchased = totalPurchased*(.64);
		DecimalFormat formatter = new DecimalFormat("#0");
		System.out.println("The number of customers who purchased one or more energy drinks per week are "+formatter.format(totalPurchased));
		System.out.println("The number of customers who perferred citrus flavored energy drinks are "+formatter.format(citrusPurchased));
	}

}
