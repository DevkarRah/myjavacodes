package java_programs;

import java.util.Scanner;

public class Humaninput 
{
public static void main(String[] args) 
{
//	Scanner s1 = new Scanner(System.in);
//	System.out.println("Enter a value");
//	int a = s1.nextInt();
//	System.out.println("Enter b value");
//	int b = s1.nextInt();
//	int sum = a+b;
//	System.out.println("Addition of a and b1--->"+sum);
	
	
	
	System.out.println("Enter first number");
	Scanner s1 = new Scanner (System.in);
	int a = s1.nextInt();
	System.out.println("Enter second number");
	double b = s1.nextDouble();
	System.out.println("Sum of two numbers");
	double sum = a+b;
	System.out.println(sum);
	
}
}
