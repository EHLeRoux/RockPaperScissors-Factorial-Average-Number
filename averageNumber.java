import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class averageNumber {
	
	/**
	 * This method returns the list of integers entered by the user using an array list to keep the numbers. The length end when the user enters 0 into the list 
	 * @return the method returns the integer list created
	 * This method keeps track of the positive integer count as well as the negative integer count and the calculates the average of the numbers as an integer. 
	 * the average will be rounded to integer
	 */
	
	public static List<Integer> userInput () { 
		int userChoice;
		List <Integer> userNumbers = new ArrayList <Integer>(); //new array list of integers
		Scanner ui = new Scanner(System.in); //scanner object
		
		//Declaration of variables used to keep track
		boolean game;
		game = true;
		int positiveCount = 0;
		int negativeCount = 0;
		int sumTotalCount = 0;
		
		while (game) {
			System.out.println("Please enter your number: ");
			userChoice = ui.nextInt();
			sumTotalCount += userChoice;
			if (userChoice == 0) { //quits program
				break;
			}
			
			if (userChoice > 0 ) { //positive numbers
				positiveCount ++; 
			}
			
			if (userChoice < 0) { //negative numbers
				negativeCount ++;
			}
			userNumbers.add(userChoice);
			
		}
		
		
		System.out.println(userNumbers);
		System.out.println("Your total sum for your numbers is " + sumTotalCount);
		System.out.println("Total number of items in list: " + userNumbers.size());
		System.out.println("The average number in your list is : " + (double) ((sumTotalCount / userNumbers.size())));
		System.out.println("Poistive numbers " + positiveCount + " Negative Numbers " +  negativeCount);
		ui.close(); //closing of the scanner object
		return userNumbers;
	}
	
	/**
	 * main method of the program where the method userInput is called and the user gets prompted to enter his numbers 
	 * @param
	 */

	public static void main(String[] args) {
			userInput(); 
	
	}

}
