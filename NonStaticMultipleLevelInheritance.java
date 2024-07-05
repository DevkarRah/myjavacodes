package java_programs;

class delhi1
{
	
	void add()
	{
		System.out.println("Adition");
	}
}


class mumbai1 extends delhi1

{
     void sub()
	{
		System.out.println("Substraction");
	}
}



public class NonStaticMultipleLevelInheritance extends mumbai1

{
	void mul()
	{
		System.out.println("Multiplication");
	}
	
	
	
	public static void main(String[] args) 
	
	{
		
		NonStaticMultipleLevelInheritance n1 = new NonStaticMultipleLevelInheritance ();
		n1.add();
		n1.sub();
		n1.mul();
	}
	
	
}
