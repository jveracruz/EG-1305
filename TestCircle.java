import java.text.DecimalFormat;
import java.util.Scanner;

public class TestCircle {
	
	public static void main(String[] args){
		
		DecimalFormat formatter = new DecimalFormat("#0.0000");
		
		CircleCode c = new CircleCode();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the circle");
		double radius = input.nextDouble();
		
		System.out.println("This circle's radius is: " + formatter.format(c.getRadius(radius)));
		
		System.out.println("This circle's diameter is: " + formatter.format(c.getDiameter(radius)));
		
		System.out.println("This circle's area is: " + formatter.format(c.getArea(radius)));
		
		System.out.println("This circle's circumference is: " + formatter.format(c.getCircumference(radius)));
		
	}

}
