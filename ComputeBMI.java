import javax.swing.JOptionPane;

public class ComputeBMI {
	
	public static void main(String[] args){
		
		String inputString;
		double weight;
		double height;
		double bodyMassIndex;
		
		inputString = JOptionPane.showInputDialog("Enter your weight in pounds ");
		
		weight = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("Enter your height in inches ");
		
		height = Integer.parseInt(inputString);
		
		weight *= 0.45359237;
		
		height *= .0254;
		
		bodyMassIndex = weight / (height*height);
		
		JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + bodyMassIndex);
		
		System.exit(0);
		
	}

}
