import java.util.Scanner;

public class TestPet {
	
	public static void main(String[] args){
		
		Pet p = new Pet(null, null, 0);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your pet's name");
		p.name = input.nextLine();
		
		System.out.println("Please enter your pet's type");
		p.type = input.nextLine();
		
		System.out.println("Please enter your pet's age");
		p.age = input.nextInt();
		
		System.out.println("Pet object created");
		
		System.out.print("Your pet's name is " + p.name);
		
		
		System.out.print("\nYour pet's type is " + p.type);
		
		System.out.print("\nYour pet's age is " + p.age);
		
	}

}
