package venkatesh.exceptions.assignment;
import java.util.Date;

public class NullPointerExceptionHandling {

	public static void main(String[] args)
	{
		Date d =new Date();
		d=null;
		try
		{
			System.out.println(d.getTime());
		}
		catch(NullPointerException ex)
		{
			System.out.println("object refering to null");
		}
		finally
		{
			System.out.println("Handling NullpointerException");
		}
		
	}
	
}
