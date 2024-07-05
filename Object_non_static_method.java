package java_programs;

public class Object_non_static_method 
{
	
	void addition() 
	{
		int a = 100;
		int b = 200;
		
		int sum = a+b;
		
		System.out.println(sum);
		
	}
	
	void substract() 
	{
		
		int c = 100;
		int d = 200;
		
		int sum = d-c;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) 
	
	{
		Object_non_static_method O1= new Object_non_static_method();
		
		O1.addition();
		
		O1.substract();
		
		O1.substract();
		
		O1.addition();
		
		
	}

}
