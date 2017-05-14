import java.math.BigInteger;
public class Chess {

	public static void main(String[] args){
		
		long wheat = 0;
		long chess;
		long total;
		
		for(int i = 0; i < 64; i++){
			
			chess = (long) Math.pow(2 , i);
			
			wheat = wheat + chess;
			
			BigInteger hugeNumber = new BigInteger("" + wheat);
			
			System.out.println(hugeNumber);
			
		}

		//total = 2 + wheat;
		
		//System.out.println("Total on chessboard is: " + total);
	}
}
