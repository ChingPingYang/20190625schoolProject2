package FirstProject;

import java.util.Scanner;

public class TwoNumbers {
	public static int max;
	public static int min;
	
	
	public void getNumbers(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please put two integer numbers(smaller number first, and the bigger number): ");
		System.out.println("Small int: ");
		min = input.nextInt();
		System.out.println("Bigger int: ");
		max = input.nextInt();
		
		while (min > max) {
			System.out.println("Smaller number first!");
			System.out.println("Please put them again!");
			System.out.println("Small int: ");
			min = input.nextInt();
			System.out.println("Bigger int: ");
			max = input.nextInt();
		}
	}

}
