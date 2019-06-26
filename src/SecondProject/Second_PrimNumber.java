package SecondProject;

import java.util.Scanner;
import java.util.ArrayList;
public class Second_PrimNumber {

	public static int userNum;
	public static ArrayList<Integer> listOfPrimes = new ArrayList<Integer>();
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		CheckingPrime prime = new CheckingPrime();
		
		System.out.println("Pleae put a prime number: ");
		
		userNum = input.nextInt();
		
		//Checking if the first input number is a prime number.
		while(!prime.checkIfIsPrime(userNum)) {
			System.out.println("This number is not a prime number.\n Please try again: ");
			userNum = input.nextInt();
		}
		
		//If the input is prime. Then put all the prime number before it inside an ArrayList.
		for (int j = 2; j <= userNum; j++) {
			if (prime.checkIfIsPrime(j)) {

				listOfPrimes.add(j);
			}
		}
		
		System.out.println("Blow, are all prime numbers before your number(include your number).");
		
		//This is an Enhanced for loop for printing numbers from ArrayList.
		for(int x: listOfPrimes) {
			System.out.println(x);
		}

	}
}
