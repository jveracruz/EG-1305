import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in);
		
		//Initializes the number of days to 0
		int days = 0;
		
		//Asks the user for a year and month
		System.out.print("Please enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Please enter a month: ");
		int month = input.nextInt();
		
		//Checks the year to see if its a leapyear
		boolean leapyear = (year % 4 == 0) && (year % 10 != 0) || (year % 400 == 0);
		
		//Determines the number of days according to the number of month
		switch(month)
		{
		case 1: days = 31;
		break;
		
		case 2: days = 28;
		break;
		
		case 3: days = 31;
		break;
		
		case 4: days = 30;
		break;
		
		case 5: days = 31;
		break;
		
		case 6: days = 30;
		break;
		
		case 7: days = 31;
		break;
		
		case 8: days = 31;
		break;
		
		case 9: days = 30;
		break;
		
		case 10: days = 31;
		break;
		
		case 11: days = 30;
		break;
		
		case 12: days = 31;
		break;
		
		}
		
		//Checks to see if the year is a leapyear and if the user chose february during the leapyear and inputs the correct number of days
		if(leapyear)
		{
			if(month == 2)
			{
				days = 29;
			}
			
		}
		
		System.out.println("There are " + days + " in " + month + "/" + "" + year);
		
		
	}
	

	
}
