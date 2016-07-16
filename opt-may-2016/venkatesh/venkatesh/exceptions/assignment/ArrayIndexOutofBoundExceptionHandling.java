package venkatesh.exceptions.assignment;

public class ArrayIndexOutofBoundExceptionHandling {

	public static void main(String[] args)
	{
		System.out.println("enter 3 colours");
		String[] colors={"red","blue","green"};
		
		try
		{
			for(int i=0;i<=colors.length;i++)
			{
				System.out.println(colors[i]);
			}
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.out.println("Array index exceeded");
		}
	}
	
	
}
