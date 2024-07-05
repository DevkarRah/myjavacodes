package java_programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch_Exception 
{
    static Scanner s1 = new Scanner (System.in);
	public static void main(String[] args) 
	
	{
//		int a = 10/0;
//		
//		System.out.println(a);
//		 
		try 
		{
//			Scanner s1 = new Scanner (System.in);
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
		
		
		System.out.println("Please Enter your name");
		Scanner s3 = new Scanner (System.in);
		String name = s3.next();
		 System.out.println(name);
		
		
	}
	
}
