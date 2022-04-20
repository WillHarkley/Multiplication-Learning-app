//Multiplication learning application
//Author: William Harkley
//Class: CSIS 212-D02
/*Assignment: The use of computers in education is referred 
	to as computer assisted instruction (CAI). Write a program that will help an elementary school 
	student learn multiplication. Use a Random object to produce 2 positive 1-digit integers. The 
	program will then prompt the user with a question, such as “How much is 6 times 7?”
	The student then inputs the answer. Next, the program checks the student’s answer. If it is 
	correct, display the message “Very Good!” and ask another multiple question. If the answer is 
	wrong, display the message “No. Please try again.” And let the student try the same question 
	repeatedly until the student finally gets it right. A separate method will be used to generate each 
	new question. This method will be called once when the application begins execution and each 
	time the user answers the question correctly.
*/
//Created: 4/11/2022
//Last updated: 4/11/2022

import java.util.Scanner;
import java.security.SecureRandom;

public class WHLearnMultiplication {
	
	public static int num1;
	public static int num2;
	public static int userTotal;
	public static int total;

	public static void main(String[] args) {
		
		System.out.print("William Harkley");
		
		//Scans user inputs
		Scanner input = new Scanner(System.in);
		
		//Produces random numbers
		SecureRandom randomNumbers = new SecureRandom();
		
		
		//Asks 10 questions
		for (int counter = 1; counter <= 10; counter++)
		{
			//picks random int from 1 - 9 for the question
			num1 = 1 + randomNumbers.nextInt(9);
			num2 = 1 + randomNumbers.nextInt(9);
			
			System.out.printf("%nHow much is %d time %d: ", 
					num1,
					num2); //displays the equation
			userTotal = input.nextInt();
			
			total = num1 * num2; //calculates num1 times num2
			
			//
			if (userTotal == total) {
				System.out.println("VeryGood!");
			}
			else
			{
				System.out.println("No, please try again");
				System.out.printf("%nHow much is %d time %d: ", 
						num1,
						num2);
				
				userTotal = input.nextInt();
				
				if (userTotal == total) {
					System.out.println("VeryGood!");
				}
				else
				{
					System.out.printf("No, please try again. ", wrong());
				}
			}
			
			if (counter != 11)
				System.out.println();
		}
	}
	
	public static int wrong() {
		Scanner input = new Scanner(System.in);
		
		if (userTotal != total)
		{
			
				System.out.println("No, please try again");
				System.out.printf("%nHow much is %d time %d: ", 
						num1,
						num2);
				
				userTotal = input.nextInt();
		}
		return userTotal;
	}
}
