package java_programs;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyBlock 
{

	public static void main(String[] args)
	{
//		int rollno[] = new int[3];
//		rollno[0] = 16;
//		rollno[1] = 20;
//		rollno[2] = 23;
//		
//		try {
//		rollno[3] = 28;
//		System.out.println("No Exception");
//		}
//		
//		catch(ArrayIndexOutOfBoundsException a1)
//		{
//			System.out.println("Handle Exception 1");
//		}
//		
//		catch(InputMismatchException  a2)
//		{
//			System.out.println("Handle Exception 2");
//		}
//		
//		catch (NullPointerException  a3)
//		{
//			System.out.println("Handle Exception 3");
//		}
//		
//		catch (IllegalFormatException  a4)
//		{
//			System.out.println("Handle Exception 4");
//		}
//		
//		finally
//		{
//			System.out.println("Finally will always execute");
//		}
		
		try 
		{
			Scanner s1 = new Scanner (System.in);
//			int b = s1.nextInt();	
//			int a = s1.nextInt();
//			double sum = a/b;
//			System.out.println(sum);
			
			System.out.println("Enter valid Age");
			int age = s1.nextInt();
			
			
		}
		
		catch ( InputMismatchException b1)
		{
	
		
			 Scanner s2 = new Scanner (System.in);
			
			System.out.println("Age must be numberic value");
			System.out.println("Enter the Valid Age");
			int age1 = s2.nextInt();
	
			}
		
		finally
		{
		System.out.println("Finally will always execute");
		}
		
		System.out.println("Please Enter your name");
		Scanner s3 = new Scanner (System.in);
		String name = s3.next();
		 System.out.println(name);
		 
		 
		
	}

}
