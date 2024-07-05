package java_programs;

public class Call_Method_in_Main 
{
	
	static void addition () 
	{ 
		int a = 2;
		int b = 3;
			
		int sum = a+b;
		System.out.println(sum);
	}
	
	static void subtraction ()  
	{ 
		int a = 2;
		int b = 3;
			
		int sum = a-b;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("INDIA");
		subtraction ();
		addition ();
		
	}

}
