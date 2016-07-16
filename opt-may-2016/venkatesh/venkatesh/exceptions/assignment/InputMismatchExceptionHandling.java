package venkatesh.exceptions.assignment;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionHandling {

	public static void main(String[] args) {
		System.out.println("please enter 2 numbers");
		Scanner input = new Scanner(System.in);
		int[] a = new int[2];
		try {
			for (int i = 0; i < 2; i++) {
				a[i] = input.nextInt();
			}
			for (int i = 0; i < 2; i++) {
				System.out.println(a[i]);
			}
		} catch (InputMismatchException e) {
			System.out.println("please enter only numbers");
		}

	}

}
