package ThirdProject;

public class CheckNum {
	
	
	public boolean numberOrNot(String fakeNumber) {
		try 
		{
			Double.parseDouble(fakeNumber);
			return true;
		}
		catch (Exception E) 
		{
			return false;
		}
	}	
}
