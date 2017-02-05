import java.text.DecimalFormat;


public class Circle {
	public static void main(String[] args){
		double radius = 5;
		double Area = radius*radius*Math.PI; //Don't start a variable with a capital letter
		double Perimeter = 2*radius*Math.PI; //Don't start a variable with a capital letter
		DecimalFormat formatter = new DecimalFormat("#0.00");
		System.out.println("Area is "+formatter.format(Area));
		System.out.println("Perimeter is "+formatter.format(Perimeter));
	}

}
