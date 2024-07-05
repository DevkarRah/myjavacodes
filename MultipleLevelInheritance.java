package java_programs;

class delhi
{
	
	static void add()
	{
		System.out.println("Adition");
	}
}


class mumbai extends delhi

{
	static void sub()
	{
		System.out.println("Substraction");
	}
}


public class MultipleLevelInheritance extends mumbai

{
	static void mul()
	{
		System.out.println("Multiplication");
	}
	
	
	
	public static void main(String[] args) 
	
	{
		add();
		sub();
		mul();
	}
	
	
}
