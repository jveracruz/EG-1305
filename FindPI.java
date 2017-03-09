
import java.text.DecimalFormat;

public class FindPI {
	
	public static void main(String[] args)
	{
		
		DecimalFormat formatter = new DecimalFormat(".###");
		
		long startPiTime = System.nanoTime();
		
		double pi = 0;
		int n = 2500000;
		double denominator = 1;
		
		for (int i = 0; i < n; i++)
		{
			if(i % 2 == 0)
			{
				pi = pi + (1 / denominator);
			}
			else
			{
				pi = pi - (1 / denominator);
			}
			
			denominator = denominator + 2;
			
			
		}
		
		pi = pi * 4;
		
		long finishPiTime = System.nanoTime();
		
		long difference = finishPiTime - startPiTime;
		
		double seconds = (double)difference / 1000000000;
		
		System.out.println("PI = " + pi + " after " + n + " iterations");
		
		System.out.println("It took " + formatter.format(seconds) + " to find PI");
		
		
		
	}
	
	

}
