package java_programs;

import java.util.Scanner;

public class ScannerClass_Circumference_of_Circle 
{
	public static void main(String[] args) 
	{
		Double pi= Math.PI;
		System.out.println("Enter radius");
		Scanner s1 = new Scanner (System.in);
		Double r = s1.nextDouble();
		
		
		Double Circumference = 2* pi* r;
		
		System.out.println("Circumference of circle is ---> ");
		System.out.println(Circumference);
	}
}
