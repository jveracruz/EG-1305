import java.text.DecimalFormat;

// DecimalFormat formatter = new DecimalFormat(#0.00);
// ^Class name^  ^objectref^ ^keyword to instantiate objects^ (DecimalFormat) is constructor
//which also instantiate object 
//System.out.println("radius+"formatter(radius)
// ("Area is" + formatter(area));
//"perimeter is" + formatter (perimeter);
// println(formatter.format(area));
//Objectref.method or field
//         ^dot operator
//Math.PI
//^Class name "." dot operator "PI" constant


public class Circle {
	public static void main(String[] args){
		double radius = 5;
		double Area = radius*radius*Math.PI;
		double Perimeter = 2*radius*Math.PI;
		DecimalFormat formatter = new DecimalFormat("#0.00");
		System.out.println("Area is "+formatter.format(Area));
		System.out.println("Perimeter is "+formatter.format(Perimeter));
	}

}
