import java.util.Arrays;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many number would you like in the array?");
		int userNum = input.nextInt();
		
		System.out.println("Enter a series of " + userNum + " numbers");
		
		int[] userArray = new int[userNum];
		
		getValues(userArray);
		
		showTotal(userArray);
		
		showHighest(userArray);
		
		showLowest(userArray);
		
		System.out.println("Your array is " + Arrays.toString(userArray));
		
		System.out.println("The lowest element is " + showLowest(userArray));
		
		System.out.println("The highest element is " + showHighest(userArray));
		
		System.out.println("The sum of the elements is " + showTotal(userArray));
		
		System.out.println("The average of the elements is " + showAverage(userArray));
		
		}
		
		public static void getValues(int[] userArray)
		{
			Scanner input = new Scanner(System.in);
			
			for (int i = 0; i < userArray.length; i++) {
				
				System.out.print("Enter number " + (i + 1) + ": ");
				userArray[i] = input.nextInt();
				
			}
		}
		
		public static int showTotal(int[] userArray) {
			
			int sum = 0;
			
			for (int i : userArray) {
				
				sum += i;
				
			}
			
			return sum;
			
		}
		
		public static int showHighest(int[] userArray) {
			
			int highest = userArray[0];
			
			for (int i = 0; i < userArray.length; i++) {
				
				if(userArray[i] > highest) {
					
					highest = userArray[i];
					
				}
				
			}
			
			return highest;
			
		}
		
		public static int showLowest(int[] userArray) {
			
			int lowest = userArray[0];
			
			for (int i = 0; i < userArray.length; i++) {
				
				if(userArray[i] < lowest) {
					
					lowest = userArray[i];
					
				}
				
			}
			
			return lowest;
			
		}
		
		public static double showAverage(int[] userArray) {
			
			double average = showTotal(userArray) / userArray.length;
			
			return average;
		}
		
		
}


