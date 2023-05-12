import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class FightingMain {

	public static void main(String[] args) {
		int userHealth = 200;
		int oppHealth = 200;
		boolean game = true;
		
		//runs game as long as boolean is true
		while(game) {
			
			boolean loop = true;
			//while loop which loops prompt question to user after typing wrong input, instead of going through with the attack
			while(loop) {
			
			//use of try statement to catch and throw exceptions in case of wrong user input
			try {
				
				System.out.println("Type 1 to punch your opponent");
				System.out.println("Type 2 to punch your opponent");
				
				Scanner scnr = new Scanner(System.in);
				int num1 = scnr.nextInt();
				
				//if user input is 1, then a message prompt appears to notify user
				if(num1 == 1) {
					
					System.out.println("SMACK!, you puched your opponent");
					System.out.println(" ");
					
					//use of random class to select throw different cases so not all punches and kicks do the same damage
					Random rng = new Random();
					
					int punch;
					
					punch = rng.nextInt(5);
					switch(punch) {
						
						case 0:
							for(int i = 1; i <= 25; i++) {
								oppHealth--;
							}
							
							break;
							
						case 1:
							for(int i = 1; i <= 25; i++) {
								oppHealth--;
							}
					
							break;

						case 2:
							for(int i = 1; i <= 25; i++) {
								oppHealth--;
							}
				
							break;

						case 3:
							for(int i = 1; i <= 25; i++) {
								oppHealth--;
							}
						
							break;

							//critical base case to swtich attack damage
						case 4:
							for(int i = 1; i <= 50; i++) {
								oppHealth--;
							}
							System.out.println("You punched your opponents");
							System.out.println("You feel stronger! Critical Hit");
							break;
							
							//default incase it goes to the 6th case
							default:
								break;
	
					}
					
					
					//similar methodology for kick attack
				} else if(num1 == 2) {
					
					System.out.println("You kicked your opponent");
					System.out.println(" ");
					
					Random rng2 = new Random();
					int kick;
					
					
				}
				System.out.println("Your opponent health is " + oppHealth);
				System.out.println(" ");
				
				//if opponent health goes below or equals to 0, the user wins and game returns false thus stopping it
				if(oppHealth <= 0) {
					System.out.println("YOU WIN BY KNOCKOUT!");
					game = false;
					System.exit(0);
				}else {
					
					break;
				}
			}
			//catches a wrong input from user
			catch(InputMismatchException e) {
				System.err.println("Wrong input, try again");
				} 
			
			} 
			
			
			// opponents attack 
			
			Random rng3 = new Random();
			int attack;
			attack = rng3.nextInt(6);
			
			switch(attack) {
			case 0: 
				System.out.println("OUCH! your opponent punched you");
				System.out.println("Your opponent delt 25 damage");
				System.out.println(" ");
				
				for(int i = 1; i <= 25; i++) {
					userHealth--;	
				}
				break;
				
			case 1: 
				System.out.println("OUCH! your opponent punched you");
				System.out.println("Your opponent delt 25 damage");
				System.out.println(" ");
				
				for(int i = 1; i <= 25; i++) {
					userHealth--;	
				}
				break;
				
			case 2: 
				System.out.println("OUCH! your opponent punched you");
				System.out.println("BAM! Critical Hit!");
				System.out.println("Your opponent delt 55 damage");
				System.out.println(" ");
				
				for(int i = 1; i <= 50; i++) {
					userHealth--;	
				}
				break;
				
			case 3:
				System.out.println("DOOM! your opponent kicked you!");
				System.out.println("Your opponent delt 15 damage");
				System.out.println(" ");
				
				for(int i = 1; i <= 15; i++) {
					userHealth--;	
				}
				break;
				
			case 4:
				System.out.println("DOOM! your opponent kicked you!");
				System.out.println("Your opponent delt 15 damage");
				System.out.println(" ");
				
				for(int i = 1; i <= 15; i++) {
					userHealth--;	
				}
				break;
				
			case 5:
				System.out.println("DOOM! your opponent kicked you!");
				System.out.println("BAM! Super Critical Hit!");
				System.out.println("Your opponent delt 60 damage");
				System.out.println(" ");
				
				for(int i = 1; i <= 60; i++) {
					userHealth--;	
				}
				break;
		
		
				//incase random goes to 7th case
			default:
				break;
				
			}
			
			System.out.println("Your health is " + userHealth);
			
			if(userHealth <= 0) {
				System.out.println("You lose, try again!");
				System.out.println(" ");
				
				game = false;
				
			} else if(userHealth >= 1) {
				
				game = true;
				
			}			
		}
	}
		
}


