import java.util.Scanner;

public class TestFan {
	
	public static void main(String[] args) {
		
		int speed;
		boolean fanStatus;
		int radius;
		String color;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("You will configure a fan");
		
		System.out.print("\nEnter a fan speed: ");
		speed = input.nextInt();
		
		System.out.print("Enter the fan status (true or false): ");
		fanStatus = input.nextBoolean();
		
		System.out.print("Enter a radius: ");
		radius = input.nextInt();
		
		System.out.println("Enter a fan color: ");
		color = input.next();
		
		Fan f = new Fan();
		
		System.out.println(f.toString());
		
	}

}
