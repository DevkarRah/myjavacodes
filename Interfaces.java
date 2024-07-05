package java_programs;

interface Email
{
	
	void login_with_email_id ();
	
}

interface mobile
{
	void login_with_mobile_no ();
}


public class Interfaces implements Email, mobile
{

	public void login_with_email_id()
	{
		System.out.println("login_with_email_id1");
	}
	
	public void login_with_mobile_no()
	{
		System.out.println("login_with_mobile_no1");
	}
	
	public static void main(String[] args) 
	{ 
		Interfaces i1 = new Interfaces();
		
		i1.login_with_email_id();
		i1.login_with_mobile_no();
	}
	
	
}
