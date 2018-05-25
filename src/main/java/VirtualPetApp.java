import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		char char1;
		System.out.println("Welcome to the Retrojb \n Virtual Pet App");
		System.out.println("What would you like to name your pet \n"
				+ "Capuchin Monkey?");
		
		String petName = input.nextLine();
		//convert first letter to uppercase.
		char1 = Character.toUpperCase(petName.charAt(0));
		petName = char1 + petName.substring(1);
		
		System.out.println(petName +" the capuchin monkey!");
		System.out.println("");
		
		
		

	}

}
