import java.util.Scanner;

public class VirtualPetApp {

	private static void tick(virtualPet pet, String actionChoice, String petName) {
		if (actionChoice.equals("1")) {
			pet.feed();

			System.out.println("You feed " + petName + "\nHunger level is: " + pet.hunger);

			System.out.println("Rest was effected now at: " + pet.rest);

			System.out.println("");

		} else if (actionChoice.equals("2")) {
			pet.drink();

			System.out.println("You gave " + petName + " something to drink.\nThirst level is:" + pet.thirst);
			System.out.println("Play was effected now at: " + pet.play);

			System.out.println(" ");

		} else if (actionChoice.equals("3")) {
			pet.sleep();

			System.out.println(petName + " is taking a nap \nRest level is " + pet.rest);
			System.out.println("Hunger was effected now at: " + pet.hunger);

			System.out.println(" ");

		} else if (actionChoice.equals("4")) {
			pet.play();

			System.out.println("You played with " + petName + "\nPlay level is at: " + pet.play);

			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		virtualPet pet = new virtualPet();
		char char1;
		System.out.println("Welcome to the Retrojb \n Virtual Pet App");
		System.out.println("What would you like to name your pet \n" + "Capuchin Monkey?");
		String petName = input.nextLine();
		// convert first letter to uppercase.
		char1 = Character.toUpperCase(petName.charAt(0));
		petName = char1 + petName.substring(1);

		System.out.println(petName + " the capuchin monkey!");
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// We've been interrupted: no more messages.
			return;
		}

		System.out.println("");
		System.out.println("Stats: based on a scale of 0 - 100");
		System.out.println("Don't allow the stats get to high or to low");
		System.out.println("");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// We've been interrupted: no more messages.
			return;
		}
		System.out.println("Hunger: " + pet.hunger);
		System.out.println("Thrist: " + pet.thirst);
		System.out.println("Tiredness: " + pet.rest);
		System.out.println("Playfulness: " + pet.play);
		System.out.println(" ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			return;
		}

		System.out.println("What would you like to do \nwith " + petName + " the capuchin monkey?");
		System.out.println(" ");

		for (int count = 0; count < 20; count++) {

			System.out.println("Press 1: Feed " + petName);

			System.out.println("Press 2: Give " + petName + " something to drink");

			System.out.println("Press 3: Let " + petName + "take a break");

			System.out.println("Press 4: Play with " + petName);

			String actionChoice = input.nextLine();
			tick(pet, actionChoice, petName);

		}
		System.out.println("GAME OVER SUCKA!");
		input.close();
	}
}

	

