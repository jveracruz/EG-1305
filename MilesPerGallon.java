import java.util.Scanner;

public class MilesPerGallon {
	
	public static void main(String[] args){
		
		float miles;
		float gallons;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the miles driven: ");
		miles = keyboard.nextInt();
		
		System.out.print("Enter the gallons of fuel used: ");
		gallons = keyboard.nextInt();
		
		double milesPerGallon = miles / gallons;
		
		System.out.print("The miles-per-gallon is " + milesPerGallon);
		
	}

}
