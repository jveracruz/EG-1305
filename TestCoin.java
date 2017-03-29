

public class TestCoin {
	
	public static void main(String[] args) {
		
		int headsCount = 0;
		int tailsCount = 0;
		
		Coin c = new Coin();
		
		c.toss();
		
		System.out.println("Starting side " + c.getCoin() );
		
		for(int i = 0; i <= 20; i++) {
			
			c.toss();
			
			if(c.getCoin() == "heads") {
				
				headsCount++;
				
			}
			else if(c.getCoin() == "tails")
			{
				tailsCount++;
			}
			
			
		}
		
		System.out.print("Number of times heads came up is: " + headsCount + "\n");
		
		System.out.print("Number of times tails came up is: " + tailsCount);
		
	}

}
