
public class Coin {
	
	private String sideUp;

	
	
	public void toss() {
		
			int side = (int) (Math.random() * 2);
			
			if(side == 1)
			{
				sideUp = "heads";
			}
			else
			{
				sideUp = "tails";
			}
			//System.out.println(side);
		}
	
		public String getCoin() {
		
			return sideUp;
	
		}
		
	
		public void Coin() {
		
		toss();
		
		
		}
}
