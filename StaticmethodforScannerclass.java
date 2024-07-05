package java_programs;

import java.util.Scanner;

public class StaticmethodforScannerclass 
{
	static Scanner s1 = new Scanner(System.in);
	
	
	static void add()
	{
		int a = s1.nextInt();
		int b = s1.nextInt();
		
		System.out.println("Addition of numbers"); 	
		int sum = a+b;
		System.out.println(sum); 
		
	}
	
	static void sub()
	{
		int a = s1.nextInt();
		int b = s1.nextInt();
		
		System.out.println("Substraction of numbers"); 	
		int sub = a-b;
		System.out.println(sub);
	}
	
	static void mul()
	{   
		int a = s1.nextInt();
		int b = s1.nextInt();
		
		System.out.println("multiplication of numbers"); 	
		int mul = a*b;
		System.out.println(mul); 
		
	}
	
	static void div()
	{   
		int a = s1.nextInt();
		int b = s1.nextInt();
		
		System.out.println("Division of numbers"); 	
		int div = a/b;
		System.out.println(div); 
		
	}
public static void main(String[] args) 
{
	add();
	sub();
	mul();
	div();
	
}

}
