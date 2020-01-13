
/**
 * All the imports I am using, the hash map object, Scanner object and map object
 */
import java.util.HashMap; 
import java.util.Map;
import java.util.Scanner;


public class rockPaperScissors {
	
	
	public static int choice () { 
		
		/**
		 * Creates a new Scanner object to get user input 
		 * declares variable and waits for the next integer input 
		 * returns the userChoice 
		 */
		int userChoice;
		Scanner ui = new Scanner(System.in);
		System.out.println("Please choose between 0: Scissors 1: Rock 2: Paper"); 
		userChoice = ui.nextInt();

		
		if (userChoice > 2 || userChoice < 0) { 
			System.out.println("You have chosen incorrect, please choose between 0: Scissors 1: Rock 2: Paper");
			userChoice = ui.nextInt();
			
		} 
			return userChoice;
		
	}
	
	/**
	 * This method is used to generate a random number for the computer to play
	 * @return returns the computer's random selection of a number between 1 and 3
	 */
	public static int computerChoice() { 
		
		int computerChoice  = (int) (Math.random() * 3);
		//System.out.println(computerChoice);
		return computerChoice;
	}
	
	/**
	 * This method creates a hash map of type Integer and type String with keys and values, so that when an integer enters the map we can get the corresponding value for the choice (String).
	 * @param key The key parameter is either 0,1 or 2 which corresponds to the value scissors, rock and paper
	 * @return the method returns the key map value that corresponds with the key
	 */
	public static Object hash(int key) {
		 Map<Integer, String> keyMap = new HashMap<Integer, String>(); 
		 keyMap.put(0, "Scissors");
		 keyMap.put(1, "Rock");
		 keyMap.put(2, "Paper");

	      return (keyMap.get(key));
	}
	
	/**
	 * This method determines which player won, by taking in two parameters(the user's and the computer's) to determine whether it is a win, draw or loss
	 * @param userChoice the first parameter takes in the user's decision 
	 * @param computerNum the second parameter takes in the computer's decision
	 * This method then prints out the corresponding results from the decisions.
	 */
	
	public static void victory (int userChoice, int computerNum) {
		
		System.out.println("User has chosen " + hash(userChoice) + " Computer has chosen " + hash(computerNum));
		if (userChoice == 0 && computerNum == 1) { 
			System.out.println("Computer won"); 
		}
	    if (userChoice == 0 && computerNum == 0) { 
			System.out.println("Draw");
	    }
	    
	    if (userChoice == 0 && computerNum == 2) { 
	    	System.out.println("User Won");
	    }
	    
	    if (userChoice == 1 && computerNum == 0) {
	    	System.out.println("User won");
	    	
	    }
	    
		if (userChoice == 1 && computerNum == 1) {
			System.out.println("Draw");
			    }
		
		if (userChoice == 1 && computerNum == 2) {
			System.out.println("Computer won");
		}
		
		if (userChoice == 2 && computerNum == 0) {
		    	System.out.println("Computer won");
		    }
		    
		if (userChoice == 2 && computerNum == 1) {
			System.out.println("User won");    	
				    }
			
		if (userChoice == 2 && computerNum == 2) {
			System.out.println("Draw");
			}
		
	}

	
	/**
	 * This is the main method where a game loop will begin and ask the user repeatedly for an input, the game will run for 20 turns
	 * @param args
	 */
	public static void main(String[] args) {
		int games = 20;
		int i = 0;
		while(i < games) {
			victory(choice(), computerChoice());
			i = i +1;
		}
		

		
		
	}

}
