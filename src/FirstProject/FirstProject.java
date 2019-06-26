package FirstProject;
import java.util.Random;
import java.util.Scanner;

public class FirstProject {
	

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Bring in method for getting two numbers.
		TwoNumbers getNumbers = new TwoNumbers();
		getNumbers.getNumbers();
		
		//Bring in method for generating random number. 
		RandomNums setRandomNums = new RandomNums();
		setRandomNums.setRam();
		
		//Enhanced for loop, loop thought 
		for (int x: setRandomNums.randomNums) {
			System.out.println(x);
		}
	}
	
	
}
