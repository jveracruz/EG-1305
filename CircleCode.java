import java.lang.Math;

public class CircleCode {
	
	public double radius;
	
	
	public CircleCode() {
		
		
		
	}
	
	public double getRadius(double radius){
		
		return radius;
		
	}

	public double getArea(double radius){
		
		return Math.PI * radius * radius;
		
	}
	
	public double getDiameter(double radius){
		
		return radius * 2;
		
	}
	
	public double getCircumference(double radius){
		
		return Math.PI * 2 * radius;
		
	}
	
	
}
