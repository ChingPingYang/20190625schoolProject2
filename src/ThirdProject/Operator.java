package ThirdProject;

public class Operator {
	
	public boolean isOperater(String operator) {
		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
