package ThirdProject;

public class Calculator {
	
	public double result;
	
	public void calculator(double num1, String operater, double num2) {
		switch (operater) {
		
		case("+"):
			result = num1 + num2;
			break;
		
		case("-"):
			result = num1 - num2;
			break;
			
		case("*"):
			result = num1 * num2;
			break;
			
		case("/"):
			result = num1 / num2;
			break;
		}	
	}
	
}
