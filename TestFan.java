import java.util.Scanner;

public class TestFan {
	
	public static void main(String[] args) {
		
		int speed;
		boolean fanStatus;
		int radius;
		String color;
		String fanSwitch;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("You will configure a fan");
		
		System.out.print("\nEnter a fan speed: ");
		speed = input.nextInt();
		
		System.out.print("Enter the fan status (on or off): ");
		fanSwitch = input.next();
		if(fanSwitch == "on") {
			
			fanStatus = false;
			
		}
		else
		{
			fanStatus = true;
		}
		
		System.out.print("Enter a radius: ");
		radius = input.nextInt();
		
		System.out.print("Enter a fan color: ");
		color = input.next();
		
		Fan f = new Fan(speed, fanStatus, radius, color);
		
		System.out.println(f.toString());
		
	}

}
