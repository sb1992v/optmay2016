package venkatesh.exceptions.assignment;
import java.util.Scanner;

public class ArithemeticExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		try {

			int output = num1 / num2;
			System.out.println("Result = " + output);
		} catch (ArithmeticException e) {
			System.out.println("You can't divide an integer by 0");
		} finally {
			System.out.println("Haandling ArithemeticException");
		}
	}

}
