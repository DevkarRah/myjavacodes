package java_programs;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionTryCatchforDiffInput {

	public static void main(String[] args) 
	{
		
		try 
		{
			System.out.println("Please enter your age");
			
			Scanner s1 = new Scanner(System.in);
			int age = s1.nextInt();
			
			System.out.println("Please enter your Salary");
			double salary = s1.nextDouble();
			
			System.out.println("Please enter your Weight");
			float weight = s1.nextFloat();
			
			System.out.println("Are your a Student");
			boolean student = s1.hasNextBoolean();
			
			
		}
		catch (InputMismatchException a1)
		{
			System.out.println("Please fill the form again");
		}
		
		

	}

}
