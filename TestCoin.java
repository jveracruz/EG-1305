

public class TestCoin {
	
	public static void main(String[] args) {
		
		int headsCount = 0;
		int tailsCount = 0;
		
		Coin c = new Coin();
		System.out.println(c.getSide());
		
		for(int i = 0; i < 20; i++) {
			
			c.getSide();
			c.flip();
			if(c.flip() == "heads") {
				
				headsCount++;
				
			}
			else
			{
				tailsCount++;
			}
			
			
		}
		
		System.out.print("Number of times heads came up is: " + headsCount + "\n");
		
		System.out.print("Number of times tails came up is: " + tailsCount);
		
	}

}
