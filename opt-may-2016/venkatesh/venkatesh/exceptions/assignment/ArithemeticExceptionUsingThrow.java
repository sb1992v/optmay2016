package venkatesh.exceptions.assignment;

public class ArithemeticExceptionUsingThrow {

	public static double divide(double x,double y)
	{
		double result=0.0;
		result=x/y;
		if(y==0)
		{
			throw new ArithmeticException("you cannot divide by zero");
		}
		
		
		return result;
	}
	
	public static void main(String[] args)
	{
		divide(5,0);
	}
	
}
