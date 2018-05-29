import java.util.Scanner;
public class ButtonController {
	Scanner input = new Scanner(System.in);
	virtualPet pet = new virtualPet();

	 String userSelectButtonOne = "1";
	String userSelectButtonTwo = "2";
	String userSelectButtonThree = "3";
	String userSelectButtonFour = "4";
	
	public void buttonOne (String userSelectButtonOne) {
		if (userSelectButtonOne.equals("1")) {
			pet.feedMeat =+ pet.hungerBase;
			return;
		} else if (userSelectButtonTwo.equals("2")) {
			pet.feedBerries =+ pet.hungerBase;
			return;
		} else if (userSelectButtonThree.equals("3")) {
			pet.feedJunk =+ pet.hungerBase;
			return;
		} else {
			return;
		}
		
	}
}

	
	
		
//		String userMenuResponse = input.nextLine();
//		while (!userMenuResponse.equals("1") && !userMenuResponse.equals("2")) {
//			System.out.println("That is not a valid option. Please try again.");
//			System.out.println("Press 1 to deposit funds");
//			System.out.println("Press 2 to withdrawl funds");
//			userMenuResponse = input.nextLine();
//		}
//		if (userMenuResponse.equals("1")) {
//			System.out.println("Please enter a deposit amount:  ");
//			BigDecimal depositAmount = input.nextBigDecimal();
//			System.out.println("Your deposit of " + depositAmount + " was successful.");
//			System.out.println("Your balance is now " + atm.deposit(depositAmount));	
//		}
//		else if (userMenuResponse.equals("2"))
//		{
//			System.out.println("Please enter a withdrawl amount:  ");
//			BigDecimal withdrawlAmount = input.nextBigDecimal();
//			System.out.println("Your withdrawl of " + withdrawlAmount + " was successful.");
//			System.out.println("Your balance is now " + atm.withdrawl(withdrawlAmount));
//		}
//		
//		
//		
//	} else {
//		System.out.println("That PIN is incorrect...");
//	}
//	
	




