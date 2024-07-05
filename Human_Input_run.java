package java_programs;

import java.util.Scanner;

public class Human_Input_run 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter value of A"); 
		Scanner s1 = new Scanner (System.in);
		
		int a = s1.nextInt();
		String b = s1.next();  
		short c = s1.nextShort();
		byte d =s1.nextByte();
		long e = s1.nextLong();
		boolean f = s1.nextBoolean();
		float g = s1.nextFloat();
		double h = s1.nextDouble();
		
	System.out.println("Addition of numbers"); 	
	int sum = a+c;
	System.out.println(sum); 
	System.out.println("Substraction of numbers"); 	
	int sub = a-d;
	System.out.println(sub);
	System.out.println("multiplication of numbers"); 	
	int mul = a*d;
	System.out.println(mul); 
	System.out.println("Division of numbers"); 	
	int div = a/c;
	System.out.println(div); 
	String RD = b;
	System.out.println(RD); 
}
}