package venkatesh.exceptions.assignment;
import java.util.Scanner;

public class NumberFormatExceptionHandling {

	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner input =new Scanner(System.in);
		String s=input.next();
		try{
			
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Interger not in right format");
		}
	}
	
	
}
