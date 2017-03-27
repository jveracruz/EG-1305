
public class Coin {
	
	String sideUp;
	

	public Coin() {
		
		String sideUp;
	
	}

	public String getSide() {
		
		double side = (Math.random() * 2);
		if(side == 0)
		{
			return "heads";
		}
		else
		{
			return "tails";
		}
		
	}
	
	public String flip() {
		
		double side = (Math.random() * 2);
		if(side == 0)
		{
			return "heads";
		}
		else
		{
			return "tails";
		}
		
	}

}
