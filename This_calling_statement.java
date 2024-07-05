package java_programs;

public class This_calling_statement 
{
	This_calling_statement (int a)
	{
		System.out.println(a+100);
	}
	This_calling_statement (int a,int b)
	{
		this (100);
		System.out.println(a+b);
	}
	This_calling_statement (int a,double c)
	{
		this (10,20);
		System.out.println(a+c);
	}
	public static void main(String[] args) 
	{
		This_calling_statement t1 = new This_calling_statement (10,2.3);
		
		
	}
	
	
	
}
