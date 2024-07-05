package java_programs;

public class Custructor_Overloading 
{
	
	Custructor_Overloading (int a)
	{
		System.out.println("Int datatype");
		
	}
	Custructor_Overloading (boolean b)
	{
		System.out.println("boolean datatype");
		
	}
	Custructor_Overloading (char c)
	{
		System.out.println("Char datatype");
		
	}
	Custructor_Overloading (String d)
	{
		System.out.println("String datatype");
		
	}
	
	public static void main(String[] args) 
	{
		
//		Custructor_Overloading c1 = new Custructor_Overloading ("RAHUL_DEVKAR");
//		Custructor_Overloading c2 = new Custructor_Overloading ('b');
//		Custructor_Overloading c3 = new Custructor_Overloading (11);
//		Custructor_Overloading c4 = new Custructor_Overloading (false);
		
		System.out.println("RAHUL");
		
		
		new Custructor_Overloading ("RAHUL_DEVKAR");
		new Custructor_Overloading ('b');
		new Custructor_Overloading (11);
		new Custructor_Overloading (false);
	}
	
	
	
	
}
