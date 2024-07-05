package java_programs;

public class Local_and_Global_var {
	
	int age=10; /// age is local var to call it in main method we need to create object.
	static String name ="rahul"; //// name is global variable
//	static String name ;
	static double salary = 90000.33;
	
			static void add()
			{
		
			}
			
			
	public static void main(String[] args) 
	{
		name= "sage"; //// name is Local variable
				
				System.out.println(name);
				
				System.out.println(salary); // under static variable which can be call directly in main method.
				
				Local_and_Global_var l1 = new Local_and_Global_var ();
				System.out.println(l1.age);
	}
	
	

}
