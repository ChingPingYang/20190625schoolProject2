package FirstProject;

import java.util.Random;
import java.util.Scanner;

public class RandomNums {
	
	public int numBetween;
	public int[] randomNums;
	public Scanner input = new Scanner(System.in);
	
	
	public void setRam() {
		TwoNumbers getNumbers = new TwoNumbers();
		System.out.println("How many number do you want to get between these two numbers?: ");
		numBetween = input.nextInt();
		while (numBetween > ((getNumbers.max - getNumbers.min) - 1)) {
			System.out.println("Can't not be more than the total number between these two numbers");
			System.out.println("Please insert again: ");
			numBetween = input.nextInt();
		}
		
		Random a = new Random();
		randomNums = new int[numBetween];
		for (int i = 0; i < randomNums.length; i++) {
			randomNums[i] = a.nextInt((getNumbers.max - getNumbers.min) -1) + (getNumbers.min + 1);
		}
	}
	
	
}
