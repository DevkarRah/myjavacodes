package java_programs;

public class ThrowExceptionClassTryandCatch 
{

	public static void main(String[] args) 
	
	{
    
      
		try{
			int a = 1/1; // b from parent class and c from grand parent class
			System.out.println(a);
			}
		
		catch( ArithmeticException a1) 
			{
			
			System.out.println("Handle the exception");
			 }

	}
}

