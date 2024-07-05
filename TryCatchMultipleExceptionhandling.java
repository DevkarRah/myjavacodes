package java_programs;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class TryCatchMultipleExceptionhandling {

	public static void main(String[] args) 
	{
		int rollno[] = new int[3];
		rollno[0] = 16;
		rollno[1] = 20;
		rollno[2] = 23;
		
		try {
		rollno[3] = 28;
		System.out.println("No Exception");
		}
		
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Handle Exception 1");
		}
		
		catch(InputMismatchException  a2)
		{
			System.out.println("Handle Exception 2");
		}
		
		catch (NullPointerException  a3)
		{
			System.out.println("Handle Exception 3");
		}
		
		catch (IllegalFormatException  a4)
		{
			System.out.println("Handle Exception 4");
		}
		
	}

}
