package java_programs;

class Method_Parent
{
	void login ()
	{
 
	System.out.println("Login from mobile no.");
	}
}

public class MethodOverriddingInheritance extends Method_Parent
{
	void login ()
	
	{
		
		System.out.println("Login from email id");
		super.login();
	}
	

	public static void main(String[] args) 
	{
		MethodOverriddingInheritance m1 = new MethodOverriddingInheritance ();
		m1.login();
		System.out.println("Q");
	}
}
