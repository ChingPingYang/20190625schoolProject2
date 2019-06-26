package ThirdProject;
import java.util.Scanner;

public class Third_Operater {
	
	public static double firstNum;
	public static double secondNum;
	public static String operator;
	public static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Please give me two numbers and one operater.");
		System.out.println("First Number: ");
		String fakeNum1 = input.nextLine();
		
		CheckNum numberOrNot = new CheckNum();
		while (!numberOrNot.numberOrNot(fakeNum1)) {
			System.out.println("Please only put digit.");
			fakeNum1 = input.nextLine();
		}		
		firstNum = Double.parseDouble(fakeNum1);
		
		
		System.out.println("Second Number: ");
		String fakeNum2 = input.nextLine();
		
		while(!numberOrNot.numberOrNot(fakeNum2)) {
			System.out.println("Please only put digit.");
			fakeNum2 = input.nextLine();
		}
		secondNum = Double.parseDouble(fakeNum2);
		
		
		System.out.println("Operater: ");
		operator = input.next();
		
		Operator checkOperator = new Operator();
		while (!checkOperator.isOperater(operator)) {
			System.out.println("Please only give one out of \"+, -, *, /\".");
			operator = input.next();
		}
		
		
		Calculator calculator = new Calculator();
		calculator.calculator(firstNum, operator, secondNum);
		
		System.out.println("The result of your first number " + operator + " your second number is: " + calculator.result );
		
	}
}

  