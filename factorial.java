import java.util.Scanner;

public class factorial {
	
	/**
	 * Sets a variable equal to 1 and enters a for loop that keeps track of the sum of the numbers multiplied with one another
	 * @param fac takes a integer input for the factorial that the user wants
	 */
	public static void number(int fac) { 
		int sum = 1;
		for (int i = 2; i < fac + 1; i++) { //the fac  + 1 is to make the loop go up until the last number, otherwise it will stop at (N-1)
			System.out.println(sum + " X " + i);
			sum = sum * i;
			
			}
			System.out.println("The factorial of " + fac + " is " + sum);
			
		}
		
	
	/**
	 * Main method where a scanner object is created and asks the user to enter a number
	 * @param args
	 * after the user entered the number the number method is called and the factorial is calculated with the method.
	 */
	public static void main(String[] args) {
		int userChoice = 0;
		Scanner userNumber = new Scanner(System.in);
		System.out.println("Please insert your number");
		userChoice = userNumber.nextInt();
		number(userChoice);
		userNumber.close();

	}

}
