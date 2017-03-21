import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Distance {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		System.out.print("Enter the first x value: ");
		double x1 = input.nextInt();
		
		System.out.print("Enter the first y value: ");
		double y1 = input.nextInt();
		
		System.out.print("Enter the second x value: ");
		double x2 = input.nextInt();
		
		System.out.print("Enter the second y value: ");
		double y2 = input.nextInt();
		
		getDistance(x1, y1, x2, y2);
		
		System.out.println(formatter.format(getDistance(x1, y1, x2, y2)));
	}
	

	public static double getDistance(double x1, double y1, double x2, double y2) {
		
		return Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
	}

}
