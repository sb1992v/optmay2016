package venkatesh.exceptions.assignment;
import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your age");
		Scanner input=new Scanner(System.in);
		
		int age=input.nextInt();
		try
		{
		if(age<0)
		{
			throw new AgeNotValidException("Age can't be less than 0");
		}
		else
		{
			System.out.printf("your %d years old",age);
		}
		}
		catch(AgeNotValidException ex)
		{
			System.out.println("age is not valid");
		}
		
		
	}

}
